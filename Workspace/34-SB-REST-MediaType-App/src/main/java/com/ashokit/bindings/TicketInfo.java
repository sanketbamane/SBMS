package com.ashokit.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@Data
public class TicketInfo {

	private Integer ticketId;
	private String from;
	private String to;
	private String ticketPrice;
	private String pnrStatus;
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getPnrStatus() {
		return pnrStatus;
	}
	public void setPnrStatus(String pnrStatus) {
		this.pnrStatus = pnrStatus;
	}
	
	
}
