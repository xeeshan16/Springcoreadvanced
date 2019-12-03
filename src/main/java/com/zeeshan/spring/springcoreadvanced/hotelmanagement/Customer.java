package com.zeeshan.spring.springcoreadvanced.hotelmanagement;

public class Customer {
	
	private Reservation reservation;

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "Customer [reservation=" + reservation + "]";
	}

}
