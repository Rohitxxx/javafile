import java.util.Scanner;
 class Matrix {
    private int n,m,mat[][];
    public Matrix(int n,int m){
        this.n=n;
        this.m=m;
        mat=new int[n][m];
    }
    public Matrix add(Matrix m1){
        if(this.isAddable(m1)){
       Matrix temp=new Matrix(this.n,this.m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                temp.mat[i][j]=this.mat[i][j]+m1.mat[i][j];
            }
        }
        return temp;
    }
    else{
        System.out.println("addition is not applicable");
    }
    return null;
    }
    boolean isAddable(Matrix m1){
        if((this.n==m1.n)&&(this.m==m1.m)){
            return true;
        }
        else
            return false;

    }
    public void show(){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                System.out.print(mat[i][j]+"  ");
            System.out.print("\n");
        }
    }
    public void get(){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the elements in matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                this.mat[i][j]=scan.nextInt();
        }
        //scan.close();
    }
   
    
}
public class MatrixExample{
    public static void main(String args[]){
        Matrix mat1=new Matrix(2,2);
        mat1.get();
        Matrix mat2=new Matrix(3,2);
        mat2.get();
        Matrix mat3=new Matrix(2,2);
        mat3=mat2.add(mat1);
        mat3.show();
    }
}