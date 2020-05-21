---
weight: 2
bookFlatSection: true
title: "Episode 2, Write Java App"
---

# Episode 2, Write Java App

[Season 1 - From Lame to Fame](/docs/java/season_1/)

> app = _application_
> 
> This tutorial is intended for beginners, if is too detailed for you, go and cry in a corner, then come back when done 

1. Open the file manager (_quite often the shortcut is [`Win + E`](/docs/how_tos/win-key/)_)
1. Navigate to your home folder
    1. Often this shortcut works `Alt + Home`
1. Create a folder with the name `lameapp`
1. Open this `lameapp` folder and create a simple text file with the name `LameApp.java`
1. Use a simple text editor to edit `LameApp.java` file (_e.g. Notepad, Notepad++, Kate, Kwrite, Gedit, Nano, vim_)
1. Type the folowing content (_no copy/pasting you little... you know the word_): 
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
    1. Ubuntu press `Ctrl + Alt + T`
    1. Windows 10 `Win + R` then `Enter` then type `cmd` then hit enter with all your inner force, my young padavan
    1. Macos 10+ find a funny icon that look like a black window and click on it
1. Navigate to the folder of this file
    1. usually done with command `cd` (_which means: **c**hange **d**ir_)
    1. Ubuntu `cd /home/$USER/lameapp`
    1. Windows 10 `cd %USERPROFILE%`
    1. Macos 10+ `cd /Users/$USER/lameapp`
1. Now let's do the fun part, let's copile and run this piece of... marvel
1. First, we compile by typing in terminal `javac LameApp.java` then hitting `Enter` because we can
    1. Another file will be created with the name `LameApp.class`, one more lame file in this world
1. Second, we run the thing by typing in terminal `java LameApp`
![](/java-lameapp.png)
1. Now you cry and feel happy, you are not so lame as you thought
1. [Click here to see happiness in action](https://tenor.com/search/happy-gifs)
