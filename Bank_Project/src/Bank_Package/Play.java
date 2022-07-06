package Bank_Package;

import java.util.ArrayList;
import java.util.Scanner;

public class Play {
	public static void main(String[] args) {
		Bank b = null; //고객정보의 객체를 연결한 레퍼런스
		String tmpName= null;//임시변수(이름)
		String tmpAcc = null;//임시변수(계좌번호)
		int tmpBalance = 0; //임시변수(잔액)
		int tmpNumber = 0; //임시변수(선택)
		boolean checkValue = false;
		ArrayList<Bank> bank = new ArrayList<Bank>();//고객 정보를 저장해둘 보관소(컨테이너)


		int menu=0;
		// 메뉴구현 프로토타입
		// 무한 반복문
		cls();
		while(true) 
		{



			//			Runtime runtime =Runtime.getRuntime();
			//			try {
			//				//runtime.exec("cmd /c " + cmd);
			//				runtime.exec("cmd /c "+ "cls");
			//				}catch(IOException e) {
			//					e.printStackTrace();
			//				}
			//메뉴출력
			System.out.println("1.고객정보등록");
			System.out.println("2.고객이름조회");
			System.out.println("3.고객목록출력");
			System.out.println("4.종료");
			//메뉴선택
			Scanner input = new Scanner(System.in);
			System.out.print("원하는 메뉴를 입력하세요 : ");
			menu = input.nextInt();
			//메뉴처리
			switch(menu)
			{
			case 1:
			{
				cls();
				System.out.println("고객정보등록 메뉴를 실행했습니다.");
				for(int idx=0; idx<2; idx++) 
				{
					b = new Bank();

					Scanner input2 = new Scanner(System.in);
					System.out.print("이름: "); tmpName = input2.nextLine();
					System.out.print("계좌번호: "); tmpAcc = input2.nextLine();
					System.out.print("잔액: "); tmpBalance = input2.nextInt();
					b.setBank(tmpName, tmpAcc, tmpBalance);
					bank.add(b);
				}

			}break;
			case 2:
			{
				cls();
				System.out.println("고객이름조회 메뉴를 실행했습니다.");
				Scanner input3 = new Scanner(System.in);
				System.out.println("이름 이나 계좌 번호를 선택해주세요.\n1 : 이름\n2 : 계좌  "); tmpNumber = input3.nextInt();

				if(tmpNumber == 1) 
				{
					System.out.print("이름을 적어주세요 : "); 
					input3.nextLine();
					tmpName = input3.nextLine();
					for(int idx=0;idx<bank.size(); idx++) 
					{
						if(bank.get(idx).getBankName().equals(tmpName)) 
						{
							checkValue = true;
						}
					}
					if(checkValue){
						System.out.println("이름이 존재합니다.");
					}else
					{
						System.out.println("이름이 존재하지 않습니다.");
					}
				}else if (tmpNumber ==2)
				{
					System.out.print("계좌번호를 적어주세요 : ");
					input3.nextLine();
					tmpAcc = input3.nextLine();
					for(int idx=0;idx<bank.size(); idx++) 
					{
						if(bank.get(idx).getBankAccount().equals(tmpAcc)) 
						{
							checkValue = true;
						}

					}
					if(checkValue){
						System.out.println("계좌번호가 존재합니다.");
					}else
					{
						System.out.println("계좌번호가 존재하지 않습니다.");
					}
				}else
				{
					System.out.println("1 또는 2를 적어주세요.");
				}
			}break;
			case 3:
			{
				cls();
				System.out.println("고객목록출력 메뉴를 실행했습니다.");
				for(int idx=0; idx<bank.size(); idx++) 
				{
					bank.get(idx).putBank();
				}
			}break;	
			case 4:
			{
				cls();
				System.out.println("종료되었습니다.");}			
			}

		}// end of while


	}// end of main

	public static void cls() {
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}catch(Exception e) {
			System.out.println("-1에러");
		}
	}
}// end of class




/*

강사님이 한것
Bank b = null; //고객정보의 객체를 연결한 레퍼런스
String tmpName= null;//임시변수(이름)
String tmpAcc = null;//임시변수(계좌번호)
int tmpBalance = 0; //임시변수(잔액)
int tmpNumber = 0; //임시변수(선택)
boolean checkValue = false;
ArrayList<Bank> bank = new ArrayList<Bank>();//고객 정보를 저장해둘 보관소(컨테이너)

for(int idx=0; idx<2; idx++) 
{
	b = new Bank();

	Scanner input = new Scanner(System.in);
	System.out.print("이름: "); tmpName = input.nextLine();
	System.out.print("계좌번호: "); tmpAcc = input.nextLine();
	System.out.print("잔액: "); tmpBalance = input.nextInt();
	b.setBank(tmpName, tmpAcc, tmpBalance);
	bank.add(b);
}

for(int idx=0; idx<bank.size(); idx++) 
{
	bank.get(idx).putBank();
}
Scanner input = new Scanner(System.in);
System.out.println("이름 이나 계좌 번호를 적어주세요.\n1 : 이름\n2 : 계좌  "); tmpNumber = input.nextInt();

if(tmpNumber == 1) 
{
	System.out.print("이름을 적어주세요 : "); 
	input.nextLine();
	tmpName = input.nextLine();
	for(int idx=0;idx<bank.size(); idx++) 
	{
		if(bank.get(idx).getBankName().equals(tmpName)) 
		{
			checkValue = true;
		}
	}
	if(checkValue){
		System.out.print("이름이 존재합니다.");
	}else
	{
		System.out.print("이름이 존재하지 않습니다.");
	}
}else if (tmpNumber ==2)
{
	System.out.print("계좌번호를 적어주세요 : ");
	input.nextLine();
	tmpAcc = input.nextLine();
	for(int idx=0;idx<bank.size(); idx++) 
	{
		if(bank.get(idx).getBankAccount().equals(tmpAcc)) 
		{
			checkValue = true;
		}

	}
	if(checkValue){
		System.out.print("계좌번호가 존재합니다.");
	}else
	{
		System.out.print("계좌번호가 존재하지 않습니다.");
	}
}else
{
	System.out.print("1 또는 2를 적어주세요.");
}
 */


/*
public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArrayList<Bank> b1 = new ArrayList<>();
	for(int i=0; i<2; i++) {
		Bank b = new Bank();
		b1.add(b);
		b1.get(i).setBank();
	}
	for(int i=0; i<2; i++) {
		b1.get(i).putBank();
	}
	Scanner input = new Scanner(System.in);
	System.out.print("찾으시는 이름이나 계좌번호가 있으신가요? 1번:이름, 2번:계좌 ");
	int tmpNumber= input.nextInt();
	if(tmpNumber==1) {
		System.out.print("이름을 입력해주세요 : ");
		Scanner input2 = new Scanner(System.in);
		String tmpName = input2.nextLine();
		if(b1.contains(tmpName)) {
			System.out.print("찾으시는 이름이 존재합니다.");
		}else {
			System.out.print("찾으시는 이름이 존재하지 않습니다.");
		}
	}else if(tmpNumber==2) {
		System.out.print("계좌번호를 입력해주세요 : ");
		Scanner input2 = new Scanner(System.in);
		String tmpAccount = input2.nextLine();
		Bank b = new Bank("",tmpAccount,0);
		if(b1.contains(b)) {
			System.out.print("찾으시는 계좌번호가 존재합니다.");
		}else {
			System.out.print("찾으시는 계좌번호가 존재하지 않습니다.");
		}

	}else {System.out.print("잘못 입력하셨습니다.");


	}

}
 */