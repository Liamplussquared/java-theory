# COLLECTIONS

The collections framework is a set of classses and interfaces that implement commonly used reusable collection data structures. Works as a library. Collection framework provides interfaces that define collections and classes that implement them. 

## HIERARCHY:

List, Queue, Set interfaces extends Collection interface, which extends Iterable interface.
ArrayList, LinkedList, Vector, ... implement list.
PriorityQueue implements Queue, Deque extends Queue.
HashSet, LinkedHashSet implements Set. SortedSet extends Set.

## Methods in Collection interface
`add()`, `remove()`, `size()`, `clear()`, `contains()`, `toArray()`, ...

## ITERATOR INTERFACE
Allows iterating elements in collection in forward direction. 
`hasNext()`, `next()`, `remove()`, ...


## LIST INTERFACE
Can have duplicates

### Array List
Dynamics arrays, non-fixed size. Can't be used with primitives, need wrapper classes. (Integer instead of int)
`List <data-type> list= new ArrayList();`  

### Linked List
Chain of links, elements not stored in contiguous locations. Every element has data part and address part. Linked via pointers.	
`List <data-type> list = new LinkedList();`

### Vector
Identical to Array List except Vectors are synchronized. 	
`List <data-type> list = new Vector();`  


### Stack
LIFO, legacy class. ArrayDeque is an alternative, faster and not thread safe. 
Extends Vector. Additional methods include `pop()`, `push()`, `empty()`, `search()`, `peek()`. 	
`List <data-type> list = new Stack(); `


## QUEUE INTERFACE
FIFO principle, like real world queues. Dedicated to storing elements where order matters.

### Priority queue 
Elements placed in queue based on some priority. Elements ordered based on Comparator. 
`PrioritiyQueue<data-type> pq = new PriorityQueue<data-type>();`


## DEQUE INTERFACE
Extends Queue interface. Double-ended queue where elements can be added/removed from both ends. _ArrayDeque_ implements this interface.
`Deque<data-type> ad = new ArrayDeque<data-type>();`

## ArrayDeque
Double-ended, grow dynamically.
`pushFirst(), pushLast(), pollFirst(), pollLast(),...`


## SET INTERFACE
Store unordered collections of objects, no duplicates. Implemented by _HashSet, TreeSet, LinkedHashSet_. 

### HashSet
Implementation of hash table data structure. Objects inserted based on how they're hashed. Unordered collection, doesn't maintain order in which elements are inserted. Internally uses HashMap to store its elements. 

### LinkedHashSet
Uses doubly linked list to store the data. Maintains insertion order. 


## SORTED SET INTERFACE
Extends Set interface. Implementations maintain ordering of elements. 

### Tree Set
Uses tree to store data in ascending order. 


## MAP INTERFACE
Mapping of key/value pairs. Cannot have duplicate keys. Implemented by _HashMap_, _TreeMap_, _SortedMap_.

### HashMap
(Key, value) pairs. Key is hashed, value placed at location in table.
`.put(), .get(), ...`



### Questions
What are the two ways to iterate the elements of a collection?

What is the difference between ArrayList and LinkedList classes in collection framework?

What is the difference between ArrayList and Vector classes in collection framework?

What is the difference between HashSet and HashMap classes in collection framework?

What is the difference between HashMap and Hashtable class?

What is the difference between Iterator and Enumeration interface in collection framework?

How can we sort the elements of an object? What is the difference between Comparable and Comparator interfaces?

What does the hashcode() method?

What is the difference between Java collection and Java collections?