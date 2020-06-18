---
weight: 6
title: "Data and Structures"
---
# Data and data structures

## Data

### Definition

Data - https://en.wikipedia.org/wiki/Data_(computing) - is any sequence of one or more symbols given meaning by specific act(s) of interpretation.
E.g. Information about transactions, a receipe for burito, information about citizens like birthdate, first name, last name, etc.

## Data structure

### Definition

In computer science, a [data structure](https://en.wikipedia.org/wiki/Data_structure) is a particular way of organizing data in a computer so that it can be used efficiently

Way of organizing a list of users, set of cars, dictionary of words where you have the word and the explanation of it, a guest list, contact list, data from passport.

See also: 
1. [Java Arrays - practical examples](../Arrays.java)
1. [Arrays](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
1. [Java Arrays](https://youtu.be/D-ni5Wzbq1o?list=PLPkoWZmDIKwCvNeBpZMejx8gQhglUxw-w)

## Examples

### Array

An array is a number of elements in a specific order. Imagine a list of numbered positions and on each position we have a value.

> The first position is 0 (_zero_), not 1 (_one_):

> Just remember: in informatics we count from 0 (_zero_), not from 1 (_one_)

```java
public class Main {
    public static void main(String[] args) {
        
        String[] myArray = {"Mariah Carey", "Metallica"}; // create new array with 2 elements / 2 positions: 0 and 1
        myArray[1] = "Spiderman";// add new value to position 1 int this array, we basically override "Metallica" with "Spiderman"
        
        // iterate over array
        for(int i = 0; i < myArray.length; i++) {
           System.out.print(i); // print current index
           System.out.print(": ");
           System.out.println(myArray[i]); // print value stored under current index
        }
        
    }
}
```

Output example:

    0: MariahCarey
    1: Spiderman

### List

Linear collections are objects that represents a group of objects.

1. List is advanced version of an array
1. LinkedList is a variation of list, where each node points to the next node in the linked list
1. ArrayList is an array-like list


1. [Lists - code example](../Lists.java)
1. [Lists - video example](https://www.youtube.com/watch?v=rfbHEx-HDN0)
1. [Collections](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html)
1. [List](https://docs.oracle.com/javase/tutorial/collections/interfaces/list.html)

```java
import java.util.LinkedList;
import java.util.List;


// listItem_0 --> is a demonstrative name, in real world you would use a name like: listItem, firstListItem, etc.
// 0 (zero) = 1st item, because in programming all languages consider 0 as being the first position in a Array/List/etc.
// Therefore a list with 3 items would have the positions 0, 1, 2 --> [pos_0, pos_1, pos_2]
 public class Main {
    public static void main(String[] args) {
        
        List<String> myList = new LinkedList<>(); 
        
        myList.add("Mariah Carey"); // add element on current position which is 0 zero
        myList.add("Metallica"); // add element on current position 1, because Mariah is already on the first one
        myList.add("Spiderman"); // add element on current position 2
    
        myList.forEach(System.out::print); // iterate over the list to display all the elements

        String listItem_0 = myList.get(0); // retrieve the 1st item from list and assign it to a string variable, remember, variable and content should have same type
        
        String listItem_1 = myList.get(1); // retrieve 2nd item
        String listItem_2 = myList.get(2); // etc.
    }
}
```

### Associative array, key -> value based map

In computer science, an associative array, map, symbol table or dictionary is an abstract data type composed of a
collection of (key, value) pairs, such that each possible key appears at most once in the collection

1. [Associative array](https://en.wikipedia.org/wiki/Associative_array)
1. [Map](https://docs.oracle.com/javase/tutorial/collections/interfaces/map.html)

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
        // This part is similar to the list, but here we have custom keys instead of numeric positions (indexes)
        Map myMap = new HashMap<>();
        
        myMap.put("singer", "Mariah Carey");
        myMap.put("band", "Metallica");
        myMap.put("movie", "Spiderman");
        
        Set<Map.Entry<String, String>> set = myMap.entrySet();
        
        // we get list of entries from the map and we assign it to a variable with name set which has as type a Set structure of elements, and each element is a Map.Entry which contains a key of type String and a value of type String
        
        // then, for each entry from the set of entries of our map
        // we print entry’s key and value
        for(Map.Entry<String, String> entry: set) {
           System.out.print(entry.getKey());
           System.out.println(entry.getValue());
        }
    }
}
```