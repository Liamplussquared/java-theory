# Java Packages

A package is a group of classes, interfaces and sub-packages. Packages in Java organize classes into namespaces. Each namespace is unique. 

## Built-in packages
Include `java`, `lang`, `awt`, `javax`, `swing`, `net`, `io`, `util`, `sql` and more.

[Chart]: "https://facingissuesonitcom.files.wordpress.com/2019/09/java-most-common-built-in-packages.jpg"


## User-defined packages

### Why create packages?
1. Categorising classes/interfaces leads to easier maintaining
2. Access protection
3. Removes naming collision

### `package` keyword
The `package` keyword declares a 'name space' for the Java class. It's put at the top of the file and is used to create a package. The `package` keyword must be placed in every _source_ file!.

To compile the package, use `javac -d . PackageName.java`.
`-d .` specifies that the .class file(s) should be stored in the same directory. 
