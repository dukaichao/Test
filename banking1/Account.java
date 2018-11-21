package cn.itcast.banking1;

public class Account {
	protected double balance;

	public Account(double  balance) {
		
		super();
		this.balance = balance;
		
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// 取款
	public void withdraw(double amount) {
		if (this.balance > amount) {
			System.out.println("取款："+amount);
			this.balance -= amount;
		
		} else
			System.out.println("余额不足....");
	}

	// 存款
	public void deposit(double amount) {
		System.out.println("存款："+amount);
		this.balance += amount;
		
	}
	
}
