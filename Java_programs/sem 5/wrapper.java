import java.io.*;
import java.lang.Integer;
class wrapper{
/**
 * @param args
 */
public static void main(String[] args)
{
Integer o1= Integer(25);
Integer o2= Integer(35);
Integer o3= Integer(25);
System.out.println("comparison of object1 and object2 is:"+o1.compareTo(o2));
System.out.println("comparison of object3 and object2 is:"+o3.compareTo(o2));
System.out.println("comparison of object1 and object3 is:"+o1.compareTo(o3));

}
}