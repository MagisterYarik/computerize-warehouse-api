package telran.coumputerizedWarehouse.dto;

import telran.coumputerizedWarehouse.entity.Container;

public record ContainerData(long containerId, ProductData product, double productCapacity) {
	
	public ContainerData(Container container) {
		this(container.getContainerId(), new ProductData(container.getProduct()), container.getProductCapacity());
	}

}
