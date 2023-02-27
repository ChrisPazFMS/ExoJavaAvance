package fr.fms.exception;

/**
 * 
 * @author PazmanyC
 *
 */

public class FileNotExist extends Exception{
	
	
	/**
	 * Gestion d'erreur si le fichier n'existe pas !
	 */
	
	private static final long serialVersionUID = 1L;

	public FileNotExist(String message) {
		super(message);
		
	}
	
	public FileNotExist() {
		super("Le fichier est inexistant !");
		
	}
	
	

}
