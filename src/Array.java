public class Array {
    public static void main(String a[])
    {
        // create array
        /*int nums[]=new int[4];
        nums[0]=4;
        nums[1]=8;
        nums[2]=3;
        nums[3]=9;

        for(int i=0;i<4;i++) {
            System.out.println(nums[i]);
        }*/
        // multi dimensional array
        int nums[][]=new int[3][4];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                nums[i][j] = (int)(Math.random() * 100);
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //second method for multi dimensional array
        for(int n[] : nums)
        {
            for(int m :n)
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }
        System.out.println();

        //jagged array
        int num[][]=new int[3][];
        num[0]=new int[3];
        num[1]=new int[4];
        num[2]=new int[2];

        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[i].length;j++)
            {
                num[i][j] = (int)(Math.random() * 100);
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
