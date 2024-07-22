package com.irctcrestapi.Service;

import com.irctcrestapi.request.Passenger;
import com.irctcrestapi.response.Ticket;

public interface BookingService {

	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer ticketNumber);
	
	
	
	
}
