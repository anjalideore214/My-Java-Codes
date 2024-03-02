class prime{
public static void main(String args[])
{
int num=50;
int count=0;
int i=2;
while(count<=num)
{
boolean isPrime=true;
for(int j=2;j<=i-1;j++)
{
if(i%j==0)
{
isPrime =false;
System.out.println("NOT prime");
break;
}
}
if(isPrime)
{
System.out.println(i+" ");
count++;
}
i++;
}
}
}