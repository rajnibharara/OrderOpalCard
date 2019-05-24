package com.cubic.orderOpalCard.resources;

import com.cubic.orderOpalCard.model.Address;
import com.cubic.orderOpalCard.model.OpalCard;
import com.cubic.orderOpalCard.model.Payment;
import com.cubic.orderOpalCard.model.UserDetails;

public interface OpalCardServices {

	Boolean orderOpalCard(UserDetails userDetails);
	
	OpalCard GetOpalCardDetails(String userName);
	
	String createorUpdateUserDetails(UserDetails userDetails);
	
	Boolean addPaymentDetails(Payment payment);
	
	Boolean addPostalAddressDetails(Address address , String userName);
	
	Boolean addCardDetails(OpalCard opalCard );
	
	
	
}
