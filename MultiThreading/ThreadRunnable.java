public class ThreadRunnable {

	public static void main(String args[]) {

		 Multithread mi = new Multithread();
		 Thread t = new Thread(mi);
		 t.start();
	}
}

class Multithread implements Runnable {

	public void run(){
		System.out.println("Thread is running");
	}
}