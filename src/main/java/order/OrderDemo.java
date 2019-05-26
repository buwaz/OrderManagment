package order;
public class OrderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order order = new Order();
		
		order.setOrderId("1232");
		order.setOrderNo(213);
		order.setOrderDate("2019/12/12");
		
		OrderManager order_manager = new OrderManager();
		
		order_manager.registerOrder(order);
		

		
		
	}


}
