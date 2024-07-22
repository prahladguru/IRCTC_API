package com.irctcrestapi.response;

import lombok.Data;

@Data
public class Ticket{
	
	private Integer ticketNum;
	private String satatus;
	private Double ticketCost;
	private String name;
	private String from;
	private String to;
	private String doj;
	private String trainNumber;

}
