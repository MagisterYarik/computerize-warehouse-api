package telran.coumputerizedWarehouse.dto;

public record OrderRequestNew(long container_id ,long product_id, double demand_units, short request_source ) {

}
