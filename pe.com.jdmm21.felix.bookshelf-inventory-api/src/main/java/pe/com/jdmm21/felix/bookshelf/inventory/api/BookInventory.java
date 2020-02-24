package pe.com.jdmm21.felix.bookshelf.inventory.api;

import java.util.Map;
import java.util.Set;

public interface BookInventory {

	enum SearchCriteria {
		ISBN_LIKE, TITLE_LIKE, AUTHOR_LIKE, CATEGORY_LIKE, RATING_GT, RATING_LT
	}

	Set<String> getCategories();

	Set<String> searchBooks(Map<SearchCriteria, String> criteria);

	MutableBook createBook(String isbn) throws BookAlreadyExistsException;

	String storeBook(MutableBook book) throws InvalidBookException;

	Book loadBook(String isbn) throws BookNotfoundException;

	MutableBook loadBookForEdit(String isbn) throws BookNotfoundException;

	void removeBook(String isbn) throws BookNotfoundException;

}
