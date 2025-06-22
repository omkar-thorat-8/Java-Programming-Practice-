import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<Account> allActs = new TreeSet();
		
		allActs.add(new Account(10,"Ankit"));
		allActs.add(new Account(11,"Ajay"));
		allActs.add(new Account(12,"Jagu"));
		allActs.add(new Account(13,"Sankalp"));
		allActs.add(new Account(14,"Vadant"));

		
		for(Account ref : allActs)
		{
			System.out.println(ref.getActId());
		}
	}
}
