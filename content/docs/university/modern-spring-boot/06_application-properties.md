---
weight: 6
bookFlatSection: true 
title: "Episode 6, application.properties"
---

# Episode 6, application.properties

The default application.properties file is empty. This is fine, however, I would suggest to add the following properties out of the box to improve the experience with it : 

_`app.` prefix is used only for your apps specific settings_

{{< expand "application.properties - initial setup" >}}
```properties
# Application name is taken from pom.xml
spring.application.name=@project.artifactId@

# Default CORS settings is wide open, should be changed for production
app.api.cors=*

# Variables taken from pom.xml
info.app.name=@project.artifactId@
info.app.version=@project.version@
info.app.encoding=@project.build.sourceEncoding@
info.app.java.source=@java.version@
info.app.java.target=@java.version@

# Let actuator endpoints be easier to access
management.endpoints.web.cors.allowed-origins=${app.api.cors}

spring.jpa.generate-ddl=false
spring.jpa.hibernate.ddl-auto=none
spring.jpa.open-in-view=false

# Reduce the logs
logging.level.org.springframework.scheduling.concurrent=warn
logging.level.org.springframework.context.support=warn
logging.level.org.springframework.boot.actuate.endpoint.web=warn
logging.level.org.springframework.data.repository.config=warn
logging.level.org.springframework.web.servlet.DispatcherServlet=warn
logging.level.org.springframework.web.context=warn
logging.level.com.zaxxer.hikari=warn
logging.level.org.apache.catalina.core.StandardService=warn
logging.level.org.apache.catalina.core.ContainerBase=warn
logging.level.org.springframework.orm.jpa=warn
logging.level.org.hibernate=warn
logging.level.liquibase=warn
logging.level.org.springframework.security=warn
logging.level.org.springframework.cloud.consul=debug
```
{{< /expand >}}

You can add as well Git information :
- https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#howto-git-info
- https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#production-ready-application-info-git
