package prob05;

public class Account {
	
	String accountNumber = "";
	int Money;
	int DepositMoney;
	int SaveMoney;
	
	public Account(String accountNumber) 
	{
		this.accountNumber = accountNumber;
		System.out.println( accountNumber + "계좌가 개설되었습니다.");
	}
	
	public String getAccountNo() {
		return accountNumber;
	}
	
	public int getBalance() {
		return Money;
	}
	
	public void save(int saveMoney) {
		Money += saveMoney;
		System.out.println(accountNumber + "계좌에 " + saveMoney + "만원이 입금되었습니다.");
	}
	
	public void deposit(int depositMoney) {
		Money -= depositMoney;
		System.out.println(accountNumber + "계좌에 " + depositMoney + "만원이 출금되었습니다.");
	}

}
