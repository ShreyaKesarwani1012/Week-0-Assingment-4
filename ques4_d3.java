import java.util.Scanner;
class Add{
public static void main(String [] args){
int n ;
int i,j;

System.out.println("Please enter the matix no of row / cols(It must be equal)");
Scanner sc= new Scanner(System.in);
n= sc.nextInt();
//taking value of matxix 1st
System.out.println("enter the value 1 st matrix");
int a[][]=new int[n][n];
for (i=0;i<n;i++){
System.out.println("enter the"+i+ "row , enter horizontally and give space");
for(j=0;j<n;j++){
	a[i][j]=sc.nextInt();
}
System.out.println();
}

//taking value of matrix 2nd
System.out.println("enter the value 2st matrix");
int b[][]=new int[n][n];
for (i=0;i<n;i++){
System.out.println("enter the"+i+ "row , enter horizontally and give space");
for(j=0;j<n;j++){
 	b[i][j]=sc.nextInt();
}
System.out.println();
}
//Adding 2 matrix
int c[][]= new int[n][n];
for (i=0;i<n;i++){
for(j=0;j<n;j++){
 c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+" ");    
}
System.out.println();
}
}//end of main 
}// end of class
