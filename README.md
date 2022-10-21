# Introduction

This is unofficial Venmo Java SDK implmented by wrapping https://github.com/mmohades/VenmoApiDocumentation

# Usage

## 1.Add my Github repo as your maven source
```xml
<repositories>
    <repository>
        <id>vicdus-venmo-unofficial-sdk</id>
        <name>Venmo Unofficial SDK</name>
        <url>https://vicdus.github.io/venmo-sdk/maven-repo/</url>
    </repository>
</repositories>
```

## 2. Add dependency

```xml
<dependencies>
    <dependency>
        <groupId>com.venmo.unofficial</groupId>
        <artifactId>venmo-sdk</artifactId>
        <version>0.1</version>
    </dependency>
</dependencies>
```

## 3. Code
Example: 
```java
package com.moyang.test;

import com.venmo.unofficial.*;
import com.venmo.unofficial.generated.GetStoriesResponse;

public class App {
    public static void main(String[] args) {
        // See https://github.com/mmohades/VenmoApiDocumentation#login to get access token
        VenmoClient client = new VenmoClient("__YOUR_VERY_SECRET_ACCESS_TOKEN__");
        int MAX_STORIES_PAGE = 5;
        int count = 0;

        String myUserId = client.GetMe().getData().getUser().getId();

        GetStoriesResponse story = client.GetStories(myUserId);
        System.out.println(story);
        while (!story.getPagination().getNext().isEmpty() && count++ < MAX_STORIES_PAGE) {
            story = client.GetStories(story.getPagination());
            System.out.println(story);
        }
    }
}
```


# Developer guide
How to develop this SDK
## Add API or fields
Make changes to `./src/main/proto/Venmo.proto`
Then use it in `./src/main/java/com/venmo/unofficial/VenmoClient.java`


# Build
```shell
mvn clean protobuf:compile compile
```

Then submit your PR


# Release
Bump version, and
```shell
mvn clean protobuf:compile compile package deploy
```
