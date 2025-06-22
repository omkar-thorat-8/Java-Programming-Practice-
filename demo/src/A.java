public class A
{
    static int a=10;
    int b=20;
    public static void main(String[] args) {

        A ref = new A();
        int c=30;

        System.out.println("Static using Class Name "+A.a);
        System.out.println("Static using Object Name "+ref.a);
        System.out.println(" accessing Static variable without CLass Name and Object name "+a);
        System.out.println("Instance "+ref.b);
        System.out.println("Local"+c);


    }
}
