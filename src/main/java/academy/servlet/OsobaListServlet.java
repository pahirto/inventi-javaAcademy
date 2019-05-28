package academy.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import academy.bean.OsobaBean;
import academy.service.impl.OsobaServiceImpl;

/**
 * Servlet implementation class OsobaListServlet
 */
@WebServlet("/OsobaListServlet")
public class OsobaListServlet extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/OsobaList.jsp").forward(request, response);
	}

}
