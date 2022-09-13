package com.training.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServelet
 */
@WebServlet("/")
public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServelet() {
        super();
//		System.out.println("Constructor Called: "+ getServletConfig().getServletName() );
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String reqURL = request.getServletPath();
		String modifiedURL = reqURL.substring(1);
		
		System.out.println("Requested URL: " + modifiedURL);
		RequestDispatcher dispatcher = null;
		switch(modifiedURL) { 
		case "login":
			dispatcher = request.getRequestDispatcher("login.jsp");
			break; 
		case "success":
			HttpSession session = request.getSession();
			session.setAttribute("userName", "Harsh");
			dispatcher = request.getRequestDispatcher("success.jsp");
			
			break;
		case "faliure":
			// Servelet context is out appliation scope
			getServletContext().setAttribute("designer", "Harsh");
			dispatcher = request.getRequestDispatcher("faliure.jsp");
			break;
//		Case for logout
		default:
			break;
			
	}
		dispatcher.forward(request, response);
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("Init Called: "+ getServletConfig().getServletName() );
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String reqURL = request.getServletPath();
		String modifiedURL = reqURL.substring(1);
		switch (modifiedURL) {
		case "login":
			handleLogin(request,response);
			break;

		default:
			break;
		}
		
	}
	private void handleLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        
        RequestDispatcher dispatcher = null ; 
        
        if(userName.equals("india") && password.equals("india")) {
            dispatcher = request.getRequestDispatcher("success.jsp");
            HttpSession session = request.getSession();
            session.setAttribute("userName", userName);
            // Checking for valid user 
            session.setAttribute("isLogged", "true");
            dispatcher = request.getRequestDispatcher("success.jsp");
            
        }else {
        	dispatcher = request.getRequestDispatcher("failure.jsp");
        }
        
		getServletContext().setAttribute("designer", "Harsh");
        dispatcher.forward(request, response);
        
    }

	
}
