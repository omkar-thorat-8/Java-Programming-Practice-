package addition;

public class Main {

	public static void main(String[] args)
	{

		Addition a = new Addition();
		
		int res1 = a.add(100000,20000);
		double res2 = a.add(100, 2000);
		
		System.out.println("Result of int int is ="+res1);
		System.out.println("Result of int double is ="+res2);
		
	}

}
