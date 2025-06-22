
public class NonRepeating{
	
    public static char FirstNonRepeated(String str) 
    {
        int length = str.length();

        for (int i = 0; i < length; i++) 
        {
            char current = str.charAt(i);
            
            boolean isRepeated = false;

            for (int j = 0; j < length; j++)
            {
                if(i != j && str.charAt(j) == current) 
                {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) 
            {
                return current;
            }
        }

        return '\0';
    }

    public static void main(String[] args)
    {
        String input = "swiss";
        
        char result = FirstNonRepeated(input);
        
        if (result != '\0')
        {
            System.out.println("First non repeated character: " + result);
        } 
        else 
        {
            System.out.println("No unique char found");
        }
    }
}
