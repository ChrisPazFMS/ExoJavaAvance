import java.util.Date;

public class Exo1 {

	public static void main(String[] args) throws Exception {

//		/**
//		 * exo 1
//		 */
//
//		Date date = null;
//		Date today = new Date();
//		try {
//			System.out.println(date.getClass().getName());
//
//		} catch (NullPointerException e) {
//
//			System.out.println("Une erreur s'est produite parce que " + e.getMessage());
//			System.out.println(today.getClass().getName());
//		}
//
//		/**
//		 * exo 2
//		 */
//		CityConstructeur toulouse = new CityConstructeur("Toulouse", "France", 577000);
//
//		try {
//			toulouse.display();
//
//			toulouse.setPeople(toulouse.getPeople() + 400);
//			toulouse.display();
//			toulouse.setPeople(toulouse.getPeople() - 400);
//			// toulouse.setPeople(-400);
//			toulouse.display();
//
//		} catch (ExceptionalPopulation e) {
//
//			e.printStackTrace();
//
//		} catch (NegativePopulation e) {
//			
//			e.printStackTrace();
//
//		} finally {
//
//			toulouse.setPeople(toulouse.getPeople() + 400);
//			toulouse.display();
//			toulouse.setPeople(toulouse.getPeople() + 400);
//			toulouse.display();
//
//		}

		Date[] toto = { new Date(), new Date(), null, new Date() };

		for (int i = 0; i < toto.length; i++) {

			try {
				System.out.println(toto[i].getClass().getName());

			} catch (NullPointerException e) {
				e.printStackTrace();
			}

		}

		;
	}

}