package com.venmo.client;

import java.net.URI;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.GsonBuilder;
import com.venmo.*;

public class VenmoClient extends ClientBase {

    public VenmoClient(String accessToken) {
        super(accessToken);
    }

    public final SearchUserResponse SearchUser(String username) {
        SearchUserResponse.Builder b = SearchUserResponse.newBuilder();
        String resource = "users";
        get(resource, Map.of("type", "username", "query", username), b);
        return b.build();
    }

    public final GetUserResponse GetUser(String id) {
        GetUserResponse.Builder b = GetUserResponse.newBuilder();
        String resource = String.format("users/%s", id);
        get(resource, Collections.emptyMap(), b);
        return b.build();
    }

    public final GetStoriesResponse GetStories(String id) {
        GetStoriesResponse.Builder b = GetStoriesResponse.newBuilder();
        String resource = String.format("stories/target-or-actor/%s", id);
        get(resource, Collections.emptyMap(), b);
        return b.build();
    }

    public final GetStoriesResponse GetStories(Pagination pagination) {
        GetStoriesResponse.Builder b = GetStoriesResponse.newBuilder();
        get(URI.create(pagination.getNext()), b);
        return b.build();
    }

    public final GetStoriesResponse GetStoriesPrevious(Pagination pagination) {
        GetStoriesResponse.Builder b = GetStoriesResponse.newBuilder();
        get(URI.create(pagination.getPrevious()), b);
        return b.build();
    }

    public final GetMeResponse GetMe() {
        GetMeResponse.Builder b = GetMeResponse.newBuilder();
        String resource = "me";
        get(resource, Collections.emptyMap(), b);
        return b.build();
    }

    public final void PostRequestMoney(String id, double amount, Story.Audience audience, String note) {
        Map<String, Object> body = Map.of(
                "note", note,
                "amount", -amount,
                "user_id", id
        );


    }
}

