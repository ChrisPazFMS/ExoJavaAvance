package fr.fms.app;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import fr.fms.business.IMenuRestoImpl;
import fr.fms.entities.Color;

public class AdvEx3File {
	public static final String[] STARTER = { "entrée", "salade", "soupe", "quiche", "aucune" };
	public static final String[] DISHES = { "plats", "poulet", "boeuf", "poisson", "végétarien", "vegan", "aucun" };
	public static final String[] SIDE_DISH = { "accompagnements", "riz", "pates", "frites", "légumes", "aucun" };
	public static final String[] DRINKS = { "boissons", "eau plate", "eau gazeuze", "soda", "vin", "aucune" };
	public static final String[] DESSERTS = { "desserts", "tarte maison", "mousse au chocolat", "tiramisu", "aucun" };

	public static void main(String[] args) throws IOException {
		
		/**
		 * Instanciation de la class IMenuRestoImpl qui implémente l'interface
		 * IMenuResto !
		 */
		
		IMenuRestoImpl menu = new IMenuRestoImpl();

		/**
		 * Création du fichier texte avec une la méthode createdFile() qui vérifie si le
		 * fichier n'existe pas !
		 */
		
		//String fileNameString = "commande_menu_27-02-2023.txt";
		String fileNameString = "commande_menu.txt";
		menu.createdFile("commande_menu");

		System.out.println("\n\nBonjour, combien de menus souhaitez vous ?");
		Scanner scan = new Scanner(System.in);
		int nbMenu;
		while (scan.hasNextInt() == false)
			scan.next();
		nbMenu = scan.nextInt();

		List<String> orderList = new ArrayList<String>();

		for (int i = 0; i < nbMenu; i++) {
			System.out.println("Commande numéro " + (i + 1));
			int result = getInfos(scan, STARTER[0]);
			orderList.add(Color.YELLOW + "**********Résumé de la commande n°" + (i + 1) + "**********" + Color.BLACK);
			if (STARTER.length - 1 > result)
				orderList.add(STARTER[result]);

			result = getInfos(scan, DISHES[0]);
			if (DISHES.length - 1 > result)
				orderList.add(DISHES[result]);

			result = getInfos(scan, SIDE_DISH[0]);
			if (SIDE_DISH.length - 1 > result)
				orderList.add(SIDE_DISH[result]);

			result = getInfos(scan, DRINKS[0]);
			if (DRINKS.length - 1 > result)
				orderList.add(DRINKS[result]);

			result = getInfos(scan, DESSERTS[0]);
			if (DESSERTS.length - 1 > result)
				orderList.add(DESSERTS[result]);

			/**
			 * Copier l'ArrayList et l'enregistrer dans le fichier créé.
			 */

			menu.printMenuTextFile(orderList, fileNameString);
			System.out.println(); // avant de passer à la suivante
		}

		// menu.addTextToFile("Coucou, je suis là !", fileNameString);
		menu.showTextOfFileBuffer(fileNameString);
		scan.close();
		orderList.clear();

	}

	public static int getInfos(Scanner scan, String info) {
		System.out.println("choix " + info + " : ");
		if (info.equalsIgnoreCase(STARTER[0]))
			displayTable(STARTER);
		else if (info.equalsIgnoreCase(DISHES[0]))
			displayTable(DISHES);
		else if (info.equalsIgnoreCase(SIDE_DISH[0]))
			displayTable(SIDE_DISH);
		else if (info.equalsIgnoreCase(DRINKS[0]))
			displayTable(DRINKS);
		else if (info.equalsIgnoreCase(DESSERTS[0]))
			displayTable(DESSERTS);
		System.out.println("que souhaitez vous comme " + info + " ? [saisir le chiffre correspondant]");
		return scan.nextInt();
	}

	public static void displayTable(String[] table) {
		for (int i = 1; i < table.length; i++) {
			System.out.print("[" + i + " - " + table[i].toUpperCase() + "]");
		}
		System.out.println();
	}

}
