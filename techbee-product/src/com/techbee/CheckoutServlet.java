package com.techbee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techbee.model.Product;
import com.techbee.repository.ProductRepository;

@WebServlet("/checkoutServlet")
public class CheckoutServlet extends HttpServlet {

	private Connection connection;

	/**
	 * Load OJDBC driver and establish database connection.
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Accept user input, insert into database and redirect to success/error page.
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productId = request.getParameter("PRODUCT_ID");
		Product p = ProductRepository.getProduct(productId);
		String customerId = "C001"; // dummy customer id
		double quantity = Integer.parseInt(request.getParameter("PRODUCT_QUANTITY"));
		String giftWrap = request.getParameter("GIFT_WRAP");
		String deliveryInstructions = request.getParameter("DELIVERY_INSTRUCTIONS");
		double deliveryDate = Integer.parseInt(request.getParameter("DELIVERY_DATE"));
		String couponCode = request.getParameter("COUPON_CODE");
		double cartValue = p.getProductPrice() * quantity;
		
		
		int noOfRowsInserted = 0;
		try {
			Statement statement = connection.createStatement();
			String queryString = "insert into TOrder values('" + productId + "', '" + customerId + "', " + quantity + ", '" + giftWrap + "', '" + deliveryInstructions + "'," + deliveryDate + ", " + cartValue + ", '" + couponCode + "')";
			noOfRowsInserted = statement.executeUpdate(queryString);
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		RequestDispatcher requestDispatcher;
		if (noOfRowsInserted == 1) {
			response.getWriter().println("success");
		} else {
			response.getWriter().println("error");
		}
	}
	
	/**
	 * Close database connection when servlet gets destroyed.
	 */
	@Override
	public void destroy() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
