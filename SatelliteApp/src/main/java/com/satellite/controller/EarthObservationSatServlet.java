package com.satellite.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.satellite.model.Satellite;
import com.satellite.service.ISpaceAppService;
import com.satellite.service.SpaceAppServiceImpl;

/**
 * Servlet implementation class EarthObservationSatServlet
 */
@WebServlet("/Earth-Observation-Satellites")
public class EarthObservationSatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EarthObservationSatServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		ISpaceAppService spaceAppService = new SpaceAppServiceImpl();
		List<Satellite> earthObservationSatList = spaceAppService.getAllEarthObservationSat();
		session.setAttribute("earthObservationSatList", earthObservationSatList);
//		System.out.println(earthObservationSatList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("earthObservationSat.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
