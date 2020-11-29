---
weight: 2
bookFlatSection: true
title: "Episode 3, Spring boot, Security"
---

# Episode 3

Ok, we have now some routes, and we need to secure them. We'll do this time Basic Authentication.

## In Memory

Our code will be base on this article: https://spring.io/guides/gs/securing-web/

We will secure only the APIs, we'll not create a html page for that. If you want, feel free to do the guide as described as exercise for you.

The central parts of this exercise are:

 - dependencies
 - `@EnableWebSecurity` annotation
 - the extension `public class WebSecurityConfig extends WebSecurityConfigurerAdapter`
 - configuration of the routes `configure(HttpSecurity http)`
 - custom `UserDetailsService` with `InMemoryUserDetailsManager`
 
The main difference from the article will consist in using `.httpBasic()` instead of `.formLogin()`

> Please mind that this method is rarely used in production. I mean I never saw it, yet I'm sure there might be some particular use cases for that.

## In Database

Let's go a bit more real this time. We'll connect our authentication logic to users locate in database.

The central parts are the ones described above plus a bunch of new ones:

 - liquibase scripts to create the user table and put something there, the password will be hashed by default
 - entity and repository for user
 - a custom `UserDetailsService` capable of looking in db
 - a custom `AuthenticationProvider` capable of checking things correctly and assign roles as we want
 - properties to activate IN_MEMORY or DB storage, so that we can have this distinction
 - other things to add later.
 
In all the source code we'll have all kind of hints and links to the articles that talk about that particular matter. Feel free to read the articles and practice them.