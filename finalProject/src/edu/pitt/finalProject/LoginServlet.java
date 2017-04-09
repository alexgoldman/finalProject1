package edu.pitt.finalProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.pitt.finalProject.entity.UserEntity;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Request= response;
		/*
		response.setContentType("text/html");
		//PrintWriter out = 
		UserEntity user = uf.checkCredentials("username","password");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		*/
		System.out.println("here");
		 response.setContentType("text/html");
		String username = request.getParameter("username");
		System.out.println("username: " + username);
		PrintWriter writer = response.getWriter();
		
		String htmlRespone = "<!DOCTYPE html><html>";
        htmlRespone += "<h2>Your username is: " + username + "<br/></h2>";      
        htmlRespone += "</html>";
        
        writer.println(htmlRespone);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
