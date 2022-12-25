
public class DriverCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerOrder c;
		c= new CustomerOrder();
		c.setCustomer_id(1);
		c.setCustmer_name("jayachandra");
		c.setAddress("warangal");
		c.setOrder_id(001);
		c.setOrder_name("biryani");
		c.setQuantity(01);
		c.setPrice(120);
		System.out.println("Customer id :" + c.getCustmer_name());
		System.out.println("Customer name :" + c.getCustmer_name());
		System.out.println("Address : " + c.getAddress());
		System.out.println("order id : " + c.getOrder_id());
		System.out.println("order name : " + c.getOrder_name());
		System.out.println("quantity : " + c.getQuantity());
		System.out.println("price" + c.getPrice());

	}

}
