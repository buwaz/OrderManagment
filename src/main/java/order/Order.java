package order;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;


public class Order {

	private String order_id;
	private int order_no;
	private String date;
	
	
	public Order() {
		
	
	}
	
	public String getOrderId() {
		
		return this.order_id;	
		
		
	}
	
	public int getOrderNo() {
		
		return this.order_no;	
		
		
	}
	
	public String getOrderDate() {
		
		return this.date;	
		
		
	}
	
	public void setOrderId(String order_id) {
		
		this.order_id = order_id;	
		
		
	}
	
	public void setOrderNo(int order_no) {
		
		this.order_no = order_no;	
		
		
	}
	
	
	
	public void setOrderDate(String date) {
		
		this.date = date;	
		
		
	}
	
	
}
