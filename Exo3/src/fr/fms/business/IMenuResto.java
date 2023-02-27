package fr.fms.business;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * 
 * @author PazmanyC
 *
 */

public interface IMenuResto {

	/**
	 * La méthode utilise un buffer qui retourne le contenu du fichier texte.
	 * 
	 * @param file
	 */
	void showTextOfFileBuffer(String file);

	/**
	 * La méthode utilise Scanner qui retourne le contenu du fichier texte.
	 * 
	 * @param fileName
	 * @throws FileNotFoundException
	 */

	void showTextOfFile(String fileName) throws FileNotFoundException;

	/**
	 * La méthode écrite dans le fichier cible.
	 * 
	 * @param text
	 * @param file
	 */

	void addTextToFile(String text, String file);

	/**
	 * La méthode copie l'ArrayList dans le fichier cible.
	 * 
	 * @param lignes
	 * @throws IOException
	 */

	void printMenuTextFile(List<String> lignes, String fileName) throws IOException;

	/**
	 * La méthode créée un nouveau fichier texte et vérifie s'il en existe un du
	 * même nom.
	 * 
	 * @param fileName
	 * @throws FileNotFoundException
	 */

	void createdFile(String fileName) throws FileNotFoundException;

}