import java.util.*;
class fibbo{

public static void main(String args[])
{
int N1=0,N2=1,result=0,Fibnum;
@SuppressWarnings("resource")
Scanner ic=new Scanner(System.in);
System.out.println("Enter the No.  of terms:");
Fibnum=ic.nextInt();
System.out.println("Fibbonocci series of "+Fibnum +"is:");
for(int i=0;i<=Fibnum;i++)
{
System.out.println(result);
N1=N2;
N2=result;
result=N1+N2;
}
}
}