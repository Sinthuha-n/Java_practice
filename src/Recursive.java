public class Recursive {
    public static void main(String[] args) {
        noprint(10);
    }


    public static void noprint(int n) {
        //Base case
        if (n == 1) {
            System.out.println(1);
        }
        // recursive case
        else {
            System.out.println(n);
            noprint(n - 1);
        }
    }
}