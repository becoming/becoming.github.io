---
weight: 3
bookFlatSection: true
title: "Episode 3, Functions"
---

# Episode 3, Functions

[Season 2 - The ABCs](/docs/java/season_2/)

{{< hint info >}}
In this chapter we'll cover essential features of the subject. For more details you need follow th links at the end.
{{< /hint >}}

Functions are used to write an algorithm, a behaviour, execute commands one after another. 
They are containers for a block of isolated lines of code.

### Syntax
*visibility* *static* *final* **ReturnType** **nameOfTheFunction** ( **ParamType** **paramName**, **PType2** **p2** ) 
{ 
    **CODE** 
};

E.g. `public static final String getHero() { return "Jon"};`

1. Where **ReturnType** is `String` and **nameOfTheFunction** is `getHero`
    - E.g. `String getHero() { return "Jon"};`
    - E.g. `private static void callHero(String heroName) {};`
1. These elements are optional *visibility* *static* *final*
1. ( ) (*parenthesis are mandatory*)
1. { } (*curly braces are mandatory*)
1. If **ReturnType** is other than `void` then at least one `return` or one `throw` keyword should be used
1. One function can return only one value or **void** (*meaning no value*)
1. One function can accept any number of parameters, where each parameter can have a different type
    - E.g. `void getTheBastard(String name);`
    - E.g. `void findUsers(String name1, String name2, int age);`

### Letz' code it
1. Continue to work in same folder from the previous episode.
1. Create a `.java` file with name `FunctionsObject.java`
1. Type this body:
    ```java
    public class FunctionsObject {
    
        private int rabbitsNumber;
    
        // the constructor is the function with the name of the class
        // it is called by the java virtual machine
        // when new instance is created
        public FunctionsObject() {
            System.out.println("I'm the function called by default");
            System.out.println("when new instance of \"me\" is created");
            System.out.println("I'm the constructor of " + getClass().getName());
    
            // we can call any function from within any function
            // this is how we call the function,
            // we write the name and add parenthesis
            // if there is a case, we should pass as well parameters
            hello();
    
            System.out.println("I have " + gimmeCoins() + " coins");
        }
    
        /*
        I'm a public function, you can call me from anywhere
        the functions are not called in automatic way (but the constructor!)
        somebody should to call them
        @see https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
        */
        // function with no parameters
        public void hello() {
            System.out.println("Hello all :)");
        }
    
        // function with one parameter
        public void doSomeMagic(String magicianName) {
            System.out.println("do the magic mr. " + magicianName);
        }
    
        // function with more parameters
        // here we see example of OVERLOADING, same function name but different amount and/or types of parameters
        public void doSomeMagic(String magicianName, int numberOfRabbits) {
            System.out.println("do the magic mr. " + magicianName + " with " + numberOfRabbits + " rabbits!");
        }
    
        // a private function can be called only from within the parent class!!
        // @see https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
        private int gimmeCoins() {
            return 345;
        }
    
        // function considered as getter
        // usually it is public
        public int getRabbitsNumber(){
            return rabbitsNumber;
        }
    
        public void setRabbitsNumber(int nr) {
            rabbitsNumber = nr;
            /*
            * as well it is quite common to name the parameter with same name as the variable (field/attribute)
             * e.g. setRabbitsNumber(int rabbitsNumber)
             * in this case to set the internal variable you have to use keyword: this
             * e.g. this.rabbitsNumber = rabbitsNumber;
            */
        }
    
        // functions can call other functions from same class
        // or from variables who are in this class
        // as well static functions
        // any function as well can have it's own variables,
        // which are destroyed when the function is executed
        public void callAndSubCall() {
           hello();
           int coins = gimmeCoins(); // we can call as well the private functions
           doSomeMagic("Rocky the SubCall", getRabbitsNumber());
           doSomeMagic("Coins", coins);
    
        }
    }
    ```
1. Create another `.java` file with name `Functions.java`
1. Type this body 
    ```java
   import FunctionsObject;
   
    public class Functions {   
        public static void main(String[] args) {
            FunctionsObject myFuncs = new FunctionsObject();
            myFuncs.setRabbitsNumber(12);
    
            myFuncs.doSomeMagic("David Blane");
            myFuncs.doSomeMagic("David Blane", myFuncs.getRabbitsNumber());
    
            // in order to call this function, you have to make it public
            // myFuncs.gimmeCoins(); // so in order to call it you have to change visibility
    
            myFuncs.callAndSubCall();
        }
    }
    ```
1. Now we can run the `Functions.java`:
{{< tabs "run" >}}
{{< tab "Terminal" >}}
Navigate to the location of the file `Functions.java` with **cd** command, e.g. `cd /home/$USER/java-abc`. 
```shell script
javac Functions.java
java Functions
```
{{< /tab >}}
{{< tab "Intellij Idea" >}}
- Right click inside the file and click *Run*

**OR**

- Click on little green triangle, that looks like *play* located on the same line as to `public static void main(..)`.

[If you cannot find it then click here for details](https://www.jetbrains.com/help/idea/running-applications.html).
{{< /tab >}}
{{< /tabs >}}

### Want to know more ?

- [Access control](http://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)

- [Class variables (applicable to functions as well)](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html)

- [Functions - video example](https://www.youtube.com/watch?v=_kbJhpKNBa0&t=338s&index=4&list=PLPkoWZmDIKwCvNeBpZMejx8gQhglUxw-w)

