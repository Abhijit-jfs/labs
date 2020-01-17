package demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/movieinsert")
public class InsertServlet extends HttpServlet {

	Connection connection = null;
	@Override
	public void init() throws ServletException {
		try {
			System.out.println("INIT INVOKED");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("Driver loaded successfully!");
			//Get the connection
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");  
			//System.out.println("Connection Established!");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("SERVICE INVOKED");
		int movieId = Integer.parseInt(req.getParameter("movieid"));
		String movieName = req.getParameter("moviename");
		insertDetails(movieId, movieName);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("movieselect");
		requestDispatcher.forward(req, resp);
	}

	private void insertDetails(int movieId, String movieName) {
		Statement statement;
		try {
			statement = connection.createStatement();
			int noOfRows = statement.executeUpdate("insert into movies values(" + movieId + ", '" + movieName + "')");
			if (noOfRows == 1) {
				System.out.println(noOfRows + " rows inserted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
