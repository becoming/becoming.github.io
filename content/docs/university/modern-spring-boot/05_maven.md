---
weight: 5
bookFlatSection: true 
title: "Episode 5, Maven - pom.xml"
---

# Episode 5, Maven - pom.xml

Your `pom.xml` file has a decent structure by default. 
I propose you to keep the following one to have a better experience over time:

    parent
--- 
    groupId
    artifactId
    name
    description
    version
    packaging
---
    properties
---   
    organization
    scm
    repositories
---  
    dependencyManagement
    dependencies
---   
    profiles
    build