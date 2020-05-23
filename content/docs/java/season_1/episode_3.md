---
weight: 3
bookFlatSection: true
title: "Episode 3, Install Maven"
---

# Episode 3, Install Maven

[Season 1 - From Lame to Fame](/docs/java/season_1/)

1. Open an internet browser
1. Navigate to [https://maven.apache.org/download.cgi](https://maven.apache.org/download/cgi)
1. Scroll down to **Files** and click on a link next to **Binary ... archive**
![](/java/season1/episode3/maven-link.png) 
1. Usually you would go for **.zip** version
1. Once downloaded, extract the contents of the archive to a directory you prefer
    1. Make sure the extracted content stays in a single folder
    1. Usually named like `apache-maven-3.6.3`
1. In the end you'll have **Maven** files looking like
![](/java/season1/episode3/maven-folder.png) 
{{< hint warning >}}
Make sure you do not have **Maven** in a nested directory like: 
`/home/$USER/Apps/apache-maven-3.6.3/apache-maven-3.6.3`, notice **apache-maven-3.6.3** written 2 times
{{< /hint >}}

1. Great, now we have **Maven** installed
1. Now we need to make it work like a command in terminal
{{< tabs "go-home" >}}
{{< tab "Linux" >}}
1. In my case, I've extracted maven here `/home/$USER/Apps/apache-maven-3.6.3` and I'll use this path as reference
1. Now we have to open `~/.bashrc` with an editor

**Console way**
1. Press `Ctrl + Alt + T` to open a console
1. Type `nano ~/.bashrc` and hit `Enter`, because this key is the meaning of the universe
1. Navigate to the very end of this file with `mouse scroll`, `Arrow Down` or `Page Down`
1. Type this
```shell script
export MVN_HOME=/home/$USER/Apps/apache-maven-3.6.3 # declare MVN_HOME variable with value equal to the location of Maven app 
export M2=$MVN_HOME/bin # declare M2 variable with value equal to the location of the [mvn] binary (executable), we re-use $MVN_HOME variable to make the value shorter
export PATH=$PATH:$M2 # Add our $M2 to the global $PATH variable so that the terminal will know where to find [mvn] binary when we'll type it
``` 
1. Press `Ctrl + O` to save changes **O**ver, then `Enter` to confirm and `Ctrl + X` to e**X**it from nano
1. Type `source ~/.bashrc` then `Enter`
1. Type `mvn --version` then `Enter`

**Graphical way**
1. Open the file manager [`Win + E`](/docs/how_tos/win-key/)
1. Press `Ctrl + H` to show/hide hiddne files (_the ones that have their name starting with a dot, like `.bashrc`_)
1. Find file named `.bashrc`, double-click on it to open with a text editor
1. Navigate to the very end of this file with `mouse scroll`, `Arrow Down` or `Page Down`
1. Type this
```shell script
export MVN_HOME=/home/$USER/Apps/apache-maven-3.6.3 # declare MVN_HOME variable with value equal to the location of Maven app 
export M2=$MVN_HOME/bin # declare M2 variable with value equal to the location of the [mvn] binary (executable), we re-use $MVN_HOME variable to make the value shorter
export PATH=$PATH:$M2 # Add our $M2 to the global $PATH variable so that the terminal will know where to find [mvn] binary when we'll type it
``` 
1. Press `Ctrl + S` to save and `Alt + F4` to close the editor
1. Press `Ctrl + Alt + T` to open a console
1. Type `mvn --version` then `Enter`
![](/java/season1/episode3/maven-version.png) 
{{< /tab >}}

{{< tab "Windows" >}}
1. In my case, I've extracted maven here `C:\apache-maven-3.6.3` and I'll use this path as reference

**Console way**
1. Open `cmd` (_command.com_, _command_ or simply _cmd_)
    - Press `Win + R` type `cmd` and press `Enter`
![](/installjava/windows/win-run-cmd.png) 

1. Declare MVN_HOME variable with value equal to the location of Maven app
    - Type `setx MVN_HOME "C:\apache-maven-3.6.3"` and hit `Enter`
1. Declare `M2` variable with value equal to the location of the [mvn] binary (executable), we re-use $MVN_HOME variable to make the value shorter
    - Type `setx M2 "%MVN_HOME%\bin"` and hit `Enter`
1. Add our `%M2%` to the global $PATH variable so that the terminal will know where to find [mvn] binary when we'll type it
    - Type `setx PATH "%M2%;%PATH%"` and hit `Enter`
1. Close `cmd` and open it again, see step #1
1. Type `mvn --version` then `Enter`
![](/java/season1/episode3/maven-version.png) 
{{< /tab >}}

{{< tab "MacOS" >}} 

{{< /tab >}}
{{< /tabs >}}