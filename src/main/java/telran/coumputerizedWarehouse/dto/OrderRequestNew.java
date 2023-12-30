package telran.coumputerizedWarehouse.dto;

public record OrderRequestNew(long containerId ,long productId, double demandUnits, short requestSource ) {

}
