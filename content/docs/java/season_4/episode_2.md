---
weight: 2
bookFlatSection: true
title: "Episode 2, import pom.xml as project"
---

# Episode 2, import pom.xml as project

[Season 4, Spring time](/docs/java/season_4/)

Since we have a skeleton, which is pretty much an application, we can import it in our IDE. As reference I'll use Intellij Idea,
you are not obliged to use it, just adapt the steps to your IDE.

I still insist that you need to use an IDE, like: Intellij Idea, Netbeans, Eclipse.

1. Start Intellij Idea, assuming that [you configured it this way](/docs/java/season_1/episode_6/).
1. It'll start in one of the modes:
{{< tabs "ide" >}}
{{< tab "With Start screen" >}}
![](/howtos/intellijidea/installjava/windows/start-screen.png) 
1. Click on *Open or Import*.
1. Navigate to the folder you've extracted and select the `pom.xml`.
1. Then pick *Import as new project*.
{{< /tab >}}
{{< tab "Re-open last project" >}} 
1. `File -> New / Project from Existing Sources...`.
1. Navigate to the folder you've extracted and select the `pom.xml`.
1. This will import the project right away.
{{< /tab >}}
{{< /tabs >}}

1. What to do if it did not worked ? Check the official documentation [here](https://www.jetbrains.com/help/idea/maven-support.html#maven_import_project_start).

1. Inside Intellij Idea navigate to `src/main/java/tech/becoming/ess`, you'll find the `Application.java` class
1. Right click on it and run.