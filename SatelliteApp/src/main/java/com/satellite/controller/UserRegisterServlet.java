package com.satellite.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.satellite.model.SpaceApp;
import com.satellite.service.ISpaceAppService;
import com.satellite.service.SpaceAppServiceImpl;

/**
 * Servlet implementation class UserRegisterServlet
 */
@WebServlet("/register")
public class UserRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		// get data from form field
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("cpassword");
		
		SpaceApp spaceApp = new SpaceApp(name, username, password, confirmPassword);
		
		ISpaceAppService spaceAppService = new SpaceAppServiceImpl();
		String message =  spaceAppService.userRegistration(spaceApp);
		
		request.setAttribute("message", message);
		
		if(message.equals("User Registered Successfully.")) {
			request.setAttribute("message", "Now you can Login");
			RequestDispatcher dispatcher = request.getRequestDispatcher("userLogin.jsp");
			dispatcher.forward(request, response);
		}
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("userRegister.jsp");
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
