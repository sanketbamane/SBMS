package com.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.bindings.PassengerInfo;
import com.ashokit.bindings.TicketInfo;

@RestController
public class RailRestController {

	@PostMapping(
			value = "/book-ticket",
			
			produces = {
					"application/xml",
					"application/json"
			}
	)
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo passenger) {
		
		//logic to book ticket

		TicketInfo ticket = new TicketInfo();
		ticket.setTicketId(796868);
		ticket.setPnrStatus("CONFIRMED");
		ticket.setFrom(passenger.getFrom());
		ticket.setTo(passenger.getTo());
		ticket.setTicketPrice("450.00");

		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}

}
