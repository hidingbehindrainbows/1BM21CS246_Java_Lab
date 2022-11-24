import java.util.Scanner;
class Quad
{
double d, r1, r2;
Quad(double a, double b, double c)
{
if(a==0)
{
System.out.println("Coefficient 'a' can not be zero for this.");
}
else
{
d = b*b-4*a*c;
if(d>0)
{
System.out.println("The roots are real and distinct");
r1 = (-b+Math.sqrt(d))/(2*a);
r2 = (-b-Math.sqrt(d))/(2*a);
System.out.println("First root is: " + r1 +"\nSecond Root is: "
+r2);
}
else if(d==0)
{
System.out.println("The roots are real and equal");
r1 = -b/(2*a);
System.out.println("The roots are both: " + r1);
}
else
{
System.out.println("The roots are imaginary and distinct.");
r1 = -b/(2*a);
r2 = (Math.sqrt(Math.abs(d)))/(2*a);
System.out.println("First root is:" + r1 + "+i" + r2);
System.out.println("Second root is:" + r1 + "-i" + r2);
}
}
}
}
class Quadratic_Equations
{
public static void main(String args[])
{
System.out.println("Enter your coefficients:\n");
Scanner ss = new Scanner(System.in);
Quad One = new Quad(ss.nextInt(), ss.nextInt(), ss.nextInt());
}
}