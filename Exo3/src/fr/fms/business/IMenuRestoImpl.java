package fr.fms.business;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import fr.fms.entities.Color;
import fr.fms.exception.FileAlreadyExistsException;
import fr.fms.exception.FileNotExist;

/**
 * 
 * @author PazmanyC
 *
 */

public class IMenuRestoImpl implements IMenuResto {

	public IMenuRestoImpl() {

	}

	@Override
	public void showTextOfFileBuffer(String file) {
		try {
			/*
			 * Le fichier d'entrée
			 */

			File displayText = new File(file);
			/*
			 * Créer l'objet File Reader
			 */
			FileReader fr = new FileReader(displayText);
			/*
			 * Créer l'objet BufferedReader
			 */
			BufferedReader br = new BufferedReader(fr);
			StringBuffer sb = new StringBuffer();
			String line;
			while ((line = br.readLine()) != null) {
				/*
				 * ajoute la ligne au buffer
				 */
				sb.append(line);
				sb.append("\n");
			}
			fr.close();
			System.out.println("Contenu du fichier: ");
			System.out.println(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void showTextOfFile(String fileName) throws FileNotFoundException {
		/*
		 * Le fichier d'entrée
		 */
		FileInputStream file = new FileInputStream(fileName);
		Scanner scanner = new Scanner(file);

		/*
		 * renvoie true s'il y a une autre ligne à lire
		 */
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	}

	@Override
	public void addTextToFile(String text, String fileName) {
		File file = new File(fileName);

		try {
			String textln = text + "\n";

			if (file.isFile()) {
				Files.write(Paths.get(fileName), textln.getBytes(), StandardOpenOption.APPEND);
			} else {
				throw new FileNotExist();
			}
		} catch (IOException e) {
			/*
			 * Gestion des exceptions en cas de problème d'accès au fichier
			 */

			e.printStackTrace();

			/**
			 * Gestion d'erreur si le fichier n'existe pas !
			 */
		} catch (FileNotExist e) {
		
			e.printStackTrace();
		}
	}

	@Override
	public void printMenuTextFile(List<String> lignes, String fileName) throws IOException {
		Path fichier = Paths.get(fileName);
		/*
		 * écrit les lignes en écrasant le texte déjà présent dans le fichier
		 */
		Files.write(fichier, lignes, Charset.forName("UTF-8"));
	}

	@SuppressWarnings("resource")
	@Override
	public void createdFile(String fileName) throws FileNotFoundException {
//		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
//		Date date = new Date();
//		String dateString = s.format(date);
//		File file = new File(fileName + "_" + dateString + ".txt");
		File file = new File(fileName + ".txt");
		
		String fileString = file.isFile() ? Color.YELLOW + "\nfichier déja existant : " + Color.WHITE
				: Color.GREEN + "\nfichier créé : " + Color.WHITE;

		/**
		 * Gestion d'erreur si le fichier existe déjà !
		 */
		try {
			if (file.isFile()) {

				throw new FileAlreadyExistsException();

			} else {
				new PrintWriter(file);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			System.out.println(fileString + file.getName() + "\nChemin absolu : " + file.getAbsolutePath());

		}
	}

}