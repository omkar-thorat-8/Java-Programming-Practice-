import java.util.Scanner;
public class cal_percentage
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float total=500;
        System.out.println("Enter the marks Obtained in Five Subjects");
        System.out.println("Marathi");
        float a=sc.nextfloat();
        System.out.println("English");
        float b=sc.nextfloat();
        System.out.println("Maths");
        float c=sc.nextfloat();
        System.out.println("Hindi");
        float d=sc.nextfloat();
        System.out.println("IT");
        float e=sc.nextfloat();

        float sum=a+b+c+d+e;
        System.out,println("Total marks obtained is :");
        System.out,println(sum);
        float percentage=(sum/total)*100;
        System.out,println("Final Marks Percentage is :");
        System.out,println(percentage);
    }
}
