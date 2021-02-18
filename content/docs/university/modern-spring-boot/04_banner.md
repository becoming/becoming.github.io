---
weight: 4 
bookFlatSection: true 
title: "Episode 4, banner"
---

# Episode 4, banner

A banner is displayed everytime the spring boot app starts, it is a nice and fun way to personalize your app.

By default, there's no banner generated, you can fix this _critical issue_ by creating one of the example files bellow,
in the main resources :

- `/src/main/ressources/banner.txt`
  - You can add fancy ASCII text like : http://patorjk.com/software/taag/#p=display&f=Big&t=becoming.tech
- `/src/main/ressources/banner.gif`
  - _The `banner.gif` needs special colors, otherwise you'll get a result like this_
    - ![](/university/modern-spring-boot/banner-gif.png)

Use variables like:

```text
my-app / app version ${application.version} / spring boot version ${spring-boot.version}
```

Where `${application.version}` and `${spring-boot.version}` are supported variables.

More details here: https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-banner

{{< hint info >}}
**Variables might not be visible when running from IDE**  
The values for varirables is take fron `MANIFEST.MF` file, which is generated but the `spring-boot-maven-plugin` and copied inside the final `.jar` file.
{{< /hint >}}

{{< expand "banner.txt - example" >}}
     _______  _______  _______  _______  __   __  ___   __    _  _______        _______  _______  _______  __   __ 
    |  _    ||       ||       ||       ||  |_|  ||   | |  |  | ||       |      |       ||       ||       ||  | |  |
    | |_|   ||    ___||       ||   _   ||       ||   | |   |_| ||    ___|      |_     _||    ___||       ||  |_|  |
    |       ||   |___ |       ||  | |  ||       ||   | |       ||   | __         |   |  |   |___ |       ||       |
    |  _   | |    ___||      _||  |_|  ||       ||   | |  _    ||   ||  | ___    |   |  |    ___||      _||       |
    | |_|   ||   |___ |     |_ |       || ||_|| ||   | | | |   ||   |_| ||   |   |   |  |   |___ |     |_ |   _   |
    |_______||_______||_______||_______||_|   |_||___| |_|  |__||_______||___|   |___|  |_______||_______||__| |__|
    
     document / app version ${application.version} / spring boot version ${spring-boot.version}
 {{< /expand >}}