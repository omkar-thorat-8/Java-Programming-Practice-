
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Approach 1 : Implements in a class
		ArithmeticOps add = new Addition();
		System.out.println(add.calculate(12, 12));
		
		//Approach 2 : Anonymous inner class
		
		ArithmeticOps sub = new  ArithmeticOps()
				{
					public int calculate(int op1,int op2)
					{
						return op1-op2;
					}
				};
		System.out.println(sub.calculate(12, 12));

		//Approach 3 : Lambda Expression
		// Lamba Only work for Functional Interface Which has
		// only one method in interface
		ArithmeticOps multi = ( op1,op2) -> op1 * op2;
		System.out.println(multi.calculate(12, 12));
		
		
		ArithmeticOps div = ( op1,op2) -> {
			System.out.println("Within Lambda");
			return op1 / op2;
		};
		System.out.println(div.calculate(120, 12));
	}

}
