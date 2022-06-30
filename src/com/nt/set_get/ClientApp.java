package com.nt.set_get;

public class ClientApp {

	public static void main(String[]args) {
		System.out.println("Main Start");
		GenerateResult obj= new GenerateResult();
		
		Student st=new Student();
		
		st.setSno(100);
		st.setM1(50);
		st.setM2(60);
		st.setM3(70);
		
		
		System.out.println(obj.findResult(st));
		
		System.out.println("Main end");
	}
}
