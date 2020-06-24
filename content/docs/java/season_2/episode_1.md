---
weight: 1
bookFlatSection: true
title: "Episode 1, First class"
---

# Episode 1, First class

[Season 2 - The ABCs](/docs/java/season_2/)

We'll start learning Java programming language for real this time.

### This is a word play:

> And *of-this-java-course* I'll invite you to try your *first class*.

### This is *first class* serving:

{{< youtube cEVTQHiAQRA >}}

### This is the first class you are going to write:

1. We are starting now to write a java program, you'll do this by creating a so-called **class**.
This is a regular text file that respects the following rules:

    > Please try to follow the steps, create files and write the code inside them
    >
    > **Hint**: Create a folder in which you are going to work, **like** `java-abc` and **not like** `java lessons` or `I'm a Java God`

1. The file has a name where first letter is capital and ends with `.java` extension: `FirstClass.java`
1. The content of this file has at least one *declaration* of a class:
    ```java
    public class FirstClass { }
    ```
1. Here's what this means:
    - `public class FirstClass` means that you tell to java that this file will contain a class
    - `{ }` the curly braces represent the body of this class, meaning the actual code will go inside.
1. Next, we'll add a function:
    ```java
    public class FirstClass { // see, the brackets can be on different lines 
        public static void main(String[] args){ } // this is how we declare a function
    } // it's only important that you have one that is open and other that is closed
    // {     open
    //   }   closed
    ```
1. Did you noticed the double slashes `//` this is used to write a *comment*, a text that is used to explain the code 
to humans, not to computers. Is like leaving notes to not forget.
    > We'll learn what is a function in next episode.
1. Now let's do some fun and print a joke with our program:
    ```java
    public class FirstClass { // see, the brackets can be on different lines 
        public static void main(String[] args){
            System.out.println("Q: Why was the cat sitting on the computer?");
            System.out.println("A: To keep an eye on the mouse!");
        }
    } // it's only important that you have one that is open and other that is closed
    // {     open
    //   }   closed
    ```
1. We just created a *source code file*. 
    - Here are some details: [/docs/how_tos/007_source_code_files/](/docs/how_tos/007_source_code_files/)
1. If you want to run it:
{{< tabs "run" >}}
{{< tab "Intellij Idea" >}}
- Right click inside the file and click *Run*

**OR**

- Click on little green triangle, that looks like *play* located on the same line as to `public static void main(..)`.

[If you cannot find it then click here for details](https://www.jetbrains.com/help/idea/running-applications.html).
{{< /tab >}}
{{< tab "Terminal" >}}
Navigate to the location of the file `FirstClass.java` with **cd** command, e.g. `cd /home/$USER/java-abc`. 
1. Simple way `java FirstClass.java`.
    - Works if you have one single class file.

1. Classical way:
```shell script
# FIRST, compile your program (your app)
javac FirstClass.java
# mind the java[c] letter in javac command, javac = is the app that can transform files with .java extension, into apps. This is the java compiler, hence the letter [c]

# As result you'll find another file with similar name but different extension, called FirstClass.class
# SECOND run the program (the app)
java FirstClass
# mind the absence of the [c] letter from the command, java - is actual java runtime launcher, app that can run java programs
```
{{< /tab >}}
{{< /tabs >}}