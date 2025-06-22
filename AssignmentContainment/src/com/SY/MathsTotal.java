package com.SY;

public class MathsTotal {

	private int theory;
	private int practical;

	public MathsTotal() {
		
	}

	public MathsTotal(int theory, int practical) {
		
		this.theory = theory;
		this.practical = practical;
	}

	public int getTheory() {
		return theory;
	}

	public void setTheory(int theory) {
		this.theory = theory;
	}

	public int getPractical() {
		return practical;
	}

	public void setPractical(int practical) {
		this.practical = practical;
	}
	
	public int getMathsTotal() {
		
		int res = this.theory + this.practical;
		
		return res;
	}
}
