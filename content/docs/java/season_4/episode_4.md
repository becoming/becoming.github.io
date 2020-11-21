---
weight: 4
bookFlatSection: true
title: "Episode 4, Create controllers"
---

# Episode 4, Create controllers

[Season 4, Spring time](/docs/java/season_4/)

Now we need to create the HTTP API
 - Hyper Text Transfer Protocol
 - Application Programming Interface



## Using Intellij Idea and maven

1. Open the `maven` panel (*on the to the right*).
1. You'll see the name of your project.
1. Now we'll use maven to build.
1. Navigate to `Lifecycle` and double-click on `package`.
1. The `Run` panel will open at the bottom of the IDE and will show you the logs from this action.
1. It'll take a while till the action will finish, in the end you'll see a message saying `BUILD SUCCESS`
1. In the `maven` panel navigate to `Plugins / spring-boot` and double click on `spring-boot:run`
1. This will open the `Run` panel, and you'll see lots of logs, and in 2-15 seconds your app will start, 
depending on the machine you use.

## Using command line and maven

1. `cd` into the projects root folder, where the `pom.xml` file is residing
1. Type `mvn clean package`
1. Press `Enter`
1. Once `BUILD SUCCESS`
1. Type `mvn sring-boot:run`
1. Press `Enter`

## What if build fails ?

1. Your build might fail because of missing or failing dependency related to `jsonway / jsonpath`
1. Open `pom.xml` file
1. Find this block
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
    <exclusions>
        <exclusion>
            <groupId>org.junit.vintage</groupId>
            <artifactId>junit-vintage-engine</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```
1. Add this extra exclusion
```xml
<exclusion>
    <groupId>com.jayway.jsonpath</groupId>
    <artifactId>json-path</artifactId>
</exclusion>
```
1. So that the complete block looks like this
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
    <exclusions>
        <exclusion>
            <groupId>org.junit.vintage</groupId>
            <artifactId>junit-vintage-engine</artifactId>
        </exclusion>
        <exclusion>
            <groupId>com.jayway.jsonpath</groupId>
            <artifactId>json-path</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```
1. Rebuild the project with the `package` step described above.