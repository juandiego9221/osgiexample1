package pe.com.jdmm21.felix.bookshelf.inventory.api;

public class BookNotfoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6488705150922693043L;

	public BookNotfoundException(String isbn) {
		super("Book not found exception");
	}

}
