package com.nt.set_get;

public class GenerateResult {

	public String findResult(Student bean) {
		int total;
		
		total=bean.getM1()+bean.getM2()+bean.getM3();
		return "Raja's Sl no"+bean.getSno()+ "& Mark is" +total;
	}
}
