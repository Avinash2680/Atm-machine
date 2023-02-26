import java.util.Scanner;

public class Account {

	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;

	Scanner input = new Scanner(System.in);

	public Account() {
	}

	public Account(int customerNumber, int pinNumber) {
		this.customerNumber = customerNumber;
		this.pinNumber = pinNumber;
	}

	public Account(int customerNumber, int pinNumber, double checkingBalance, double savingBalance) {
		this.customerNumber = customerNumber;
		this.pinNumber = pinNumber;
		this.checkingBalance = checkingBalance;
		this.savingBalance = savingBalance;
	}

	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}

	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}

	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}

	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}

	public double calcCheckingPayBills(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	public double calcSavingPayBills(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}

	public void getCheckingWithdrawInput() {
		boolean end = false;
		while (!end) {
			System.out.println("____________________________________________");
				System.out.println("\nCurrent Checkings Account Balance: " + (checkingBalance));
                
				System.out.print("\nAmount you want to withdraw from Checkings Account: ");
				double amount = input.nextDouble();
				if ((checkingBalance - amount) >= 0 && amount >= 0) {
					calcCheckingWithdraw(amount);
					System.out.println("\nCurrent Checkings Account Balance: " +(checkingBalance));
                 
					end = true;
				} else {
					System.out.println("\nBalance is Low");
				}
			
		}
	}

	

	public void getsavingWithdrawInput() {
		boolean end = false;
		while (!end) {
			
			System.out.println("____________________________________________");
				System.out.println("\nCurrent Savings Account Balance: " + savingBalance);
				System.out.print("\nAmount you want to withdraw from Savings Account: ");
				double amount = input.nextDouble();
				if ((savingBalance - amount) >= 0 && amount >= 0) {
					calcSavingWithdraw(amount);
					// System.out.println("\nCurrent Savings Account Balance: " + moneyFormat.format(savingBalance));
					System.out.println("\nCurrent Savings Account Balance: " + savingBalance);
					end = true;
				} else {
					System.out.println("\nBalance Cannot Be Negative.");
				}
			
		}
	}

	public void getCheckingDepositInput() {
		boolean end = false;
		while (!end) {
			System.out.println("____________________________________________");
				System.out.println("\nCurrent Checkings Account Balance: " + (checkingBalance));
				System.out.print("\nAmount you want to deposit from Checkings Account: ");
				double amount = input.nextDouble();
				if ((checkingBalance + amount) >= 0 && amount >= 0) {
					calcCheckingDeposit(amount);
					System.out.println("\nCurrent Checkings Account Balance: " + (checkingBalance));
					end = true;
				} else {
					System.out.println("\nBalance Cannot Be Negative.");
				}
			
		}
	}

	public void getSavingDepositInput() {
		boolean end = false;
		while (!end) {
			System.out.println("____________________________________________");
				System.out.println("\nCurrent Savings Account Balance: " +savingBalance);
				System.out.print("\nAmount you want to deposit into your Savings Account: ");
				double amount = input.nextDouble();

				if ((savingBalance + amount) >= 0 && amount >= 0) {
					calcSavingDeposit(amount);
				System.out.println("\nCurrent Savings Account Balance: " + savingBalance);
					end = true;
				} else {
					System.out.println("\nBalance Cannot Be Negative.");
				}
			
		}
	}
	public void getSavingPayBills() {
		boolean end = false;
		while (!end) {
			
				System.out.println("\nCurrent Savings Account Balance: " + savingBalance);
				System.out.println("\n enter your choice");
				System.out.println("\n 1-> Mobile Bill");
				System.out.println("\n 2-> TV Bill");
				int ch = input.nextInt();
				switch (ch) {
					case 1:

					System.out.println("Enter your Moblie no. which is used to rechage");
					Long mo = input.nextLong();
					System.out.print("\nAmount you want to Pay Bill from savingsAccount: ");
					double amount1 = input.nextDouble();
					if ((savingBalance - amount1) >= 0 && amount1 >= 0) {
						calcSavingPayBills(amount1);
						System.out.println("\nCurrent savings Account Balance: " + savingBalance);
						end = true;
					} else {
						System.out.println("\nBalance Cannot Be Negative.");
					}
						break;


					case 2:
					System.out.println("Enter your Tv no. which is used to rechage");
					int tv = input.nextInt();
					System.out.print("\nAmount you want to Pay Bill from savings Account: ");
					double amount2 = input.nextDouble();
					if ((savingBalance - amount2) >= 0 && amount2 >= 0) {
						calcSavingPayBills(amount2);
						System.out.println("\nCurrent Savings Account Balance: " + savingBalance);
						end = true;
					} 
					else {
						System.out.println("\nBalance Cannot Be Negative.");
					}
						break;


					case 3:
						end = true;
						break;
					default:
						System.out.println("\nInvalid Choice.");
					}
		}
	}


	public void getCheckingPayBills() {
		boolean end = false;
		while (!end) {
			System.out.println("____________________________________________");
				System.out.println("\nCurrent Checkings Account Balance: " + checkingBalance);
				System.out.println("\n enter your choice");
				System.out.println("\n 1-> Mobile Bill");
				System.out.println("\n 2-> TV Bill");
				System.out.println("\n 3-> Exit");
				int ch = input.nextInt();
				switch (ch) {
					case 1:
					System.out.println("____________________________________________");
					System.out.println("Enter your Moblie no. which is used to rechage");
					Long mo = input.nextLong();
					System.out.print("\nAmount you want to Pay Bill from Checkings Account: ");
					double amount1 = input.nextDouble();
					if ((checkingBalance - amount1) >= 0 && amount1 >= 0) {
						calcCheckingPayBills(amount1);
						System.out.println("\nCurrent Checkings Account Balance: " + checkingBalance);
						end = true;
					} else {
						System.out.println("\nBalance Cannot Be Negative.");
					}
						break;


					case 2:
					System.out.println("____________________________________________");
					System.out.println("Enter your Tv no. which is used to rechage");
					int tv = input.nextInt();
					System.out.print("\nAmount you want to Pay Bill from Checkings Account: ");
					double amount2 = input.nextDouble();
					if ((checkingBalance - amount2) >= 0 && amount2 >= 0) {
						calcCheckingPayBills(amount2);
						System.out.println("\nCurrent Checkings Account Balance: " + checkingBalance);
						end = true;
					} 
					else {
						System.out.println("\nBalance Cannot Be Negative.");
					}
						break;
					case 3:
						end = true;
						break;
					default:
						System.out.println("\nInvalid Choice.");
					}
		}
	}

}