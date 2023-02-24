
public class ExceptionalPopulation extends Exception {

	private static final long serialVersionUID = 1L;

	public ExceptionalPopulation(String message) {
		super(message);
	}

	public ExceptionalPopulation() {
		super("Vous ne pouvez pas mettre un nombre négatif");
	}

}
