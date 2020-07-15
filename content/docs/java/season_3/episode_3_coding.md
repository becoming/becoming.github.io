---
weight: 6
bookFlatSection: true
title: "Episode 3, Contact List - Coding"
---

# Episode 3, Contact List - Coding

[Season 3 - I know Kung Fu](/docs/java/season_3/)

## Letz’ code it

1. Create a empty folder with name `contact-list`.
1. Go inside of this folder.

### App.java
1. Create a `.java` file with the name `App.java`
1. This will be the "*entry point*" in our app
1. While you'll type the code below your IDE will show errors, that's ok, we'll add all the pieces then all the errors will disappear.
    - Please, do not copy paste.
```java
public class App {
    // Did you noticed how NOT-much code we are writing this time ? 
    // Good times are coming!
    public static void main(String[] args) {
        ContactListController controller = new ConsoleController();
        controller.run();
    }
}
```

### ContactListController.java
1. Create a `.java` file with the name `ContactListController.java`
1. This time it'll be an **interface**, so as you clearly see `.java` files can contain not only classes but interfaces as well
    - I wonder if there are any other types ?!
    - We'll see, when the time comes!
1. This **interface** will contain only one function called `run()`
1. **interface**s are used to define which functions must be implemented (*implement = have the code for*)
    - It is correct to say: *A class implements an interface*, meaning it has the code for the functions described in the interface
        - E.g. `public class Admin implements User { }`
    - One class can implement multiple interfaces.
        - E.g. `public class Admin implements User, AuthorizedClient  { }`
1. We'll learn later why we should use them and where, for now letz do our thing and type the code.
1. What is the point of having it ? 
    - Here - No Point!
    - Why ? Just to demonstrate the usage.
```java
public interface ContactListController {
    void run();
}
```

### ConsoleController.java
1. Create a `.java` file with the name `ConsoleController.java`.
1. This class will know what functions to call from what variables in what order, depending on what was asked by the user.
1. We'll implement our first **interface** and our class will be obliged to implement the function from that **interface**.
    - If a class `implements` and **interface** and does not have functions from **interface** compilation will fail.
```java
// we'll need to import some classes , for now they do not exist, but we will write them soon enough
public class ConsoleController implements ContactListController {

    // as you see, a class can have variables inside the class, not only inside functions
    // as well we can assign values right here, this is optional unless variables is marked as "final"
    private ConsoleView view = new ConsoleView();
    private ContactService contactService = new ContactService();

    @Override
    public void run() {
        view.showWelcome();

        while(true) {
            view.showMainMenu();
            int selectedOption = view.getSelection();

            switch (selectedOption) {
                case ConsoleView.CREATE:
                    createContact();
                    break;

                case ConsoleView.LIST:
                    listContacts();
                    break;

                case ConsoleView.UPDATE:
                    updateContact();
                    break;

                case ConsoleView.DELETE:
                    deleteContact();
                    break;

                case ConsoleView.EXIT:
                    view.bye();
                    System.exit(0);
                    break;

                default:
                    view.showUnSupportedOptionMessage();
                    view.waitForKeyStroke();
            }

        }
    }

    private void listContacts() {
        view.listContacts(contactService.getAllContacts());
    }

    private void createContact() {
        view.reset();

        Colleague colleague = new Colleague();

        colleague.setFirstName(view.askFirstName());
        colleague.setLastName(view.askLastName());
        colleague.setDepartment(view.askDepartment());
        colleague.setCompany(view.askCompany());
        colleague.setEmail(view.askEmail());
        colleague.setPhone(view.askPhone());

        contactService.createContact(colleague);
    }

    private void updateContact() {
        Colleague colleague = contactService.getColleagueById(view.askContactId());
        view.reset();

        colleague.setFirstName(view.askFirstName());
        colleague.setLastName(view.askLastName());
        colleague.setDepartment(view.askDepartment());
        colleague.setCompany(view.askCompany());
        colleague.setEmail(view.askEmail());
        colleague.setPhone(view.askPhone());

        contactService.updateContact(colleague);
    }

    private void deleteContact() {
        contactService.deleteContact(view.askContactId());
    }
}
```

### ConsoleView.java
1. Create a `.java` file with the name `ConsoleView.java`
1. This class will handle the display of messages

