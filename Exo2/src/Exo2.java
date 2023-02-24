public class Exo2 {
	/**
	 * 2.1
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
//		TestThread t1 = new TestThread("1-");
//		TestThread t2 = new TestThread("2--");
//		TestThread t3 = new TestThread("3---");
//		TestThread t4 = new TestThread("4----");
//		TestThread t5 = new TestThread("5-----");
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
//		t5.start();

		/**
		 * 2.2
		 * 
		 * @param args
		 */
		Thread thread = new Thread(new TestRunnable());

		thread.run();
		
	}
}
