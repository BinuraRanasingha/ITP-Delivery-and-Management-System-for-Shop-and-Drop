package com.vehicle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/sendUpdate")
public class sendUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("send sevelet");

		
		

		
			RequestDispatcher dis=request.getRequestDispatcher("updateVehicle.jsp");
			dis.forward(request,response);
			
		
	
		
	

}
}
