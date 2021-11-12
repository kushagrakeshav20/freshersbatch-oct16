class Bank{
	public void TotalBalance(){
		System.out.println("The Empolye Total salary");
	}	
}

class saving_Account extends Bank{
	float Fixed_Deposite = 15000;
	public void TotalBalance() {
		System.out.println("Balance in Saving Account: " +(Fixed_Deposite));
	}
}
class current_Account extends Bank{
	float cash_credit = 30000;
	public void TotalBalance() {
		System.out.println("Balance in current Account: "+((cash_credit)));
	}
}

class Mainclass{
	public static void main(String[] args) {
		saving_Account sa = new saving_Account();
		current_Account ca = new current_Account();
		
		sa.TotalBalance();
		ca.TotalBalance();
		
		System.out.println("Total Money in the Bank: "+(sa.Fixed_Deposite+ca.cash_credit));
	}
}