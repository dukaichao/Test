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

	// ȡ��
	public void withdraw(double amount) {
		if (this.balance > amount) {
			System.out.println("ȡ�"+amount);
			this.balance -= amount;
		
		} else
			System.out.println("����....");
	}

	// ���
	public void deposit(double amount) {
		System.out.println("��"+amount);
		this.balance += amount;
		
	}
	
}
