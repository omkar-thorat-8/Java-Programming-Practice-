

    class Activities
    {

        public void activities()
        {
            System.out.println("Activity Called");
        }
    }

    interface Payable
    {
        public void pay();
    }
    class Contract implements Payable
    {
       public void pay()
        {
            System.out.println("Paying in Contract...");
        }
    }
class Employee extends Activities implements Payable
{
    public void pay()
    {
        System.out.println("Paying in Employee...");
    }
}
class Developer extends Employee
{
    public void pay()
    {
        System.out.println("Paying in Developer...");
    }
}
class Manager extends Employee
{
    public void pay()
    {
        System.out.println("Paying in Manager...");
    }
}
public class Main {
    public static void main(String[] args) {


        Payable p =  new Contract();

        p.pay();


    }
}

