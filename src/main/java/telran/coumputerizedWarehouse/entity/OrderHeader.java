package telran.coumputerizedWarehouse.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="order_head")
public class OrderHeader {
	@Id
	@GeneratedValue
	long order_id; 
	char status; 
	long container_id; 
	long product_id; 
	double demand; 
	LocalDate order_date; 
	LocalDate delivery_date;
	
	OrderHeader(long order_id, char status, long container_id, long product_id, double demand, LocalDate order_date, LocalDate delivery_date) {
		this.order_id = order_id; 
		this.status = status; 
		this.container_id = container_id; 
		this.product_id = product_id; 
		this.demand = demand; 
		this.order_date = order_date; 
		this.delivery_date = delivery_date;

	}

}
