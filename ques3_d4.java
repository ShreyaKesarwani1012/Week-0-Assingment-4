import java.util.Scanner;
class Multiple{
public static void main(String[] args){
int n;
int i;
int sum=0;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the no");
n=sc.nextInt();
for (i=0; i<=n;i++){
 if (i%3==0){
sum= sum+i;
}
}//end of for loop
System.out.println("The sum is "+sum);
}//end of main
}//end of class

