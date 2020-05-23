---
weight: 2
bookFlatSection: true
title: "Episode 2, Write and Compile Java App"
---

# Episode 2, Write and Compile Java App

[Season 1 - From Lame to Fame](/docs/java/season_1/)

> app = _application_
> 
> This tutorial is intended for beginners, if is too detailed for you, go and cry in a corner, then come back when done 

1. Open the file manager (_quite often the shortcut is [`Win + E`](/docs/how_tos/win-key/)_)
{{< tabs "go-home" >}}
{{< tab "Linux" >}}
1. Navigate to your home folder
1. The home folder is open by default usually, if that's not the case then navigate to your home folder. 
1. Often this shortcut works `Alt + Home`.
1. Create a folder with the name `lameapp`
1. Open this `lameapp` folder and create a simple text file with the name `LameApp.java`
![](/java/season1/episode2/new-file-linux.gif) 
{{< /tab >}}
{{< tab "Windows" >}}
Open `Documents`
1. Create a folder with the name `lameapp`
1. Open this `lameapp` folder and create a simple text file with the name `LameApp.java`
![](/java/season1/episode2/new-file-win.gif) 
{{< /tab >}}
{{< tab "MacOS" >}} 
1. Navigate to your home folder
1. Create a folder with the name `lameapp`
1. Open this `lameapp` folder and create a simple text file with the name `LameApp.java`
{{< /tab >}}
{{< /tabs >}}
1. Use a simple text editor to edit `LameApp.java` file (_e.g. Notepad, Notepad++, Kate, Kwrite, Gedit, Nano, vim_)
1. Type the following content (_no copy/pasting you little... you know the word_): 
```java
public class LameApp {

  public static void main(String[] args) {

    System.out.println("This is it!");
    System.out.println("My name is Jon Snow and I know nothing!");
    System.out.println("Write more lines like that and feel yourself being [Thanos Level] powerful!");

  }
}
```
1. Check that you wrote everything, letter by letter and symbol by symbol
1. Double check 3 times, so that you'll have it checked 7 times in total (_seven is a lucky number_)
1. Now save the file and open a terminal or command line
{{< tabs "open-console" >}}
{{< tab "Linux" >}} Press `Ctrl + Alt + T` {{< /tab >}}
{{< tab "Windows" >}} 
Press `Win + R` then `Enter` then type `cmd` then hit enter with all your inner force, my young padavan 

![](/installjava/windows/win-run-cmd.png) 
{{< /tab >}}
{{< tab "MacOS" >}} Find a funny icon that look like a black window and click on it {{< /tab >}}
{{< /tabs >}}
1. Navigate to the folder of this file
1. Usually done with command `cd` (_**C**hange **D**irectory_)
{{< tabs "cd-home" >}}
{{< tab "Linux" >}} Type in terminal `cd /home/$USER/lameapp` and hit `Enter` {{< /tab >}}
{{< tab "Windows" >}} Type in command line `cd %USERPROFILE%\Documents` and hit `Enter`{{< /tab >}}
{{< tab "MacOS" >}} Type in terminal `cd /Users/$USER/lameapp` and hit `Enter`{{< /tab >}}
{{< /tabs >}}
1. Now let's do the fun part, let's copile and run this piece of... marvel
1. First, we compile by typing in terminal `javac LameApp.java` then hitting `Enter` because we can
    1. Another file will be created with the name `LameApp.class`, one more lame file in this world
1. Second, we run the thing by typing in terminal `java LameApp`
![](/java-lameapp.png)
1. Now you cry and feel happy, you are not so lame as you thought

{{< button href="https://tenor.com/search/happy-gifs" >}}You did it my friend, enjoy happiness!{{< /button >}}
