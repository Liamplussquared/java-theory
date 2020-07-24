### JDK vs JRE vs JVM
<details>
<summary> Answer </summary>
JDK = Java Development Kit, the tools to compile, document and package programs.<br>
JRE = Java Runtime Environment, implementation of JVM which executes bytecode<br>
JVM = Java Virtual Environment, provides runtime environment. 
</details>

### Why is Java platform independent?
<details>
<summary> Answer </summary>
Java program are compiled to bytecode which can be run on JVM regardless of underlying OS.
</details>

### What are wrapper classes? 
<details>
<summary> Answer </summary>
Wrapper classes are used to convert Java primitive (int, char, float etc) to Objects.
</details>

### What are constructors?
<details>
<summary> Answer </summary>
Block of code used to initialise an object. Default constructor initialises the object without any input, while a general constructor uses passed parameters to initialise the object. 
</details>

### equals() vs ==
<details>
<summary> Answer </summary>
.equals() is a method, while == is an operator. For objects, unless overridden, equals() evaluates whether two objects are equal based on their values, while == checks if both objects point to the same memory address. 
</details>

### What is a package?
<details>
<summary> Answer </summary>
A package is a collection of related classes and interfaces. The package keyword is inserted at the first line of every source file as well as the package name. <br>
Advantages of using packages are that they help avoid name clashes, create a hierarchical structure and ease testing process.
</details>

### What is JIT compiling?
<details>
<summary> Answer </summary>
JIT is a Just-In-Time compiler. Compiling performed at run time rather than before execution. 
</details>

### Differences between Heap and Stack Memory
<details>
<summary> Answer </summary>
Heap memory used by all parts of the application whereas Stack memory is used only by one thread of execution. Stack memory contains only local primitive variables and reference variables to objects in heap space. <br>
Heap memory lives for the entire application execution, stack memory is short-lived. 
</details>



