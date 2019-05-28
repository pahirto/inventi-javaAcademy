package academy.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import academy.bean.OsobaBean;
import academy.service.impl.OsobaServiceImpl;

/**
 * Servlet implementation class OsobaDetailServler
 */
@WebServlet("/osobaDetailServlet")
public class OsobaDetailServlet extends HttpServlet {

    /**
     * @see HttpServlet#HttpServlet()
     */
    public OsobaDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/OsobaDetail.jsp").forward(request, response);
	}
}
