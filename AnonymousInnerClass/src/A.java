//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class A {

    public void show() {
        System.out.println("In A class");
    }

    public static void main(String[] args) {

        A ref = new A()
        {
            @Override
            public void show() {
                System.out.println("In Anonymous class");
            }

        };

        ref.show();
    }
}