package org.bank;

public class AxisBank extends BankInfo{
	public void deposits() {
	System.out.println("Deposits:  6%");
}
public static void main(String[] args) {
	AxisBank a=new AxisBank();
	a.savings();
	a.fixed();
	a.deposits();
}
}
