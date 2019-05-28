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
	private static final long serialVersionUID = 1L;
       
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
		String id = request.getParameter("id");
		OsobaBean osoba = null;
		if(id != null) {
			try {
				osoba = OsobaServiceImpl.getInstance().getOsoba(Long.valueOf(id));
			} catch(NumberFormatException exception) {
			}
		}
		request.setAttribute("osoba", osoba);
        getServletContext().getRequestDispatcher("/WEB-INF/OsobaDetail.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String firstName = request.getParameter("firstName");
		String surname = request.getParameter("surname");
		OsobaBean osoba;
		try {
			osoba = new OsobaBean(id != null && id.length() > 0 ? Long.valueOf(id) : null, firstName, surname);
		} catch(NumberFormatException exception) {
			osoba = new OsobaBean(null, firstName, surname);
		}
		OsobaServiceImpl.getInstance().addOsoba(osoba);
		request.setAttribute("osoba", osoba);
        getServletContext().getRequestDispatcher("/WEB-INF/OsobaDetail.jsp").forward(request, response);
	}

}
