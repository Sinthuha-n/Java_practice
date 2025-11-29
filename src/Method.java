class Computer
{
    public void playMusic()
    {
        System.out.println("playing Music....");
    }

    public String getMeAen(int cost)
    {
        if (cost>=10)
            return "pen";
        return "nothing";
    }
}




public class Method
{
    public static void main(String a[])
    {
        Computer com = new Computer();
        com.playMusic();
        String str=com.getMeAen(10);
        System.out.println(str);
    }

}
