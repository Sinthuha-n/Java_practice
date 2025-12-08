class Humm
{
    private int age=23;//private is only accessable in same class.
    private String name;

    // constructor
    public Humm()
    {
        age = 12;
        name ="john";
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
        //obj.setName("Sinthu");
        //obj.setAge(20);

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
