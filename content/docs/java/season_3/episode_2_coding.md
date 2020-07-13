---
weight: 5
bookFlatSection: true
title: "Episode 2, Exchange - Coding"
---

# Episode 2, Exchange - Coding

[Season 3 - I know Kung Fu](/docs/java/season_3/)

## Letz’ code it

1. Create a empty folder with name `exchange`.
1. Go inside of this folder.

### App.java
1. Create a `.java` file with the name `App.java`
1. This will be the "*entry point*" in our app
1. While you'll type the code below your IDE will show errors, that's ok, we'll add all the pieces then all the errors will disappear.
    - Please, do not copy paste.
```java
public class App {

    /*
    notice, this time we use a block comment, rather than prefixing each line with //
    as usual, we have our starting "main" function
    this time, we'll add a new element:  throws Exception 
    this means that our app could encounter a abnormal situation that might stop the execution
    and we have to state this at the level of the declaration of our function
    */
    public static void main(String[] args) throws Exception {

        /*
        we are creating instances with the "new" keyword
        our variables will get materialized and will receive a "living" copy of the class after "new" keyword
        */
        ConsoleInput consoleInput = new ConsoleInput();
        Display display = new Display();
        CalculationUnit calculationUnit = new CalculationUnit();

        // then, we'll use our variables to call their functions in a logical order, just like we would do in real life
        // try to read the following code as "a human"
        display.showWelcomMessage();

        display.askBaseCurrency();
        String baseCurrency = consoleInput.readAString();

        display.askDestCurrency();
        String destCurrency = consoleInput.readAString();

        display.askAmount();
        int amount = consoleInput.readANumber();

        double result = calculationUnit.calculate(baseCurrency, destCurrency, amount);

        display.showResult(result);
        display.showBye();
    }

}

```

### Display.java
1. Create a `.java` file with the name `Display.java`
1. This class will contain only messages that we are going to show to the user

```java
class Display {

    void showWelcomMessage() {
        System.out.println("Welcome to Currency Exchange");
        System.out.println("please follow the steps for get the transaction done");
        System.out.println("----------------------------------------------------");
    }

    void askBaseCurrency() {
        System.out.print("Please provide the base currency (e.g. eur, usd, mdl) = ");
    }

    void askDestCurrency() {
        System.out.print("Please provide the destination currency (e.g. eur, usd, mdl) = ");
    }

    void askAmount() {
        System.out.print("Please provide the amount you want to exchange = ");
    }

    void showResult(double result) {
        System.out.println("-------------------------------------------");
        System.out.println("The result of the operation is = " + result);
    }

    void showBye() {
        System.out.println("Thanks for using Currency Exchange, see you soon!");
    }
}

```

### Input.java
1. Create a `.java` file with the name `ConsoleInput.java`
1. This class will contain only messages that we are going to show to the user
1. In this class we'll use a class from the JDK (*Java Development Kit*) `Scanner`
```java
import java.util.Scanner;

class ConsoleInput {

    private Scanner scanner = new Scanner(System.in);

    String readAString() {
        return scanner.nextLine();
    }

    int readANumber() {
        return scanner.nextInt();
    }
}
```

### CalculationUnit.java
1. Create a `.java` file with the name `CalculationUnit.java`
1. This class will contain only the calculation part

```java
class CalculationUnit {

    double calculate(String baseCurrency, String destCurrency, int amount) throws Exception {

        // in previous example we learned that a function can return it's result to a variable
        // here we can see that we can return the result directly, no extra variables are needed
        switch (baseCurrency) {
            case "eur":
                return fromEur(destCurrency, amount);
                break;
            case "usd":
                return fromUsd(destCurrency, amount);
                break;
            case "mdl":
                return fromMdl(destCurrency, amount);
                break;
    
            // in previous example we did not cared about error cases, here we do
            // if a user entered a different currency, we'll stop the execution of the program 
            // and will notify JVM that this is a exceptional case, not supported byt this app.
            default:
                throw new Exception("Unsupported currency provided!");
        }
    }

    // functions with "private" are not visible outside of this class, but are usable within it
    // they are good to be used in order to split logic into smaller blocks of code
    // this is easier for a human to ingest 
    private double fromEur(String destCurrency, int amount) {
        switch (destCurrency) {
            case "usd":
                return amount * 1.19;
            case "mdl":
                return amount * 19.61;
            default:
                return -1;
        }
    }
    
    private double fromUsd(String destCurrency, int amount) {
        switch (destCurrency) {
            case "eur":
                return amount * 0.9;
            case "mdl":
                return amount * 17.52;
            default:
                return -1;
        }
    }

    private double fromMdl(String destCurrency, int amount) {
        switch (destCurrency) {
            case "usd":
                return amount * 0.057;
            case "eur":
                return amount * 0.0509;
            default:
                return -1;
        }
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