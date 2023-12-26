package telran.coumputerizedWarehouse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="container")
public class Container {
	@Id
	long container_id;
	@ManyToOne
	Product product;
	
	Container(long container_id, Product product){
		this.container_id = container_id;
		this.product = product;
	}

}
