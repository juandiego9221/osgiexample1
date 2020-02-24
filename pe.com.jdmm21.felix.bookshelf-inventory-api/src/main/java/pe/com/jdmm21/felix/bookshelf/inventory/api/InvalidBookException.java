package pe.com.jdmm21.felix.bookshelf.inventory.api;

public class InvalidBookException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 653943973844576452L;

	public InvalidBookException(String message) {
		super("Book invalid: " + message);
	}
}
