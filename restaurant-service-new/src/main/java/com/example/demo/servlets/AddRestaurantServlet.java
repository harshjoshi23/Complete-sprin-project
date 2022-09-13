package com.example.demo.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.repos.RestaurantRepository;
import com.example.demo.services.RestaurantService;
import com.training.model.Restaurant;

/**
 * Servlet implementation class AddRestaurantServlet
 */
@WebServlet("/addRestaurant")
public class AddRestaurantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRestaurantServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String strId =  request.getParameter("id");
	 	int id = Integer.parseInt(strId);
	 
	 	String restaurantName = request.getParameter("restaurantName");
	   
	 	String strPinCode = request.getParameter("pinCode");
	    int pinCode = Integer.parseInt(strPinCode);
	   
	    String cuisine = request.getParameter("cuisine");
	  
	    Restaurant obj = new Restaurant(id, restaurantName, pinCode, cuisine);
	    
	    
	    
	    RestaurantService service = new RestaurantService();
		
		service.addRestaurant(obj);
		ArrayList<Restaurant> list = new ArrayList<>();
		list.add(obj);
		request.setAttribute("list", list);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("findRestaurant.jsp");
	    
	    dispatcher.forward(request, response);
	 
	    System.out.println(obj);
		
	}

}
