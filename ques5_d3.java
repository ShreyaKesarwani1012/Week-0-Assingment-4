import java.util.Scanner;
class Comp{
public static void main(String[] args){
int n ;
int i=0;
int j=0;
boolean z=false;

System.out.println("Please enter the no of row/cols ");
Scanner sc= new Scanner(System.in);
n= sc.nextInt();


System.out.println("enter the value 1 st matrix");
int a[][]=new int[n][n];
for (i=0;i<n;i++){
System.out.println("enter the"+i+ "row , enter horizontally and give space");
for(j=0;j<n;j++){
	a[i][j]=sc.nextInt();
}
System.out.println();
}

System.out.println("enter the value 2st matrix");
int b[][]=new int[n][n];
for (i=0;i<n;i++){
System.out.println("enter the"+i+ "row , enter horizontally and give space");
for(j=0;j<n;j++){
 	b[i][j]=sc.nextInt();
}
System.out.println();
}

for (i=0;i<n;i++){
for(j=0;j<n;j++){
	if(a[i][j]==b[i][j]){

       		 z=true;
	}
else {
    z= false;
}
}
}


if(z){
       System.out.println("The matrix is same");
	}
else {
   System.out.println("The matrix is not same");
}


}
}