package com.irctcrestapi.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.irctcrestapi.Service.BookingService;
import com.irctcrestapi.request.Passenger;
import com.irctcrestapi.response.Ticket;

@RestController
public class BookingRestController {
	// Method to book Ticket should be (POST METHOD)
	@Autowired
	private BookingService service;

	@PostMapping(value = "/myticket", 
			consumes = { "application/json" }
	, produces = { "application/json" }

	)

	public ResponseEntity<Ticket> ticketBooking(@RequestBody Passenger passenger) {
		System.out.println(passenger);
		Ticket ticket = service.bookTicket(passenger);
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}

	// method to get ticket (GET METHOD)
	//purpose of path variable it is used to read the data from the url
	@GetMapping(
			
			value = "/ticket/{ticketNum}",
			produces = "application/json"
			)
	public Ticket getTicketByNum(@PathVariable Integer ticketNum) {
		return service.getTicket(ticketNum);
		
		
	}
	

}
