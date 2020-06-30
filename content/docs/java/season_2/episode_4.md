---
weight: 4
bookFlatSection: true
title: "Episode 4, Classes"
---

# Episode 4, Classes

[Season 2 - The ABCs](/docs/java/season_2/)

{{< hint info >}}
Now we'll talk more detailed about classes. This might sound a complicated topic, but it'll be easier soon.
{{< /hint >}}

A class is an extensible program-code-template for creating objects,
providing initial values for state (*member variables*) and implementations of behavior (*member functions or methods*)

> One `*.java` file must contain at least one class with same name as the file, and can contain other classes with other name.
>
> Classes are usually kept in folders, called: **packages**

In this part we'll explore the basics, because the complicated cases could be difficult to digest at this early stage.

### Syntax

*visibility* *static* *final* *abstract* class **NameOfTheClass** *extends* *ParentClass* *implements* *OneInterface* { 

&nbsp;&nbsp;&nbsp;&nbsp;*visibility* **NameOfTheClass** { }

};

1. **visibility** (*optional*) - public, private, protected, *default*.
1. **static** (*optional*) - used for nested classes (*do not lose time with this now*).
1. **final** (*optional*) - means that this class cannot be extended, not compatible with **abstract**.
1. **abstract** (*optional*) - means that this class should be extended, not compatible with **final**.
1. **class** - shows that this is a class.
1. **NameOfTheClass** - should be similar to the name of the file.
1. **extends** (*optional*) - in case of extending (*inheritance*) other class we need use this one.
1. **ParentClass** (*optional*) - when using **extends** whe need to specify what class is extended. One class can extend only one other class.
1. **implements** (*optional*) - in case we want to implement a interface (*a contract*) we need to use this one.
1. **OneInterface, AnotherInterface** (*optional*) - when using **implements** whe need to specify what interfaces we are going to implement. One class can implement multiple interfaces.
1. **{  }** curly braces - are the start and end of the body of the class.
1. *visibility* **NameOfTheClass** { } - a special function called **constructor**, it is called automatically by JVM (*java virtual machine*) when a new instance of the class is created.

### Letz’ code it

1. Continue to work in same folder from the previous episode.
1. Create a `.java` file with the name `Classes.java`
1. Type this body: 

```java
public class Classes {

    // I'm a class variable, NOT visible in other classes outside of this file, and I belong to this class
    // private = limited visibility
    // static = belong to the class, class variable                
    private static String shh = "Shh, quiet...";

    // I'm a class variable, visible in other classes in any files, yet I belong to this class
    // I do not belong to it's instances! we'll discuss the details in next course - Java Junior
    public static String wow = "Like, WOW!!!";

    // I'm a PRIVATE STATIC function and I belong to this class as well
    private static void hideTreasure(String param1, String param2) {
        // do the hiding here..
        // aStaticFunction(); // I can call the public static functions to, but if you'll un comment this line, you'll get inifinite recursion :)
    }

    // I'm a PUBLIC STATIC function and I belong to this class!
    public static void aStaticFunction() {
        // I can call private function from within the class
        hideTreasure("Captain", "Flint");
        shh.toString(); // as well I can call other static variables
    }

    // NOTE
    // we can write here variables and functions, similar to the ones we have created in previous lessons
}

// I'm a inner class!
// I CANNOT be public or private!
// I'm a fully qualified class, I can have variables, functions, etc.
class InnerDaemon {

    String name;

    public String getName() {
        return name;
    }
}

// I'm just another inner class, so we can be as much as you want
// but you should want as less as you can :)
class JustAnotherInnerThing {
    // you've got it
}
```

This time we'll not compile this file, since it was for demonstration only.

### Want to know more ?

[Access Control](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)

[Class variables](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html)

[Initializing Fields](https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html)



