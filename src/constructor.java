class Humm
{
    private int age=23;//private is only accessable in same class.
    private String name;

    // default constructor
    public Humm()
    {
        age = 12;
        name ="john";
    }
    //Parameterized Constructor
    public Humm(int a,String n)
    {
        age = a;
        name =n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class constructor {
    public static void main(String a[])
    {
        Humm obj = new Humm();
        Humm obj1 = new Humm(18,"joel");
        //obj.setName("Sinthu");
        //obj.setAge(20);

        System.out.println(obj.getName());
        System.out.println(obj.getAge());

        System.out.println(obj1.getName() +":" + obj1.getAge() );
    }
}
