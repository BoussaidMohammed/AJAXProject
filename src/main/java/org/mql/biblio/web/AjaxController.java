package org.mql.biblio.web;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mql.biblio.actions.BiblioActions;
import org.mql.biblio.mappers.JSONMapper;
import org.mql.biblio.models.Author;

public class AjaxController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BiblioActions action;

	public AjaxController() {
		action = new BiblioActions();
	}

	@Override
	public void init() throws ServletException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uri = request.getRequestURI();

		if (uri.endsWith("search-author")) {
			String name = request.getParameter("name");
			List<Author> authors = action.getAuthorsByName(name);
			String json = JSONMapper.getAuthors(authors);
			System.out.println(json);
			response.getWriter().println(json);
		}else if(uri.endsWith("add-author")) {
			//request.getParameter(uri)
			System.out.println("hello");
			System.out.println(request.getParameter("name") + " " +request.getParameter("yearBorn"));
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
