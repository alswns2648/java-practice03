package prob05;

public class Account {
	String accNum;
	
	public Account(String accNum) {
		this.accNum = accNum;
		System.out.println(accNum + " 계좌가 개설되었습니다.");
	}
	
	
	public void save(int saveMoney) {
		
	}
	
	public void deposit(int depositMoney) {
	}
	
	public String getAccountNo() {
		return accNum;
	}
	
	public int getBalance() {
		
		return 0;
	}

}
