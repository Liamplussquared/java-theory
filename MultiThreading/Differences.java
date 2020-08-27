class ImplementsRunnable implements Runnable {
	private int counter = 0;

	public void run() {
		counter++;
		System.out.println("ImplementsRunnable counter : " + counter);
	}
}


class ExtendsThread extends Thread {

	private int counter = 0;

	public void run() {
		counter++;
		System.out.println("ExtendsThread counter : " + counter);
	}
}


public class Differences {
	public static void main(String args []) {

		// create instance of class which implements Runnable
		ImplementsRunnable rn = new ImplementsRunnable();

		// create threads and run them
		Thread t1 = new Thread(rn);
		t1.start();
		try{Thread.sleep(1000);} catch (InterruptedException e) {System.out.println(e);}
		Thread t2 = new Thread(rn);
		t2.start();
		try{Thread.sleep(1000);} catch (InterruptedException e) {System.out.println(e);}
		Thread t3 = new Thread(rn);
		t3.start();


		// create instances of ExtendsThread and run threads
		ExtendsThread et1 = new ExtendsThread();
		et1.start();
		try{Thread.sleep(1000);} catch (InterruptedException e) {System.out.println(e);}
		ExtendsThread et2 = new ExtendsThread();
		et2.start();
		try{Thread.sleep(1000);} catch (InterruptedException e) {System.out.println(e);}
		ExtendsThread et3 = new ExtendsThread();
		et3.start();

		// As demonstrated, ImplementsRunnable threads share same counter variable while ExtendsThread threads have unique values.
	}
}