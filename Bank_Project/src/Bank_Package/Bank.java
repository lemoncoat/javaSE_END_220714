package Bank_Package;

import java.util.Scanner;



public class Bank {
	private String bName, bAccount;
	private int bBalance;
	
	
	

	public void setBank(String n, String i, int b) {bName=n;bAccount=i;bBalance=b;	}// end of setBank()
	
	public void putBank() {
		System.out.println("이름은 :" +bName);
		System.out.println("계좌번호는 :" +bAccount);
		System.out.println("잔액은 :" +bBalance);
	}// end of putBank()
	
	public String getBankName() {
		return (bName);
	}// end of getBankName()
	
	public String getBankAccount() {
		return (bAccount);
	}// end of getBankAccount()
	
	public int getBankBalance() {
		return (bBalance);
	}// end of getBankBalance()
	

	public void deposit(int Money) {
		
		if(Money<0) {
			System.out.println("음수가 입력되었습니다.");
		}else {
			bBalance +=Money;
		}
		
	}// end of deposit()
	
	public void withdraw(int Money) {
		
		if(Money>bBalance) {
			System.out.println("잔액보다 많이 출금할수 없습니다.");
		}else {
			bBalance -= Money;
		}
		
	}// end of withdraw()
	
	public void check() {
		System.out.println("잔액은 :" + this.getBankBalance());
		
	}// end of check()
	
	
	
	
}//end of Bank class






/*
public class Bank {
	private String bName, bAccount;
	private int bBalance;
	
	Bank(){
		this.bName = bName;
		this.bAccount = bAccount;
		this.bBalance = bBalance;
	}
	
	Bank(String bName, String bAccount, int bBalance){
		this.bName = bName;
		this.bAccount = bAccount;
		this.bBalance = bBalance;
	}

	public void setBank() {
		Scanner input = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		bName= input.nextLine();
		System.out.print("계좌번호를 입력해주세요 : ");
		bAccount = input.nextLine();
		System.out.print("잔액을 입력해주세요 : ");
		bBalance = input.nextInt();
	}// end of setBank()
	
	public void putBank() {
		System.out.println("이름은 :" +bName);
		System.out.println("계좌번호는 :" +bAccount);
		System.out.println("잔액은 :" +bBalance);
	}// end of putBank()
	
	public String getBankName() {
		return (bName);
	}// end of getBankName()
	
	public String getBankAccount() {
		return (bAccount);
	}// end of getBankAccount()
	
	public int getBankBalance() {
		return (bBalance);
	}// end of getBankBalance()
	
	public void deposit() {
		Scanner input = new Scanner(System.in);
		System.out.print("얼마를 입금하시겠습니까? : ");
		int dMoney = input.nextInt();
		if(dMoney<0) {
			System.out.println("음수가 입력되었습니다.");
		}else {
			bBalance +=dMoney;
		}
		
	}// end of deposit()
	
	public void withdraw() {
		Scanner input = new Scanner(System.in);
		System.out.print("얼마를 출금하시겠습니까? : ");
		int wMoney = input.nextInt();
		if(wMoney>bBalance) {
			System.out.println("잔액보다 많이 출금할수 없습니다.");
		}else {
			bBalance -= wMoney;
		}
		
	}// end of withdraw()
	
	public int check() {
		return (bBalance);
		
	}// end of check()
	
	
	
	
}//end of Bank class
*/