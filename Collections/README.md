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
LIFO, legacy class. ArrayDequeue is an alternative, faster and not thread safe. 
Extends Vector. Additional methods include `pop()`, `push()`, `empty()`, `search()`, `peek()`. 	
`List <data-type> list = new Stack(); `


## QUEUE INTERFACE
FIFO principle, like real world queues. Dedicated to storing elements where order matters.

### Priority queue 
Elements placed in queue based on some priority. Elements ordered based on Comparator. 
`PrioritiyQueue<data-type> pq = new PriorityQueue<data-type>();`


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