public class ThreadExtends {
	public static void main(String args[]) {
		Multithread t = new Multithread();
		t.start();
	}
}

class Multithread extends Thread {
	public void run() {
		while (true) {
			System.out.println("A thread is running");

			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}

		}
	}
}