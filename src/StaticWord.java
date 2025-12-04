class Mobile
{
    String brand;
    int price;
    static String name;//common variable
    //static keyword is belongs to the class no to the object.

    public void show()
    {
        System.out.println(brand + ":" + price + ":" + name + ":");
    }
    // static method
    public static void show1()
    {
        System.out.println("Static method");
        System.out.println( name);
        /*you can use static variable in static method you cannot use non static variable
        inside static method*/
    }
    //passing
    public static void show2(Mobile obj)
    {
        System.out.println(obj.brand + ":" + obj.price + ":" + name + ":");
    }
    //static block is at called once and called in first
}

public class StaticWord {
    public static void main (String a[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand="apple";
        obj1.price=150000;
        Mobile.name="smartphone";//static variable called in class name not object name

        Mobile obj2 = new Mobile();
        obj2.brand="samsung";
        obj2.price=125000;
        Mobile.name="smartphone";

        //obj.name="phone";

        obj1.show();
        obj2.show();

        Mobile.show1();
        Mobile.show2(obj1);
    }
}
