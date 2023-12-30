package telran.coumputerizedWarehouse.dto;

import telran.coumputerizedWarehouse.entity.Product;

public record ProductData(long productId, String productName, String units, double lv, boolean discrete) {
	
	public ProductData(Product product) {
		this(product.getProductId(), product.getProductName(), product.getUnits(), product.getLv(), product.isDiscrete());
	}

}
