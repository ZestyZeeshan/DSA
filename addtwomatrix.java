
//package twoDmatrix;
import java.util.*;

public class addtwomatrix {
    static void printmatrix(int[][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print3(array[i][j]+ " ");
            }
            System.out.println();
        }

    }
    static void add(int[][]a , int row1 , int col1 , int[][]b , int row2,  int col2 ){
        int[][] sum=new int[row1][col1];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        printmatrix(sum);
    }
    
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter no of row");
        int row1=sc.nextInt();
        System.out.println("enter no of col");
        int col1=sc.nextInt();
        int [][] a=new int[row1][col1];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter no of row");
        int row2=sc.nextInt();
        System.out.println("enter no of col");
        int col2=sc.nextInt();
        int [][] b=new int[row2][col2];
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix1");
        printmatrix(a);
        System.out.println("matrix2");
        printmatrix(b);


        add(a,row1,col1,b,row2,col2);



    }

    
}
