
public class TestRunnable implements Runnable {

	public void run() {

		char a = 33;
		char ascii = 42;
		String in = "";

		for (int i = 0; i < 10; i++) {
			in += ascii;
			System.out.print(a + in + a + "\n");
			a++;
		}
	}
}