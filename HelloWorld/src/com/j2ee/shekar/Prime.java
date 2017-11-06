package com.j2ee.shekar;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Prime
 */
@WebServlet("/prime")
public class Prime extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Prime() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Apache Served at: ").append(request.getContextPath());
		
		int n, flag = 0;

		n =  Integer.parseInt(request.getParameter("inpNum"));
		
		if( n <  0)
		{
	    response.getWriter().print("<br> Please enter positive number");
	    return;
		}
		
	    for(int i=2; i<=n/2; ++i)
	    {
	        if(n%i==0)
	        {
	            flag=1;
	            break;
	        }
	    }

	    if (flag==0)
		    response.getWriter().print("<br>" + n + " Is a Prime number");
	     else
		    response.getWriter().print("<br>" + n + " Is NOT a prime number");
		    
	    return;
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
