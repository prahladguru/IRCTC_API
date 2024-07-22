package com.irctcrestapi.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.irctcrestapi.request.Passenger;
import com.irctcrestapi.response.Ticket;

@Service
public class BookingServiceImpl implements BookingService {
	
	private Map<Integer,Ticket> ticketsMap =  new HashMap();
	private Integer ticketNum = 1;

	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		//logic 
		
		Ticket t = new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setTicketCost(546.00);
		t.setSatatus("COMFIRMED");
		t.setTicketNum(ticketNum);
		
		ticketsMap.put(ticketNum, t);
		ticketNum++;
		
		return t;
	}

	@Override
	public Ticket getTicket(Integer ticketNumber) {
		if(ticketsMap.containsKey(ticketNumber)) {
			return ticketsMap.get(ticketNumber);
		}
		
		return null;
	}

}
