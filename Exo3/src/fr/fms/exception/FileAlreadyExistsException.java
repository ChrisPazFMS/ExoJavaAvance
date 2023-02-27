package fr.fms.exception;
/**
 * 
 * @author PazmanyC
 *
 */
public class FileAlreadyExistsException extends Exception{

	/**
	 * Gestion d'erreur si le fichier existe déjà !
	 */
	
	private static final long serialVersionUID = 1L;
	
	public FileAlreadyExistsException(String message) {
		super(message);
		
	}
	
	public FileAlreadyExistsException() {
		super("Impossible de créer le fichier il existe déjà !");
		
	}
	
	
	
	
 
}
