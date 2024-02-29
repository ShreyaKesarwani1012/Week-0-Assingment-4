class Avg{
public static void main(String [] args){
 int a []={5,4,3,9,7,9,1};
double avg;
double sum=0;
for (int i =0;i<=5;i++){
sum= sum+a[i];
}
avg=sum/6;
System.out.println("the sum is "+sum);
System.out.println("the avg is "+String.format("%.12f",avg));

}
}