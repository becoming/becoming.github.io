---
weight: 4
bookFlatSection: true
title: "Episode 5, Code architecture"
---

# Episode 5

Code architecture - way of organizing your code.

> Organizing your code in a meaningful manner helps when you want to
> maintain, extract parts of it, create libs, test, define the visibility.

Updated code and source examples are located here : [github.com/becoming/code-architecture/](https://github.com/becoming/code-architecture/)

We can distinguish 2 main types of architecture of the code: 
 - Feature based.
 - Layer based.

## Feature based

In a feature based architecture you group files in __packages__ by their __BUSINESS__ meaning.

This can be useful when you are building monoliths, apps that are doing multiple things.
One monolith can do multiple jobs in one single domain, as well can do multiple jobs for multiple domains.
It all depends on how big it.

There are developers who are using __layer based architecture__ even in monoliths. This is far from being optimal
as each and every __packages__ has lots of classes and when you think about developing a feature, you need to pay
attention of what class you change as it might impact multiple features at once.

> The bigger the monolith is - the harder is to maintain it.

### Use case

We have one monolith for all the use cases:
- manage the users.
- __AND__ their image galleries.
- __AND__ the uploaded files.
- __AND__ a basket for this e-commerce website that sells images (_like https://www.shutterstock.com_).

### Example

Here's a list of commonly used packages and examples of files names inside:

- __user__ - UserController, UserService, UserRepository, UserEntity.java, AddressEntity, CountryEntity, AddressValidationHelper
- __card__ - CardController, CardService, CardRepository, CardEntity

Here's a visual example:

![](https://raw.githubusercontent.com/becoming/code-architecture/master/feature-based-architecture/file-tree.png)

### Special cases

If one of the feature packages becomes large, you can always start using the layered based architecture within the feature package.
At some point you'll start to think that it can be a good idea to extract this particular feature into a dedicated microservice.
Or an application that runs on its own.

In some cases you might need some kind of __core__ package that hase the common functionality.
Generally speaking it is a good idea to extract this to a external library. Or create the needed function next to the actual usage.

- __core__ - StringHelper

## Layer based

In a layer based architecture you group files in __packages__ by their __TECHNICAL__ meaning.

This can be useful when you are building __microservices__.
One microservice is supposed to do one job in one single domain.

### Use cases

We have multiple microservices, one per use case:
- manage the users.
  - _CRUD for a list of users._
- image gallery.
  - _manages the albums and their information._
  - _have references to the actual files from another microservice._
- file service.
  - _CRUD for a list of files and their metadata._
- basket for a e-commerce website.

Therefore, we are expected to have only one feature that is to be covered by the code of the µs in question.

### Example

Here's a list of commonly used packages and examples of files names inside:

- __controllers__ - UserController, CardController
- __services__ - UserService, CardService
- __repositories__ - UserRepository, CardRepository
- __entities__ - UserEntity.java, AddressEntity, CountryEntity, CardEntity
- __helpers__ - AddressValidationHelper, StringHelper

Here's a visual example:

![](https://raw.githubusercontent.com/becoming/code-architecture/master/layer-based-architecture/file-tree.png)

## ArchUnit - Test the architecture

In case you plan to unit test the architecture or the applications you work on, 
one the greatest solutions is : https://www.archunit.org/.

It'll help you easily describe tests who'll check that all the naming conventions are in place.
There are no useless packages, badly named classes, etc.