
public class ComplexNo 
{
	private int real;
	private int imaginary;
	
	//setter
	public void setReal(int real) 
	{
		this.real=real;
		
	}

	public void setImaginary(int imaginary) 
	{
		this.imaginary=imaginary;
	}

	//getters
	public int getReal() 
	{
		return this.real;
	}

	public int getImaginary() 
	{
		return this.imaginary;
	}

	void display()
	{
		System.out.println(this.real + "+" + this.imaginary + "i" );

	}
	
	
	
	
	

}
