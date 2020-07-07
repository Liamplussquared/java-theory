# Design Patterns

## What are they?
Well proved solutions to specific problems/tasks. Come in three main varieties, **creational**, **structural** and **behavioural**. 

## Why use them?
Can allow programmer to be more efficient by using methods refined by others without reinventing the wheel.
Design patterns are reusable in different projects, provide transparanecy to design of application, well proved and tested. 

### Singleton 
*Creational* 
Used for when only a single instance of a class should exist. E.g. caches, thread pools, registries. 
Achieved by making constructor private to class intended as a singleton. 

### Factory Method
*Creational*
Allow creation of objects without exposing creation logic to client. Refer to the created object using a common interface.

Shape is an interface which is implemented by Circle, Square and Rectangle. ShapeFactory takes input from FactoryPatternDemo and uses that input to create the appropriate object. 

### Strategy 
*Behavioural*
Grouping related algorithms together under an abstraction, can switch between algorithms without modifying the client. The code receives instructions specifying which group of algorithms to run.

Various Operations implement the Strategy interface. StrategyPatternDemo creates new Contexts which execture the Operations (or strategies).

### Observer
*Behavioural*
One-to-many depdency between objects. When the state of an object changes, all its dependents are notified. 

Various Observers extend the abstract Observer class. When the state of the subject is changed, all observers are notified via `notifyAllObservers()` method. 

### Builder
*Creational*
This pattern builds a complex object using simpler objects and a step-by-step approach. 

MealBuilder provides defined Meal objects, which are complex objects composed of other simpler objects.

### Adapter
*Structural*
Behaves as a bridge between incompatible interfaces. Combines the capabilities of two independent interfaces. 

AdvancedMediaPlayer and MediaPlayer are two interfaces. VlcPlayer and Mp4Player implement AdvancedMediaPlayer. MediaAdapter and AudioPlayer implement MediaPlayer. *MediaAdapter* acts as a bridge between AdvancedMediaPlayer and MediaPlayer, and AudioPlayer uses this concrete class to have all functionality available to the demo.

### State
*Behaviour*
Allows the behaviour of a class to change based on its state. In this pattern, objects are created which represent different states and a context object whose behaviour changes based on its state object. 

StartState and StopState implement State. When either perform doAction they update the state of context object. 