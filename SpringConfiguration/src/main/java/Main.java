import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Payable payable = new Consultant();
//		
//		payable.pay();
		
		//1) ** XML Configuration ** 
		@SuppressWarnings("resource") // used to remove warning from "context" beacause we didn't close it there is no context.close() function available
//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml"); 
//		Payable payable = (Payable) context.getBean("myBean");
//		Payable payable2 =(Payable) context.getBean("myBean2");
		
//		if(payable==payable2)
//		{
//			System.out.println("same");
//		}
//		else {
//			System.out.println("diff");
//		}
		
//		payable.pay();
//		payable.display();
		
		//2) ** Annotation Configuration **
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Payable payable = (Payable) context.getBean("createConsultant"); // here Class name will be id

		payable.pay();
		payable.display();
		
	}

}
