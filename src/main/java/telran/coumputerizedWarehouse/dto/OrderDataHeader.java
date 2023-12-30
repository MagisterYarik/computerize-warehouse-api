package telran.coumputerizedWarehouse.dto;

import java.time.LocalDate;

import telran.coumputerizedWarehouse.entity.OrderHeader;

public record OrderDataHeader(long orderId, short status, long containerId, long productId, double demand, LocalDate orderDate, LocalDate deliveryDate) {
	
	public OrderDataHeader(OrderHeader order){
		this(order.getOrderId(), 
			order.getStatus(), 
			order.getContainerId(), 
			order.getProductId(), 
			order.getDemand(), 
			order.getOrderDate(), 
			order.getDeliveryDate());		
	}

}
