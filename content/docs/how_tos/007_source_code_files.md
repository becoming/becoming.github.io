---
weight: 7
title: "Source code files"
---
# Source code files

[Source code](https://en.wikipedia.org/wiki/Source_code) is any collection of computer instructions organized in simple text files in most cases.

All the instructions we'll see in this curriculum: variables, functions, classes, etc.: represent the source code of an application

In java based projects the **java source code** is kept in files with extension: `.java`, example: `String.java, User.java`, etc.
 - Yet, you'll often see files with other extensions like `.properties, .txt, etc.`
 - We'll talk about them when needed

Every `.java` source code file should contain at least one class with the same name of the file.

e.g. `/home/rodislav/MyProject/Hello.java`

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("¯\\_(ツ)_/¯");
    }
}
```

> Did you noticed the double hand ? `"¯\\_(ツ)_/¯"` this is a thing called: ESCAPING. Do you feel strong enough to google it ?
> 
> Hint: we speak about "_special_" characters.

## Java file opened in simple text editor (with hightlight support)

image depicting a file which contains source code, opened in a text editor
![](/howtos/source-code-opened-file.png)
