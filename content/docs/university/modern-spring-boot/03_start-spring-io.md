---
weight: 3
bookFlatSection: true
title: "Episode 3, start.spring.io"
---

# Episode 3, start.spring.io

You can create the skeleton of your application by using : https://start.spring.io

Amongst the most used dependencies you'll want to select :
- Spring Configuration Processor
- Spring Boot Actuator
- Lombok
- Liquibase Migration
    - _First run might fail since you need to provide a default configuration for Liquibase._
- Spring Web
- OpenFeign
  - _For this you might need to add the actual implementation_
  - {{< expand "pom.xml - httpclient dependency example" >}}  
```xml
<dependency>
    <groupId>io.github.openfeign</groupId>
    <artifactId>feign-httpclient</artifactId>
</dependency>  
```
    {{< /expand >}}
- Spring Data JPA
- Spring Data JDBC
- H2 Database

The extra dependencies you'll want to add are:
- MaptStruct
  - https://mapstruct.org/documentation/installation/
- Vavr
  - https://docs.vavr.io/#_maven
- ArchUnit
  - https://www.archunit.org/getting-started

Since __MapStruct__, __Lombok__ and __Spring Configuration Processor__ are all influencing the source code, you'll need to configurat that in your `pom.xml`

{{< expand "pom.xml - processors configuration example" >}}
```xml
<project>
  
    <properties>
        <java.version>11</java.version>
        <org.mapstruct.version>1.4.2.Final</org.mapstruct.version>
        <org.projectlombok.version>1.18.16</org.projectlombok.version>
        <org.projectlombok.binding.version>0.2.0</org.projectlombok.binding.version>
        <maven.compiler.version>3.8.1</maven.compiler.version>
    </properties>
  
    <build>
        <plugins>
          <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>${maven.compiler.version}</version>
            <configuration>
              <release>${java.version}</release>
              <source>${java.version}</source>
              <target>${java.version}</target>
              <annotationProcessorPaths>

                <!--  ORDER MATTERS  -->

                <path>
                  <groupId>org.projectlombok</groupId>
                  <artifactId>lombok</artifactId>
                  <version>${org.projectlombok.version}</version>
                </path>
                <path>
                  <!-- This is needed when using Lombok 1.18.16 and above -->
                  <!-- https://github.com/rzwitserloot/lombok/tree/master/src/bindings/mapstruct -->
                  <groupId>org.projectlombok</groupId>
                  <artifactId>lombok-mapstruct-binding</artifactId>
                  <version>${org.projectlombok.binding.version}</version>
                </path>
                <path>
                  <groupId>org.mapstruct</groupId>
                  <artifactId>mapstruct-processor</artifactId>
                  <version>${org.mapstruct.version}</version>
                </path>
                <dependency>
                  <groupId>org.springframework.boot</groupId>
                  <artifactId>spring-boot-configuration-processor</artifactId>
                  <version>${project.parent.version}</version>
                </dependency>
              </annotationProcessorPaths>
            </configuration>
          </plugin>

        </plugins>
    </build>

</project>
```
{{< /expand >}}
