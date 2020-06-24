---
weight: 2
bookFlatSection: true
title: "Episode 2, Variables"
---

# Episode 2, Variables

[Season 2 - The ABCs](/docs/java/season_2/)

# Variables

{{< hint info >}}
In this chapter we'll cover essential features of the subject. For more details you need follow th links at the end.
{{< /hint >}}


Variables are used to store reference to data, which will be manipulated in a computer program.
The only exception are primitive variables, they are holding the data itself.

### Syntax
*visibility* *static* *final* **Type** **name** = *value*;
    - E.g. `public static final String hero = "Jon";`
    - Where **Type** is `String` and **name** is `hero`
    - E.g. `public final String hero = "Jon";`
    - E.g. `private static String hero = "Jon";`
1. These elements are optional *visibility* *static* *final*
    - E.g. `String hero = "Jon";`
1. **=** (*equal sign*) is optional. If used, then **value** becomes mandatory.
    - E.g. `String hero;`
    - E.g. `String hero = "Jon";`
1. We can assign to a variable result of a function
    - E.g. `String hero = getTheBastard();`
    - Where `getTheBastard()` is a function that returns a value of **Type** `String`
1. Semicolon is always mandatory.
1. **names** are to be written using *camelCaseStyle*.
1. **public**, **private**, **protected**, **static** and **final** are always in lower case.
1. **Type** starts with upper case when using a class type and lower case when using a primitive type.
    - There are 2 type groups in Java: Objects and Primitive.
    - Primitive types are limited and cannot be changed nor added by java developers: 
        - `byte, short, int, long, float, double, boolean, char`.
    - Objects can be created by using classes.

### Letz' code it
1. Continue to work in same folder from the previous episode.
1. Create another `.java` file with name `Variables.java`
1. Create the base class body 
    ```java
    public class Variables {
    }
    ```
1. Create `main` function 
    ```java
    public class Variables {
       public static void main(String[] args) {
       }
   }
1. Type, line by line and experiment the examples below
    - If you forgot how to run, check the first episode from this season
    - Please consider writing the code by yourself, do not copy paste.
    - Read explanations in comments.
    ```java
    public class Variables {
        public static void main(String[] args) {
            int userId = 23; // simple variable of a numeric type, int = integer => -1, 0, 1, 2, 9999
            
            /* 
             * String -> object
             * loggedUser -> name of the variable
             * new String("Miley") -> the new instance of the class String created in memory. In other words: the object.
             */
            String loggedUser = new String("Miley");
            
            int myInt = 0; // create myInt variable of a primitive type int=integer, with default value of 0 zero
            System.out.println("myInt = " + myInt);
            
            myInt = 123; // assign new value to myInt variable
            System.out.println("myInt = " + myInt);
            
            //------------ same here
            String myString = "some text here, even with spaces";
            System.out.println("myString = " + myString);
            
            myString = "some other text here";
            System.out.println("myString = " + myString);
            //------------
            
            // create variable and assign null as a value
            String myOtherString = null; 
            System.out.println("myOtherString = " + myOtherString);
            
            // this type of variables is called: final, it cannot be changed
            // in java same thing is used for constants: variables that cannot get other value.
            final String CONST_STRING = "whatever";
        }
    }
    ```

### Want to know more ?

 - [Java Variables](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html)

 - [Variables - video example](https://www.youtube.com/watch?v=1Ao2pZCpnCw&t=7s&index=3&list=PLPkoWZmDIKwCvNeBpZMejx8gQhglUxw-w)

 - [Visibility and Access Control](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)

 - [Static a.k.a. Class variables](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html)

 - [A good explanation for Variables, for Ruby but the principle works everywhere](https://launchschool.com/books/ruby/read/variables)