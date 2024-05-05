import java.io.*;

public class TwoDSum 
{
public static void main(String[] args) 
   {
        DataInputStream din;
        int a[][];
        a = new int[3][3];
        din = new DataInputStream(System.in);
        System.out.println("ABEY THOMSON");
        try {
            System.out.println("Enter the element in 2d array");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    a[i][j] = Integer.parseInt(din.readLine());
                }
            }
            System.out.println("The 2d array is:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Row wise sum");
            for (int i = 0; i < 3; i++) {
                int rowsum = 0;
                for (int j = 0; j < 3; j++) {
                    rowsum = rowsum + a[i][j];
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("| " + rowsum);
            }
            System.out.println("Column wise sum");
            for (int i = 0; i < 3; i++) {
                int colsum = 0;
                for (int j = 0; j < 3; j++) {
                    colsum = colsum + a[j][i];
                    System.out.print(a[i][j]+ " ");
                }
                System.out.println("| " + colsum + " ");
            }
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
    }
}
