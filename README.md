# Introduction

This is unofficial Venmo Java SDK implmented by wrapping https://github.com/mmohades/VenmoApiDocumentation

# Usage

1. Add my Github repo as your maven source
```
<repositories>
    <repository>
        <id>vicdus-venmo-unofficial-sdk</id>
        <name>Venmo Unofficial SDK</name>
        <url>https://vicdus.github.io/venmo-sdk/maven-repo/</url>
    </repository>
</repositories>
```

2. Add dependency

```
<dependencies>
    <dependency>
        <groupId>com.itranswarp.rich</groupId>
        <artifactId>how-to-become-rich</artifactId>
        <version>1.0.0</version>
    </dependency>
</dependencies>
```

3. Code



# Developer guide
How to develop this SDK
## Add API or fields
Make changes to `./src/main/proto/Venmo.proto`
Then use it in `./src/main/java/com/venmo/unofficial/VenmoClient.java`


# Build

```shell
mvn clean protobuf:compile compile
```


# Release

Bump version, and
```shell
mvn clean protobuf:compile compile package deploy
```
