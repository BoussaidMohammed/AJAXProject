package org.mql.biblio.mappers;

import java.util.Iterator;
import java.util.List;

import org.mql.biblio.models.Author;

public class JSONMapper {
	
	
	public static String getAuthor(Author a) {
		return a.toJSON();
	}
	
	public static String getAuthors(List<Author> authors) {
		String json = "[";
		if(authors.size() > 0) {
			json += authors.get(0).toJSON();
			for (int i = 1; i < authors.size(); i++) {
				json += ", " + authors.get(i).toJSON();
			}
		}
		json += "]";
		return json;
	}
}
