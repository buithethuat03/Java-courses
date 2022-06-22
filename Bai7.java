import java.util.Scanner;

public class Bai7 {
    
    static Scanner scanner = new Scanner(System.in);

    static void getArray(int[]array,int num)
    {
        for(int i=0;i<num;i++)
        {
            array[i]=scanner.nextInt();
        }
    }

    static void printArray(int[]array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }

    static void get2dArray(int[][]array2d,int col,int row)
    {
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                array2d[i][j]=scanner.nextInt();
            }
        }
    }

    static void print2dArray(int[][]array2d,int col,int row)
    {
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(array2d[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        String[]cars={"Camaro","Toyota","Honda","Suzuki"};
        for(int i=0;i<cars.length;i++)
        {
            System.out.println(cars[i]);
        }
        int num;

        num=scanner.nextInt();

        int[]array=new int[num];
        getArray(array,num);
        printArray(array);

        int col,row;
        row=scanner.nextInt();
        col=scanner.nextInt();
        int[][]array2d=new int[row][col];
        get2dArray(array2d,col,row);
        print2dArray(array2d,col,row);
    }
}