```java
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ConsoleView {

    // here's how we define constants in Java: "final" and "Upper Case letters", "public static" is optional and very often used
    public static final int CREATE = 1;
    public static final int LIST = 2;
    public static final int UPDATE = 3;
    public static final int DELETE = 4;
    public static final int EXIT = 5;
    public static final int UNSUPPORTED = -1;

    private Scanner scanner = new Scanner(System.in);

    public void showWelcome() {
        System.out.println("");
        System.out.println("Hello to Contact List App");
        System.out.println("-------------------------");
        System.out.println("");
    }

    public void showMainMenu() {
        System.out.println("");
        System.out.println("Please select one of the options to continue:");
        System.out.println("[" + CREATE + "] Create contact");
        System.out.println("[" + LIST + "] List contacts");
        System.out.println("[" + UPDATE + "] Update contact");
        System.out.println("[" + DELETE + "] Delete contact");
        System.out.println("[" + EXIT + "] Exit");
        System.out.println("");
    }

    public int getSelection() {
        System.out.print("Your selection: ");

        // here we'll add some validation to the input of the user, because we do not want to break our app for a simple mistake
        // we'll use something called "try catch block"
        // we try to execute the code in "try block" and if something happens we'll catch the exception then execute the code inside "catch block"
        // in this case our catch block is empty as we 
        try{
            int option = Integer.parseInt(scanner.next());
            // we'll check that provided option is in our range
            if (option >= CREATE && option <= EXIT) {
                return option;
            }
        } catch (Exception ignored){}

        return UNSUPPORTED;
    }

    public void reset() {
        scanner.nextLine();
    }
    
    // you'll notice that the following functions are resemblant to each other, try to reduce them to 1 or 2 functions
    public String askFirstName() {
        System.out.print("First name: ");
        return scanner.nextLine();
    }

    public String askLastName() {
        System.out.print("Last name : ");
        return scanner.nextLine();
    }

    public String askDepartment() {
        System.out.print("Department : ");
        return scanner.nextLine();
    }

    public String askCompany() {
        System.out.print("Company : ");
        return scanner.nextLine();
    }

    public String askEmail() {
        System.out.print("Email : ");
        return scanner.nextLine();
    }

    public String askPhone() {
        System.out.print("Phone : ");
        return scanner.nextLine();
    }

    public int askContactId() {
        System.out.print("Please input a contact id to proceed : ");
        return scanner.nextInt();
    }

    public void showUnSupportedOptionMessage() {
        System.out.println("");
        System.out.println("We are sorry, but this option is not supported");
        System.out.println("..but this might change in the future releases!");
        System.out.println("-----------------------------------------------");
        System.out.println("");
    }

    public void waitForKeyStroke() {
        System.out.println("");
        System.out.println("press any key to continue..");
        System.out.println("");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listContacts(List<Contact> allContacts) {
        System.out.println("");
        System.out.println("Listing all contacts: ");
        System.out.println("");
        for (Contact contact : allContacts) {
            System.out.println("Contact #" + contact.getId());
            System.out.println(contact.toString());
            System.out.print("");
        }

        System.out.println("");
        System.out.println("------------------------");
        System.out.println("");
    }

    public void bye() {
        System.out.println("Thanks for using contact list!");
        System.out.println("See you soon!");
    }
}
```

### ContactService.java
1. Create a `.java` file with the name `ContactService.java`
1. This class will perform some simple business actions, like save data in a storage
```java
import java.util.List;

public class ContactService {

    private ContactsRepository contactsRepository = new InMemoryContactsRepo();

    public void createContact(Contact contact) {
        contactsRepository.create(contact);
    }

    public List<Contact> getAllContacts() {
        return contactsRepository.readAll();
    }

    public Colleague getColleagueById(int id) {
        return (Colleague) contactsRepository.read(id);
    }

    public void updateContact(Contact contact) {
        contactsRepository.update(contact);
    }

    public void deleteContact(int id) {
        contactsRepository.delete(id);
    }
}
```

### ContactsRepository.java
1. Create a `.java` file with the name `ContactsRepository.java`
1. This is our second interface and will describe functions for saving data
1. Did you noticed that interfaces have no private things so far ?
    - This is because an interface describes a contract, therefore everything is **public** by default.
    - If you want to do some private things, you can.
    - But this is a topic for other lesson.
```java
import java.util.List;

public interface ContactsRepository {

    long create(Contact contact);

    Contact read(long id);

    List<Contact> readAll();

    void update(Contact contact);

    void delete(long id);

    void delete(Contact contact);
}

```

### InMemoryContactsRepo.java
1. Create a `.java` file with the name `InMemoryContactsRepo.java`
1. This is the second class that will implement an **interface**
1. We'll have more code this time, more functions to *implement*
```java
import java.util.ArrayList;
import java.util.List;

public class InMemoryContactsRepo implements ContactsRepository {

    private List<Contact> contacts = new ArrayList<>();

    @Override
    public long create(Contact contact) {
        long index = contacts.size();
        contact.setId(index);
        contacts.add(contact);

        return index;
    }

    @Override
    public Contact read(long id) {
        for(Contact c : contacts) {
            if(c.getId() == id) {
                return c;
            }
        }

        return null;
    }

    @Override
    public List<Contact> readAll() {
        List<Contact> result = new ArrayList<>(contacts.size());
        result.addAll(contacts);
        return result;
    }

    @Override
    public void update(Contact contact) {
        for(Contact c : contacts) {
            if(c.getId() == contact.getId()) {
                contacts.remove(c);
                contacts.add(Math.toIntExact(c.getId()), contact);
                break;
            }
        }
    }

    @Override
    public void delete(long id) {
        Contact toRemove = null;
        for(Contact c : contacts) {
            if(c.getId() == id) {
                toRemove = c;
                break;
            }
        }

        if(toRemove != null) {
            contacts.remove(toRemove);
        }
    }

    @Override
    public void delete(Contact contact) {

    }
}

```

### Colleague.java
1. Create a `.java` file with the name `Colleague.java`
1. A class that'll work as data structure, it'll hold the information about a colleague and will give functions to change or retrieve the values.
```java
public class Colleague extends Contact {

    // why private ? oh.. this questions is very religious, we'll talk about it one other day
    private String department;
    private String company;
    
    // the function that starts with "get" usually are called "getters"
    public String getDepartment() {
        return department;
    }

    // the function that starts with "set" usually are called "setters"
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Colleague{" +
                "department='" + department + '\'' +
                ", company='" + company + '\'' +
                "} " + super.toString();
    }
}
```
### Contact.java
1. Create a `.java` file with the name `Contact.java`
```java
public abstract class Contact {
    private long id;

    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
```
### Friend.java
1. Create a `.java` file with the name `Friend.java`
```java
public class Friend extends Contact {

    String personalPhone;
    String personalEmail;

    public String getPersonalPhone() {
        return personalPhone;
    }

    public void setPersonalPhone(String personalPhone) {
        this.personalPhone = personalPhone;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
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