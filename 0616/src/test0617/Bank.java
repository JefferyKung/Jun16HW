package test0617;

class Bank{
	public void print() {
		System.out.println("Printing passbook for bank");
	}
}

class RbcBank extends Bank{
	public void print() {
		System.out.println("Printing passbook for RBC bank");
	}
}


public class TestPolymorphism{
		public static void main(String[] args) {
			Bank BankPrint = new RbcBank();
			BankPrint.print();
		}
	}

	

