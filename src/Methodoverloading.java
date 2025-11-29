
class Calculato {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, double n2) {
        return n1 + n2;
    }
}


    public class Methodoverloading {
        public static void main(String a[])
        {
            //int num1=4;
            //int num2=5;

            Calculato calc = new Calculato();
            System.out.println(calc.add(4,5));
            System.out.println(calc.add(4,5,6));
            System.out.println(calc.add(4.5,5.5));


        }

    }
