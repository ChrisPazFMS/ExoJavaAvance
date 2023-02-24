
public class NegativePopulation extends Exception {

	private static final long serialVersionUID = 1L;

	public NegativePopulation(String message) {
		super(message);
	}
	
	public NegativePopulation() {
		super("Vous ne pouvez pas mettre un nombre négatif");
	}

}
