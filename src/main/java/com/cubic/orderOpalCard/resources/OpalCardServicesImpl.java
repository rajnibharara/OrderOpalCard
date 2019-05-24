package com.cubic.orderOpalCard.resources;

import org.springframework.stereotype.Component;

import com.cubic.orderOpalCard.model.Address;
import com.cubic.orderOpalCard.model.OpalCard;
import com.cubic.orderOpalCard.model.OpalCardType;
import com.cubic.orderOpalCard.model.Payment;
import com.cubic.orderOpalCard.model.UserDetails;

@Component
public class OpalCardServicesImpl  implements OpalCardServices{

	@Override
	public Boolean orderOpalCard(UserDetails userDetails) {
		Boolean isSuccess = false;
	
		String usernme = createorUpdateUserDetails(userDetails);
		
	    if( usernme !=null &&  !usernme.isEmpty()) {
			
		    Address address = userDetails.getAddress();
			boolean isAddressAdded = addPostalAddressDetails(address,usernme);
			
			if(isAddressAdded) {	  
				  isSuccess = true;
			}
		
	    }
		return isSuccess;
	}

	@Override
	public OpalCard GetOpalCardDetails(String userName) {
		//Call DAO method to get card details of login user by username
		
		OpalCard opalCard = new OpalCard();
		opalCard.setUsername(userName);
		opalCard.setAutoTopUpType("automatically");
		opalCard.setCardNickName(userName);
		opalCard.setCardNumber("1234567653");
		opalCard.setCardTopUpVal("20");
		opalCard.setOpalCardType(OpalCardType.ADULT);

		return opalCard;
	}

	@Override
	public Boolean addPaymentDetails(Payment payment) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Boolean addPostalAddressDetails(Address address, String userName) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String createorUpdateUserDetails(UserDetails userDetails) {
		// TODO Auto-generated method stub
		String userName ="rajniBharara";
		return userName;
	}

	@Override
	public Boolean addCardDetails(OpalCard opalCard) {
		// TODO Auto-generated method stub
		return true;
	}
	
	

}
