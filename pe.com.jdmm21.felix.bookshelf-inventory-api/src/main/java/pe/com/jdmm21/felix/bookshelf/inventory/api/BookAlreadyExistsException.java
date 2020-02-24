package pe.com.jdmm21.felix.bookshelf.inventory.api;

import java.io.Serializable;

public class BookAlreadyExistsException extends Exception implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 378019554203245870L;
	
	public BookAlreadyExistsException(String isbn) {
		super("Book already exits"+ isbn);
	}

}
