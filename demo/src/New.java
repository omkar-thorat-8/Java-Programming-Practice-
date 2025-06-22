public class New
{
    int a=10;
    static int b=20;

    public static void main(String[] args) {

        New r=new New();
        New.show();
        r.display();


    }
    static void show()
    {
        System.out.println(b);
    }
    void display()
    {
        System.out.println(a+" "+b);
    }
}
