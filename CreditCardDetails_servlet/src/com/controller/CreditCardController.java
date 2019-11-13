package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CreditCardController")
public class CreditCardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public CreditCardController() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		long ccNo = Long.parseLong(request.getParameter("cc_no"));
		//int cvvNo = Integer.parseInt(request.getParameter("cvv_no"));
		String bankName = request.getParameter("bank_name");
		//int accountNo = Integer.parseInt(request.getParameter("account_no"));
		
		if(String.valueOf(ccNo).length()==16 && bankName.equals("HSBC"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
			rd.forward(request, response);

		} else {
			RequestDispatcher rd = request.getRequestDispatcher("Error.jsp");
			rd.forward(request, response);
		}

		
	}

}
