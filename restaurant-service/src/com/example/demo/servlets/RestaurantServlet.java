package com.example.demo.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.services.RestaurantService;
import com.training.model.Restaurant;

/**
 * Servlet implementation class RestaurantServlet
 */
@WebServlet("/restaurant")
public class RestaurantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	RestaurantService restService;
    public RestaurantServlet() {
    	
        super();
        // Have 2 function save data and get data 
        restService = new RestaurantService();
        // Get - name of all rest 
        // Post - Save all rest
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Restaurant> restList = restService.fetchData();
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// save is success or not
		Restaurant rest = new Restaurant();
		
		rest.setId(Integer.parseInt(request.getParameter("id")));
		rest.setRestaurantName(request.getParameter("restaurantNamer"));
		rest.setPinCode(Long.parseLong(request.getParameter("pinCode")));
		rest.setCuisine(request.getParameter("cuisine"));
		
		boolean isSuccess = restService.saveData(rest);
		response.getWriter().append((isSuccess ? "Badhiya " : "Ye to ab Hansi majak wali baat nhi hai") + "").append(request.getContextPath());
//		doGet(request, response);
	}

}


