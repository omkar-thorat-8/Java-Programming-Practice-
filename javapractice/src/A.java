
class A{

    void Draw(){
        System.out.println("Drawing is Good");

    }
}
class B extends A{


    void Draw(){
        super.Draw();
        System.out.println("Drwaing is Bad");
    }
}
class demo{
    public static void main(String[] args) {

        B r=new B();
        r.Draw();
    }
}















