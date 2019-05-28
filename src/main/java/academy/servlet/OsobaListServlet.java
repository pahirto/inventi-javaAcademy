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
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String deleteId = request.getParameter("deleteId");
		List<OsobaBean> osoby;
		if(deleteId != null) {
    		try {
    			OsobaServiceImpl.getInstance().deleteOsoba(Long.valueOf(deleteId));
    		} catch(NumberFormatException exception) {
    		}
    	}
		osoby = OsobaServiceImpl.getInstance().getOsobaList();
		request.setAttribute("osoby", osoby);
		getServletContext().getRequestDispatcher("/WEB-INF/OsobaList.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
