---
weight: 2
bookFlatSection: true
title: "Episode 2, import project"
---

# Episode 2, import project

[Season 4, Spring time](/docs/java/season_4/)

Since we have a skeleton, which is pretty much an application, we can import it in our IDE. 
As reference I'll use **Intellij Idea**, you are not obliged to use it, in that case you need to adapt the steps to your IDE.

I still insist that you need to use an IDE like: [Intellij Idea](https://www.jetbrains.com/idea/buy/#personal?billing=monthly), [Netbeans](https://netbeans.apache.org/download/index.html), [Eclipse](https://spring.io/tools). 
You can as well [VSCode](https://spring.io/tools) 

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