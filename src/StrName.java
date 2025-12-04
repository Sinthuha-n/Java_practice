public class StrName {
    public static void main (String a[])
    {
        String name = "kevin";
        name = name + " joel";
        System.out.println("hello " + name);

        StringBuffer sb = new StringBuffer();

        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
//String buffer is thread safe & String builder is not