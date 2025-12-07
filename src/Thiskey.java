class Hum
{
    private int age=23;//private is only accessable in same class.
    private String name;


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

public class Thiskey {

        public static void main (String a[])
        {
            Hum obj = new Hum();
            obj.setName("Sinthu");
            obj.setAge(20);

            System.out.println(obj.getName());
            System.out.println(obj.getAge());
        }


}
//this keyword refers to the current object — the object on which a method or constructor is being called.
