# Multithreading

---

Two ways to create a thread

1. Extend thread class & override run method 

```
public class ThreadExtends extends Thread {

	@Override
	public void run() {
		// do something
	}
}
```

An object of Multi can be created and run by calling the `start()` method.

```
public class Example {
	public static void main(String args[]) {
		ThreadExtends obj = new ThreadExtends();
		obj.start()
	}
}
```

2. Implement Runnable interface

```
public class ThreadRunnable implements Runnable {

	public void run() {
		// do something
	}
}
```

An object of ThreadRunnable and passed to Thread constructor. 

```
public class Example {
	public static void main(String args[]) {
		ThreadRunnable obj = new ThreadRunnable();
		Thread t = new Thread(obj);
		obj.start();
	}
}
```

---

## Differences between exnteding Thread & implementing Runnable

Implementing runnable allows for hte programmer to extend any class, while extending Thread removes this ability. 

By extending Thread, each thread has a unique object associated with it, whereas threads that implement Runnable can share the same object instance. 

---