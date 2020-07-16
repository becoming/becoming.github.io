---
weight: 2
bookFlatSection: true
title: "Episode 1, Calculator - Coding"
---

# Episode 1, Calculator - Coding

[Season 3 - I know Kung Fu](/docs/java/season_3/)

## Letz’ code it

1. Create a empty folder with name `calculator`.
1. Go inside of this folder.

### App.java
1. Create a `.java` file with the name `App.java`
1. This will be the "*entry point*" in our app
1. While you'll type the code below your IDE will show errors, that's ok, we'll add all the pieces then all the errors will disappear.
    - Please, do not copy paste.
```java
public class App {

//    we are creating now a application that behaves like a real one
//    let's see what parts do we have in real app
//    1. The entry point (App.java)
//    2. Interaction with the user
//        1. display of messages to the user
//        2. capture the input from the user
//    4. The calculation unit, that does the calculation
//    we are going to create a console app, which looks different, but behaves
//    exactly like a normal one

    // this function can be run
    // this a feature of Java
    // we can have only one such method in a class
    public static void main(String[] args) throws Exception {
        // we have as well the display, let's use it here
        // since the functions are static, we can call the directly
        // without creating a instance!
        Display.showWelcomeMessage();

        // 1st step is to ask for first operand!
        Display.askFirstOperand();

        // next we have to wait for user's input!
        // we'll use the Input class and store the result inside a local variable
        int operand1 = Input.getOperand1();

        // next, we need to ask what operation need to be done
        Display.askOperation();

        // we'll do a similar step as we've done earlier
        String operation = Input.getOperation();

        Display.askSecondOperand();

        int operand2 = Input.getOperand2();

        int result = CalculationUnit.calculate(operand1, operation, operand2);

        Display.showResult(result);

        Display.showBye();
    }

}
```

### Display.java
1. Create a `.java` file with the name `Display.java`
1. This class will contain only messages that we are going to show to the user

```java
public class Display {

    public static void showWelcomeMessage() {
        System.out.println("Welcome to Basic Calculator");
        System.out.println("please follow the steps for get the calculation done");
        System.out.println("----------------------------------------------------");
    }

    public static void askFirstOperand() {
        // since println() moves the cursor to the next line, we'll use just print()
        // this will give us a nice way to let message and value in same line
        System.out.print("Please provide first operand ");
    }

    public static void askOperation() {
        System.out.print("Please select operation + - / * ");
    }

    public static void askSecondOperand() {
        System.out.print("Please provide second operand ");
    }

    public static void showResult(int result) {
        System.out.println("-------------------------------------------");
        System.out.println("The result of the operation is = " + result);
    }

    public static void showBye() {
        System.out.println("Thanks for using Basic calculator, see you soon!");
    }
}
```

### Input.java
1. Create a `.java` file with the name `Input.java`
1. This class will contain only messages that we are going to show to the user
1. In this class we'll use a class from the JDK (*Java Development Kit*) `Scanner`
```java
// in java we have a Scanner class that gives us possibility to read user's input
// when we need to use class from other package we need to explicitly "import" them
// java.util.Scanner = there's somewhere a folder [java] with with a subfolder [util] which contains a file Scanner.java
// in this case the JDK give this class to us
import java.util.Scanner; 

public class Input {

    // we create a variable scanner and assign to it a new instance of scanner
    static Scanner scanner = new Scanner(System.in);

    // this function will read first operand
    public static int getOperand1() {

        int result = scanner.nextInt();

        return result;
    }

    // as you see, here we use variable with name: result, just like in the function getOperand1()
    // it is not same variables, because it is defined in a the scope of a different function
    public static String getOperation() {
        String result = scanner.next();

        return result;
    }

    // this function will read second operand
    // notice any difference between this one and getOperand2() ?
    // can we improve this part ?
    public static int getOperand2() {
        int result = scanner.nextInt();

        return result;
    }
}
```

### CalculationUnit.java
1. Create a `.java` file with the name `CalculationUnit.java`
1. This class will contain only the calculation part

```java
public class CalculationUnit {

    public static int calculate(int operand1, String operation, int operand2) {
        // we create a "placeholder" variable to use later for holding the result
        int result = 0;

        // find what should we do depending on the selected operation
        switch (operation) {
            case "+":
                    result = operand1 + operand2;
                break;
            case "-":
                    result = operand1 - operand2;
                break;
            case "*":
                    result = operand1 * operand2;
                break;
            case "/":
                    result = operand1 / operand2;
                break;
        }

        return result;
    }

}
```

## Run
{{< tabs "run" >}}
{{< tab "Intellij Idea" >}}
- Open `App.java`
- Right click inside the file and click *Run*

**OR**

- Click on little green triangle, that looks like *play* located on the same line as to `public static void main(..)`.

[If you cannot find it then click here for details](https://www.jetbrains.com/help/idea/running-applications.html).
{{< /tab >}}
{{< tab "Terminal" >}}
Navigate to the location of the file `App.java` with **cd** command, e.g. `cd /home/$USER/calculator`. 
```shell script
javac App.java
java App
```

After launching terminal command you'll see newly generated `.class` files. You can try to open them with any text editor. 
They look funny as they are binary files, compiled by `javac` compiler. The content is `bytecode`, something understood by the JVM.

{{< /tab >}}
{{< /tabs >}}