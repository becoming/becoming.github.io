---
weight: 1
bookFlatSection: true
title: "Episode 2, Spring boot"
---

# Episode 2

This time we'll start writing actual apps. We need to pick one subject and do the app for it.

Every year we pick something different:
- 2017: Spring Boot, Dropwizard, Vert.X - [File Service](https://github.com/becoming/spring-boot-vertx-dropwizard)
- 2018: Spring Boot - Gaming site
- 2019: Spring Boot, Quarkus - [Pub Management](https://github.com/becoming/pub-management)
- 2020: Spring Boot - [Click and collect](https://github.com/becoming/click-and-collect)

We'll start with https://start.spring.io

{{< expand "Dependencies we'll start with" >}}
- web
- h2
- spring-data
- actuators
- configuration processor
- lombok
- liquibase
  - You need to setup lombok to avoid it failing: 
  - [application.properties](https://gitlab.com/rodislav/miage2020/-/blob/master/click-and-collect/src/main/resources/application.properties#L1)
  - [initial changelog files](https://gitlab.com/rodislav/miage2020/-/tree/master/click-and-collect/src/main/resources/db/changelog)
{{< /expand >}}

No we'll import the app and start adding features, one by one.

{{< expand "The coding part" >}}
- Define rules for your URIs
  - create, read, delete, update - CRUD
  - What would be a good way to define URIs ?
    - REST ?! Why ?
- Create Controller functions for CRUD with `return null;` implementations
- Create a `getAllEntities` endpoint
    - Let this endpoint return all entities
    - Define the main entity
    - Create first services
    - Create the repository
- Decide on how to organize the code:
  - By layer: controllers, services, repositories, entities, etc.
  - By feature: houses, products, users (_each containing its own controllers, services, etc._)
  - Read more here: [Martin Sandin / Four Strategies for Organizing Code](https://medium.com/@msandin/strategies-for-organizing-code-2c9d690b6f33)
{{< /expand >}}

During this time we'll touch lots of patterns. 
Most of them are very basic, yet very powerful.

{{< expand "Patterns, concepts and things" >}}
- [Getting started with Spring](https://spring.io/projects/spring-boot)
- MVC - https://spring.io/guides/gs/serving-web-content/
- Spring beans
  - https://www.baeldung.com/spring-bean
  - https://reflectoring.io/spring-bean-lifecycle/
- DI 
  - https://www.baeldung.com/spring-dependency-injection
  - https://docs.spring.io/spring-framework/docs/5.2.4.RELEASE/spring-framework-reference/core.html#beans
- SOLID - Single responsibility, Open Closed, Liskov substitution, Interface segregation, Dependency inversion
- KISS - Keep it simple, stupid
- YAGNI - You ain't gonna need it
- DRY - Do not repeat yourself
{{< /expand >}}
