package classesandobjects;

public class AccountHolderObjects {

 public static void main(String[] args) {
	
	 AccountHolder tom = new AccountHolder();
	 AccountHolder henry = new AccountHolder();
	 AccountHolder sarah = new AccountHolder();

	 henry.firstName = "Henry";
	 henry.lastName = "Hills";
	 henry.age = 31;
	 henry.accountBalance = 20000;
	 henry.testEligibilityForCreditcard();
	 
	 System.out.println("Is henry eligible for CC : " + henry.eligibleforCreditCard);
	 
	 
}
}
