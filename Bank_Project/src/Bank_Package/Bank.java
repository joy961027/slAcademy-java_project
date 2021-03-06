package Bank_Package;

import java.io.Serializable;

public class Bank implements Serializable {
	private String bName, bAccount;
	private int bBalance;




	public Bank(String n, String a, int b) {
		this.bName=n;
		this.bAccount=a;
		this.bBalance=b;
		// TODO Auto-generated constructor stub
	}

	public void setBank(String n, String i, int b) 
	{
		bName=n;
		bAccount=i;
		bBalance=b;	
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


	public int deposit(int Money) {

		if(Money<0) {
			System.out.println("음수가 입력되었습니다.");
			return (-1);
		}else {
			bBalance +=Money;
			return 0;
		}

	}// end of deposit()

	public int withdraw(int Money) {

		if(Money>bBalance) {
			System.out.println("잔액보다 많이 출금할수 없습니다.");
			return (-1);
		}else {
			bBalance -= Money;
			return (0);
		}

	}// end of withdraw()

	public int check() {
		return(this.getBankBalance());

	}// end of check()

	///////////////////////////////////////실무에서 처리할만한 에러는 글자입력과 공백입력 에러 찾아보기/////////////////////////////


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