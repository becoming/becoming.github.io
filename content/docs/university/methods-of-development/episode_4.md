---
weight: 3
bookFlatSection: true
title: "Episode 4, CI/CD"
---

# Episode 4

CI/CD part can be done in Multiple Ways:
- We can do only CI.
- only CD.
- both.
- in cloud.
- in local.
- fully automated.
- manual.
- hybrid, some steps automated, others manual.
- we can base it on Git.
- on hooks.
- on proprietary ways.
- use jobs or pipelines
- the pipelines can be visually created or scripted in *.yml (_most of the times_)

## Jenkins in local docker image

- https://github.com/jenkinsci/docker/blob/master/README.md

```shell script
docker run -d -p 8080:8080 -p 50000:50000 -v /home/rodislav/.jenkins:/var/jenkins_home jenkins/jenkins:lts

# -d detached, do not stop the container when I stop the container when I close the session
# -p port, host:container, do the routing of the ports
# -v volume, local folder to be mount inside the container
# jenkins/jenkins, the image
# :lts, the version
```

En français: https://www.youtube.com/watch?v=WTJNKAcgihE

## Travis + GitHub

- travis account
- link repositories
- travis-cli
- .travis.yaml
- sonarcloud.io

```yaml
language: java
jdk: openjdk11

cache:
  directories:
    - "$HOME/.m2"

addons:
  sonarcloud:
    token:
      secure: ""

script: mvn verify sonar:sonar -q
```

https://www.youtube.com/watch?v=BFpSD2eoXUk

## GitLab

https://docs.gitlab.com/ee/ci/examples/artifactory_and_gitlab/

- We'll use bintray for artifacts