package com.fortis.cge.kata.model;

/**
 * This enum is representing position in the table to use
 * @author Didier
 */
public enum PositionEnum {

	P1(1),
	P2(2),
	P3(3),
	P4(4),
	P5(5),
	P6(6),
	P7(7),
	P8(8),
	P9(9);
	private int code;
	
	public int getCode() {
		return code;
	}
	
	PositionEnum(int code) {
		this.code=code;
	}


}
