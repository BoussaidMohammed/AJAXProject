package org.mql.biblio.actions;

import java.util.List;
import java.util.Vector;

import org.mql.biblio.models.Author;

public class BiblioActions {
	private List<Author> authors;
	public BiblioActions() {
		authors = new Vector<Author>();
		authors.add(new Author(101, "James Gosling", 1955));
		authors.add(new Author(102, "Tim Berners-Lee", 1955));
		authors.add(new Author(103, "Ereich Gamma", 1955));
	}
	
	public List<Author> getAuthorsByName(String name){
		List<Author> result = new Vector<>();
		for(Author a : authors) {
			if(a.getName().toLowerCase().contains(name.toLowerCase())) {
				result.add(a);
			}
		}
		return result;
	}
}
