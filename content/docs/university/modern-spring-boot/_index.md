---
weight: 6
bookCollapseSection: true 
title: "Modern Spring Boot"
---

# Modern Spring Boot

- Java
- IDE
    - Intellij Idea
    - VSCode
    - Eclipse
    - NetBeans
- [start.spring.io](https://start.spring.io)
- Banner
    - `/src/main/ressources/banner.txt`
    - `/src/main/ressources/banner.gif`
        - ![](/university/modern-spring-boot/banner-gif.png)
        - the color palette is pretty basic, do not expect 256bit
    - `@parameters@`
    - http://patorjk.com/software/taag/#p=display&f=Big&t=becoming.tech
    - https://www.baeldung.com/spring-boot-custom-banners
- Maven
    - structure
    - parent
    - java version
    - spring boot plugin
- `/application.properties`
    - `/application-local.properties`
    - maven setting to exclude the `-local.properties`
- Configuration
    - a dedicated package with all the needed annotations there
- Properties
    - `@ConfigurationPropperties`
    - `app.` prefix
    - check lombok support
    - explain about getters and setters
    - inject a bean instead of @Value
    - show auto completion
- Configuration Processor
- Actuators
    - `@parameters@`
- Controller interfaces
    - With open api description
- Controllers call only one function
    - Show Facade
- Spring Data and JDBC Template
    - repositories for siple cases
    - `NamedParamterJdbcTemplpate` for the rest
    - Entities inheritance
      - https://www.baeldung.com/hibernate-inheritance
- OpenFeign
    - similar to spring-data
- MapStruct
    - import as interfaces, like repositories
- Lombok
- ArchUnit
    - https://www.archunit.org/
    - https://github.com/TNG/ArchUnit-Examples
    - make sure your code architecture is right

