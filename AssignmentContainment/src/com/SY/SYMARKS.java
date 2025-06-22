package com.SY;

public class SYMARKS {

	private ComputerTotal computer;
	private MathsTotal maths;
	private ElectronicsTotal electronics;
	
	public SYMARKS() {
		
	}

	public SYMARKS(ComputerTotal computer, MathsTotal maths, ElectronicsTotal electronics) {
		
		this.computer = computer;
		this.maths = maths;
		this.electronics = electronics;
	}

	public int getComputerMarks() {
		
		return computer.getComputerTotal();
	}
	
	public int getMathsMarks() {
		
		return maths.getMathsTotal();
	}
	
	public int getElectronicsMarks(){
		
		return electronics.getElectronicsTotal();
	}
	
	public int getTOtalMarks()
	{
		return computer.getComputerTotal()+maths.getMathsTotal()+electronics.getElectronicsTotal();
	}
}
