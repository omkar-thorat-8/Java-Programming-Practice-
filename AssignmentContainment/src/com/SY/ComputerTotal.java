package com.SY;

public class ComputerTotal {

	private int theory;
	private int practical;

	public ComputerTotal() {
		
	}

	public ComputerTotal(int theory, int practical) {
		
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
	
	public int getComputerTotal() {
		
		int res = this.theory + this.practical;
		
		return res;
	}
	
}
