---
weight: 2
bookFlatSection: true
title: "Episode 3, Spring boot, Security"
---

# Episode 3

Ok, we have now some routes, and we need to secure them. We'll use __Spring Security__ and __Basic Authentication__.

## General architecture
_A "Bird Eye" view of where the security is located:_
![](/university/methodes-de-dev/Spring_Security.png) 

A detailed look at __Spring Security__'s architecture: https://dzone.com/articles/spring-security-authentication.

The complete documentation: https://docs.spring.io/spring-security/site/docs/current/reference/html5/

This to read in particular:
 - Introduction, all of it.
 - Servlet Applications
    - FYI: servlet is a server applet __SERV__-er app-__LET__.
        - __server__ being the physical or virtual computer.
        - __applet__ is the application that runs on a server.
    - Chapters 8-11, 16,  

## In Memory

Our code will be based on the [Securing Web article](https://spring.io/guides/gs/securing-web/). 
The main difference from the article and our code will consist in using `.httpBasic()` instead of `.formLogin()`


We will secure only the APIs, we'll not create a html page for that. 
If you want, feel free to do the guide as described as exercise for you.

### Code Demo
Here's the example of this repository: [basic authentication in memory](https://github.com/becoming/click-and-collect/pull/1/files)

### Demo's bullet points
The central parts of this exercise are:

 - `pom.xml`, added __security starter__ dependency.
    - `spring-boot-starter-security`
 - `WebSecurityConfig`, created a dedicated config class.
 - `@Configuration`, annotated `WebSecurityConfig` to declare it as configuration class.
 - `@EnableWebSecurity`, annotated `WebSecurityConfig` to enable features from `security starter`.
 - `WebSecurityConfigurerAdapter`, `WebSecurityConfig` has to extend the adapter in order to be able to override default settings.
 - `configure(HttpSecurity http)`, override the configuration of the `http` pipe.
 - `configure(WebSecurity web)`, override the configuration of the `web` pipe to ignore `OPTIONS`.
    - __Preflight request__ : https://developer.mozilla.org/en-US/docs/Glossary/Preflight_request
 - `UserDetailsService userDetailsService()` created custom __user details service__ by using the __in memory__ implementation from the __security starter__ `InMemoryUserDetailsManager`
    - The users present in this piece of java code are your actual users for the API.

> Please mind that this method is rarely used in production. I mean I never saw it, 
> yet I'm sure there might be some particular [use cases](https://www.visual-paradigm.com/guide/uml-unified-modeling-language/what-is-use-case-diagram/) for that.

## In Database

Let's go a bit more real this time. We'll connect our authentication logic to users located in your database.

### Code Demo
Here's the example of this repository: [basic authentication in db and in memory](https://github.com/becoming/click-and-collect/pull/2)

### Demo's bullet points
The central parts are the ones described above plus a bunch of new ones:

 - `liquibase` scripts to create the `USERS` table and put 3 demo users, the password will be hashed in `MD5` by default
 - `/users`, feature to manage `User entity` and `repository`
 - a custom `UserDetailsService` capable of finding users in db
 - `PasswordChecker` interface and `MD5Checker` implementation to check the user password
 - a custom `AuthenticationProvider` capable of checking the passwords and creating a `UserDetails` object
 - properties to activate `IN_MEMORY` or `DB` storage, so that we can have this distinction
 - `SecurityProperties` to have the properties injectable
    - This particular class will not use `lombok` because `spring-boot-configuration-processor` cannot handle `lombok`
 
In all the source code we'll have all kind of hints and links to the articles that talk about that particular matter. Feel free to read the articles and practice them.
