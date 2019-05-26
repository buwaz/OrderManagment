package order;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;


public class OrderManager {
	
	public void registerOrder(Order order) {
		
		Connection conn = Database.getConnection();
		
		String val_1 = order.getOrderId();
		int val_2 = order.getOrderNo();
		String val_3 = order.getOrderDate();
		
        String query = "insert into order_list (order_id,order_no,order_date)"
                + " values (?, ?, ?)";

        try {
			conn.setAutoCommit(false);
	        PreparedStatement preparedStmt = conn.prepareStatement(query);
	        preparedStmt.setString(1, val_1.toString());
	        preparedStmt.setString(2, Integer.toString(val_2));
	        preparedStmt.setString(3, val_3.toString());

	        preparedStmt.execute();
	              
	        conn.commit();

	        conn.close();
	        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
              

		
		
		
	}
	
	
	public void updateOrder(Order order) {
		
		Connection conn = Database.getConnection();
		
		String order_id = order.getOrderId();
		int order_no = order.getOrderNo();
		String order_date = order.getOrderDate();
		
		

	      String query = "update order_list set order_date = ?, order_no = ? where order_id = ?";


        try {
			conn.setAutoCommit(false);
		    PreparedStatement preparedStmt = conn.prepareStatement(query);
		    preparedStmt.setString(1, order_date);
		    preparedStmt.setString(2, Integer.toString(order_no));
		    preparedStmt.setString(3, order_id);

	        preparedStmt.execute();
	              
	        conn.commit();

	        conn.close();
	        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
              

		
		
		
	}
	
	
	public void deleteOrder(String order_id) {
		
		Connection conn = Database.getConnection();
				
	    String query = "delete from order_list where order_id = ?";


        try {
			conn.setAutoCommit(false);
		    PreparedStatement preparedStmt = conn.prepareStatement(query);
		    preparedStmt.setString(1, order_id);


	        preparedStmt.execute();
	              
	        conn.commit();

	        conn.close();
	        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
              

		
		
		
	}
	
	
	
	
	
}
