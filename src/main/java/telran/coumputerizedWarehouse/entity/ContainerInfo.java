package telran.coumputerizedWarehouse.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="sensor_Loger")

public class ContainerInfo {
	@Id
	@GeneratedValue
	@Column(name = "logId", unique = true, 
	nullable = false)
	long logId;
	long containerId;
	LocalDate timestamp;
	double sensorValue;
	double sensorPrevValue;
	
	
	public ContainerInfo(long containerId, LocalDate timestamp, double sensorValue, double sensorPrevValue) {
		super();
		this.containerId = containerId;
		this.timestamp = timestamp;
		this.sensorValue = sensorValue;
		this.sensorPrevValue = sensorPrevValue;
	}
}
