package telran.coumputerizedWarehouse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	long product_id;
	String product_name;
	String units;
	double lv;
	boolean discrete;
	
	Product (long product_id, String product_name, String units, double lv, boolean discrete){
		this.product_id = product_id;
		this.product_name = product_name;
		this.units = units;
		this.lv = lv;
		this.discrete = discrete;
	}

}
