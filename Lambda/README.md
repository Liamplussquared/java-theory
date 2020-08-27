# Lambda Expressions

* Introduced in Java 8
* Allow for easier iteration, filtering and extraction with Collections
* `java.util.function`
* A Lambda Expression implements a Functional Interface. 


## Functional Interface

* An interface that has only one abstract method.
* Default and static methods do not count
* Object methods do not count


## Implementing 

Example of functional interface.

```
public interface Supplier<T> {
	T get();
}
```

How to implement this interface?

1. Copy/paste block of parameters 
2. Draw arrow
3. Provide implementation

```
Supplier<String> supplier =
() -> "Hello!";
```