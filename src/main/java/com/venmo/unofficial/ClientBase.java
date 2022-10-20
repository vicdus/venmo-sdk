package com.venmo.client;

import com.google.gson.Gson;
import com.google.protobuf.Message;
import com.google.protobuf.util.JsonFormat;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.api.client.http.HttpTransport;


class ClientBase {
    protected final String accessToken;
    protected final HttpClient client;

    protected final String baseUrl;

    ClientBase(String accessToken) {
        this.accessToken = accessToken;
        this.client = HttpClient.newHttpClient();
        this.baseUrl = "https://api.venmo.com/v1";
    }

    protected void get(URI uri, Message.Builder b) {
        HttpRequest request = HttpRequest
                .newBuilder(uri)
                .header("Authorization", String.format("Bearer %s", this.accessToken))
                .GET()
                .build();
        merge(request, b);
    }

    protected void post(URI uri, Map<String, Object> body, Message.Builder b) {
        HttpRequest request = HttpRequest
                .newBuilder(uri)
                .header("Authorization", String.format("Bearer %s", this.accessToken))
                .POST(HttpRequest.BodyPublishers.ofString(new Gson().toJson(body)))
                .build();
        merge(request, b);
    }

    protected void get(String resource, Map<String, Object> params, Message.Builder b) {
        String paramUrl = params.entrySet().stream()
                .map(e -> String.format("%s=%s", e.getKey(), e.getValue()))
                .collect(Collectors.joining("&"));
        URI uri = URI.create(String.format("%s/%s?%s", baseUrl, resource, paramUrl));
        get(uri, b);
    }

    protected void post(String resource, Map<String, Object> body, Message.Builder b) {
        URI uri = URI.create(String.format("%s/%s", baseUrl, resource));
        post(uri, body, b);
    }

    private void merge(HttpRequest request, Message.Builder b) {
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JsonFormat.parser().ignoringUnknownFields().merge(response.body(), b);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
