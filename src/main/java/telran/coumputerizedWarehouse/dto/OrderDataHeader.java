package telran.coumputerizedWarehouse.dto;

import java.time.LocalDate;

public record OrderDataHeader(long orderId, char status, long containerId, long productId, double demand, LocalDate orderDate, LocalDate deliveryDate) {

}
