class Cars{
String Name,Colour;
Cars()
{
Name="ODDY";
Colour="RED";
}
Cars(String N,String C)
{
Name=N;
Colour=C;
}
void display()
{
System.out.println("Name of Car is:"+Name);
System.out.println("Colour of Car is:"+Colour);
}
public static void main(String args[])
{
Cars c1=new Cars();
System.out.println("This is Default Constructor:");
c1.display();
Cars c2=new Cars("INNOVA","BLACK");
System.out.println("This is Parameterised Constructor:");
c2.display();
}
}