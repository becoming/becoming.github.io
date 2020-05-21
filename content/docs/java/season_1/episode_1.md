---
weight: 1
bookFlatSection: true
title: "Episode 1, Install Java"
---

# Episode 1, Install Java

[Season 1 - From Lame to Fame](/docs/java/season_1/)

In order to start creating Java apps we need to install the Java itself on our computer.
> Java Development Kit = _JDK_

{{< tabs "uniqueid" >}}
{{< tab "Linux" >}} 
For simplicity we are going to use Ubuntu as reference distribution.
> Ubuntu = _A GNU Linux distribution, "a version of Linux"_
    
The steps might lightly differ from one distribution to another.

In Linux there are several ways to install java, we'll do it the cool way - via Terminal.

1. Open the terminal, via `Ctrl + Alt + T` or find the _Terminal_ or _Konsole_ application in the apps menu, usually opened via `Win` button.
1. Type with your bare hands `sudo apt install openjdk-11-jdk`, press key `Enter`. You'll be asked for password, type it and press again `Enter`.
![](/sudo-apt-install-openjdk11.png) 
1. Wait for magic to happen then check if all went well by checking the java version. For that we'll type in the same console `java -version` then press `Enter`.
![](/java-version.png) 
{{< /tab >}}
 

{{< tab "Windows" >}} 
> You can get a free developer version of windows vor VirtualBox or other virtual environments here: https://developer.microsoft.com/en-us/windows/downloads/virtual-machines/
>

1. We'll use AdoptOpebJdk distribution of JDK: https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot
1. You'll chose the `OpenJDK 11 (LTS)` and `HotSpot`
1. Then hit the blue button.
1. You'll be proposed to download a `*.msi` package that works on any x64 Windows
1. When done, run the file and a prompt will appear:
![](/installjava/windows/install-prompt.png) 
1. Hit OK and proceed by hitting on `Next` like this is the last thing you'll do in your long life.
    1. Why long ? because you took the path to immortality my dear padavan.
1. And yeah, you need to accept the license without reading, because this is how real cowboys are installing pipes.
1. Make sure to select `JAVA_HOME` thing
![](/installjava/windows/java-home.png) 
1. And since you are using `Windows` you'll see another dialog
![](/installjava/windows/just-another-dialog.png) 
1. Make sure to click `Yes` or all your efforts will fail
1. Finish and .. whatever
1. When done run the command line `Win + R` type `cmd` hit `Enter`, because you can
1. Type `java --version` and hit `Enter` again
![](/installjava/windows/java-version.png) 
{{< /tab >}}

  
 
{{< tab "MacOS" >}} 

TODO

{{< /tab >}}





{{< /tabs >}}