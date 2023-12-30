package telran.coumputerizedWarehouse.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
@Entity
@Table(name="order_head")
public class OrderHeader {
	@Id
	@GeneratedValue
	long orderId; 
	char status; 
	long containerId; 
	long productId; 
	double demand; 
	LocalDate orderDate; 
	LocalDate deliveryDate;

}
