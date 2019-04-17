package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import bean.Reservation;

/**
 * Servlet implementation class ResServlet
 */
@WebServlet("/ResServlet")
public class ResServlet extends HttpServlet {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public ResServlet() {
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
		String bookName = request.getParameter("bookName");
		String reserve = request.getParameter("reserve");
		String book = (String)request.getSession().getAttribute("book");
		
		Reservation res;
		if(request.getSession().getAttribute("reservation") == null) {
			request.getSession().setAttribute("reservation", new Reservation());
		}
		res = (Reservation) request.getSession().getAttribute("reservation");
		 
		String books = res.getBooks();
		
		request.setAttribute("books", books);
		
		
		if(bookName !=null){
			request.getSession().setAttribute("book", bookName);
			Boolean isExisiting = res.isExisting(bookName);
			Boolean isAvailable = res.isAvailable(bookName);
			request.setAttribute("exist", isExisiting);
			request.setAttribute("available", isAvailable);
			RequestDispatcher rd = request.getRequestDispatcher("/books.jsp");
	        rd.forward(request, response);
		}if(reserve !=null && reserve.equals("yes")){
			if((Boolean)request.getSession().getAttribute("isAuthenticated")== null){
				RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		        rd.forward(request, response);
			}
			res.reserve(book);
			Boolean isAvailable = res.isAvailable(book);
			request.setAttribute("bookName", book);
			request.setAttribute("available", isAvailable);
			RequestDispatcher rd = request.getRequestDispatcher("/confirmation.jsp");
	        rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("/books.jsp");
	        rd.forward(request, response);
		}
		}
	}


