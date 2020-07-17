## Why OOP?
- Modularity for easy troubleshooting
- Keep to DRY (_Don't Repeat Yourself_) principle
- Polymorphism allows for greater flexibility
- Easier problem solving process

## OOP Principles

### Encapsulation 
Controlling access to class from outside. Achieved using _access modifers_

| Modifer   | Class | Package | Subclass | Global |
|-----------|-------|---------|----------|--------|
| Public    | Y     | Y       | Y        | Y      |
| Protected | Y     | Y       | Y        | N      |
| Default   | Y     | Y       | N        | N      |
| Private   | Y     | N       | N        | N      |

### Inheritance
Subclass can inherit attributes/methods from superclass. Uses `extends` keyword. 

### Polymorphism
Allows methods to take different forms. Achieved via _method overriding_ in a subclass or _method overloading_ in the superclass. 

### Abstraction
Hiding implementation complexity while only showing essential features. Achieved via _abstract classes_ and `abstract` keyword, or _interfaces_. 

An interface is a completely abstract class. 

Abstract classes and interfaces cannot be used to create objects. Subclasses must implement them.

## Modifiers 

### _static__
Attributes / methods belong to class rather than an instance.

### _abstract_
An abstract class cannot be instantiated. Must be inherited from another class.

Only usable in abstract classes with methods. Method has no body. Implementation of method left to subclass.

### _synchronised__
Method only available to one thread at a time. 