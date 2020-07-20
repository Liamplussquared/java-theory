# Generics

Extends Java's type system to allow a type/method to operate on objects of various types. Generics in Java also aim to provide compile-time type safety, by allowing invalid types to be caught at compile time.

E.g. a single sort method that could sort a String array, an Integer array etc. 

Use `<>` to specify parameter types. 

E.g. `BaseType<Type> obj = new BaseType<Type>()`

## Generics Classes 

### GenericPrinting.java
_<E>_ is the type parameter, precedes the return type.
Type parameters/type variables act as placeholders for the types of the arguments passed to the generic method. 

### Bounded Type Parameters 
Used to restruct kind of types allowed as a type parameter. 
To declare bounded type parameter, `TypeParaName extends UpperBound`.
E.g. `T extends Comparable<T>` 

