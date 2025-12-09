 class Calc
{
    public int add(int n1,int n2)
    {
        return n1 + n2;
    }
    public int sub(int n1,int n2)
    {
        return n1 - n2;
    }
}

 class AdvCalc extends Calc
{
    public int multi(int n1,int n2)
    {
        return n1 * n2;
    }
    public int div(int n1,int n2)
    {
        return n1 / n2;
    }
}

public class Inheritance {
    public static void main (String a[])
    {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(4,9);
        int r2 =  obj.sub(9,5);
        int r3 =  obj.multi(3,4);
        int r4 =  obj.sub(15,5);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}
