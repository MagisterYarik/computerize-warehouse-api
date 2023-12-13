package telran.coumputerizedWarehouse.dto;

import java.time.LocalDate;

public record OrderDataHeader(long order_id, char status, long container_id, long product_id, double demand, LocalDate order_date, LocalDate delivery_date) {

}
