import java.util.ArrayList;

public class RemoveDuplicate{
    public static void main(String[] args) 
    {

    	ArrayList<Integer> list = new ArrayList<>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.add(2);
    	list.add(4);
    	list.add(3);
    	list.add(5);
    	
        System.out.println("before removing duplicate: " + list);

        
        ArrayList<Integer> newupdatedlist = new ArrayList<>();
        
        for (Integer num : list) 
        {
            if (!newupdatedlist.contains(num)) 
            {
            	newupdatedlist.add(num);
            }
        }
        
        System.out.println("new List without duplicaate: " + newupdatedlist);
    }
}
