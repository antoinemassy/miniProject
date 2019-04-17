package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Authentification;

/**
 * Servlet implementation class AuthServlet
 */
@WebServlet("/AuthServlet")
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = (String) request.getParameter("username");
		String password = (String) request.getParameter("password");
		System.out.println(username);
		if(username ==null && password==null)
		{
			request.getSession().invalidate();
			RequestDispatcher rd = request.getRequestDispatcher("/goodbye.jsp");
	        rd.forward(request, response);
		}else {
		
		Authentification auth = new Authentification();
		if(auth.checkAuthentification(username, password)){
			request.getSession().setAttribute("isAuthenticated", true);
			RequestDispatcher rd = request.getRequestDispatcher("/welcome.jsp");
	        rd.forward(request, response);
		}else {
			request.getSession().setAttribute("error", true);
			RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
	        rd.forward(request, response);
		}
		}
	}

}
