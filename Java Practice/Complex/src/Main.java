
public class Main {

	public static void main(String[] args) 
	{
		
		ComplexNo c1 =new ComplexNo();
		ComplexNo c2 =new ComplexNo();
		
		c1.setReal(100);
		c1.setImaginary(200);
		
		c2.setReal(101);
		c2.setImaginary(201);
		
		
		c1.getReal();
		c1.getImaginary();
		
		int real= c2.getReal();
		int imaginary =c2.getImaginary();
				
		System.out.println();
		c1.display();
		c2.display();
		System.out.println();
		
		System.out.println(real + "+" + imaginary + "i" );
		
	}
	
	
}
