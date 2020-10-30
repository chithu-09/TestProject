package classesandobjects;

public class AccountHolder {

	String firstName;
	String lastName;
	int age;
	float accountBalance;
	boolean eligibleforCreditCard;

	public void testEligibilityForCreditcard() {
		
		if(age>25 && accountBalance >= 20000) {
			eligibleforCreditCard = true;
		}
		}
		
	}
	

