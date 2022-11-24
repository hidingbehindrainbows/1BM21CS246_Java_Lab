import java.util.Scanner;

class SGPA{
    double cgpa;
    void sgpa(String u, int c[], int m[])
    {
        System.out.println("USN:\t"+u);
        cgpa = (double)(c[0]*m[0] + c[0]*m[1] + c[1]*m[2] + c[1]*m[3] + c[1]*m[4] + c[1]*m[5] + c[2]*m[6])/18;
        System.out.println("SGPA:\t"+ cgpa);
    }
}

class Student{
    public static void main(String args[])
    {
        int credits[] = new int[3];
        credits[0] = 1;
        credits[1] = 3;
        credits[2] = 4;
        int marks[] = new int[7];
        Scanner ss = new Scanner(System.in);
        SGPA one = new SGPA();
        System.out.println("Enter the name please:\t");
        String name = ss.next();
        System.out.println("Please enter "+name+"'s USN:\t");
        String usn = ss.next();
        System.out.println("Enter the marks of the subjects IDT, English, Maths, BEE, ECM, EVI, Physics in that order\n");
        for(int i=0;i<7;i++)
        {
                marks[i] = ss.nextInt(); 
        }
        for(int i=0;i<7;i++)
        {
		if(marks[i]==100)
		{
			marks[i]=10;
		}
		else if(marks[i]<40)
		{
			marks[i] = 0;
		}
		else
		{
		for(int j=10; j>3;j--)
            {
                 if(j*10-10 <= marks[i] && marks[i]< j*10)
                 {
                        marks[i] = j;
                 }
            }
		}
         }
         System.out.println("Would you like to view "+name+"'s Informations? 1/0");
         if(ss.nextInt() != 0)
         {
                one.sgpa(usn, credits, marks);
         }
    }
}