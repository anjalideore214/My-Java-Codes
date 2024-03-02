class FunctionofString{
public static void  main(String args[])
{
String s1="     Hello Tybsc Student I am Anjali Deore    ";
System.out.println("String in Capital Letters:"+s1.toUpperCase());
System.out.println("String in Small Letters:"+s1.toLowerCase());
System.out.println("Replacing the character:"+s1.replace("a","F"));
System.out.println("Finding Length of String:"+s1.length());
System.out.println("Removing traiviling Spaces:"+s1.trim());
String s2="My class is very BEST";
System.out.println("Adding two String:"+s1.concat(s2));
String s3="INDIA";
String s4="india";
System.out.println("Comparing two strings:"+s3.equals(s4));
System.out.println("Comparing two strings:"+s3.equalsIgnoreCase(s4));
System.out.println("My SubString is:"+s1.substring(10,30));
}
}