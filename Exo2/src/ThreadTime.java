import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.time.LocalDateTime;
import java.util.Date;

public class ThreadTime {

	public static void main(String[] args) {

		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		Thread thread = new Thread(new MonRunnable(1000));

		System.out.print(df.format(new Date()) + "\b\b\b\b\b\b\b\b");

		thread.start();

	}

	private static class MonRunnable implements Runnable {

		private long delai;
		public DateFormat df = new SimpleDateFormat("HH:mm:ss");

		public MonRunnable(long delai) {
			this.delai = delai;
		}

		@Override
		public void run() {

			while (true) {

				try {

					

					Thread.sleep(delai);

					System.out.print(df.format(new Date()) + "\b\b\b\b\b\b\b\b");

				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	}
}