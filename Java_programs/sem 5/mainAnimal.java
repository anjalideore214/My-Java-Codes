class Animal{

public void Animalbest(){
System.out.println("Animals are best");
}
public void Eat(){
System.out.println("Every animal can eat");
}
}
class Wild extends Animal{
 public void sleep()
{
System.out.println("Every wild animal sleep");
}
}
public class mainAnimal{
/**
 * @param args
 */
public static void main(String[] args)
{
Wild w1= new Wild();
w1.Animalbest();
w1.Eat();
w1.sleep();
}
}

