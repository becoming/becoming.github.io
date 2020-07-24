---
weight: 1
bookFlatSection: true
title: "Episode 1, start.spring.io"
---

# Episode 1, start.spring.io

[Season 4, Spring time](/docs/java/season_4/)

In order to create a real life app, we need to setup lots of tools. When you start learning all of this setup is a lot to handle.
So you'll use a tool that helps with it, called: [start.spring.io](https://start.spring.io)

Here's what you'll do:

1. Navigate to [start.spring.io](https://start.spring.io).
1. Take 20 min to study what options you have, just.. click on things, read words, have good time.
1. Now
1. We need to set up the *must have* parts:
    1. Project **Maven Project**.
    1. Language **Java**.
    1. Spring Boot **2.3.1**.
        - or another recent version that has only numbers and no words like M1, SNAPSHOT.
    1. Project Metadata:
        1. **Group** `tech.becoming`.
            - as you see is a domain name with words ordered backwards.
        1. **Artifact** `file-service`.
            - this is a technical name.
        1. **Name** `File Service`.
            - this is a human friendly name.
        1. **Description** `A web service capable of managing files inside a folder and exposes a REST API`. 
        1. **Package name** `tech.becoming.files`.
            - here we start to organize classes in folders called "*packages*" and this is the root one.
        1. **Packaging** `Jar`.
            - not related to package name, this is the archive format for your application. 
        1. **Java** `11`.
            - this is the version of the Java Development Kit JDK, not the language. 
            - we are going only for Long Term Support LTS ones versions.
            - here's the list of LTSes https://adoptopenjdk.net/.
1. Now let's move to **Dependencies**.
1. Click on "*Add Dependencies*" and search for: `Spring Web`, `Spring Boot Actuator`, `Spring Configuration Processor`.
1. Click on **Generate** (*or press `Ctrl + Enter`*).
1. You'll be proposed to download an archive that'll contain your the structure of your project.
1. Then you'll obey my friend, this archive is a good thing for your mental health.
1. Extract the contents of the archive
    - Typically `IdeaProjects`