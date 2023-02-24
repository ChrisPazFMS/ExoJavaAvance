public class TestThread extends Thread {

	public TestThread(String name) {
		super(name);
	}

	public void run() {

		for (int i = 0; i < 5; i++) {

			if (i < 4) {
				System.out.print(this.getName());
			} else {

				System.out.print(this.getName());
				System.out.println();

			}

		}

	}
}
