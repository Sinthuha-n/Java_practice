class Human
{
   private int age=23;//private is only accessable in same class.
   String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Encapsulation {
    public static void main (String a[])
    {
        Human obj = new Human();
        obj.name= "Sinthu";
        obj.setAge(20);

        System.out.println(obj.name);
        System.out.println(obj.getAge());
    }
}
