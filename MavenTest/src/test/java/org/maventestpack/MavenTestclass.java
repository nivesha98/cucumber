package org.maventestpack;

public class MavenTestclass {
	 public static int a=10;//static variable
	
	private void add() {
		int a=100;//local variable
		System.out.println(a);
	}
	private void add1() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		    //int a=10;
			MavenTestclass s = new MavenTestclass();
			s.add();
			s.add1();

			MavenTestclass s1 = new MavenTestclass();
			s1.add1();
			s1.add();

}}
