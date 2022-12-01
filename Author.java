import java.util.Scanner;



class Info{

String title; String author; int price; int num_pages;

Info()

{

title = new String(); 

author = new String();

Scanner ss = new Scanner(System.in);

System.out.println("Please enter the name of the book:\t");

title = ss.next(); 

System.out.println("Please enter the name of the author:\t");

author = ss.next();

System.out.println("What are its prices and number of pages respectively:\t");

price = ss.nextInt(); num_pages = ss.nextInt();

}

@Override

public String toString() 

{

return "Book Title:\t"+title +"\nWritten by:\t"+author +"\nCost:\t"+price +"\nPages:\t"+num_pages;

}

}

class Author

{

public static void main(String args[])

{

int total;

System.out.println("How many books do you want to record: ");

try (Scanner two = new Scanner(System.in))

{

total = two.nextInt();



Info one[] = new Info[total];

for(int i=0;i<total;i++)

{

one[i] = new Info();

}

System.out.println("Do you want to check the information recorded? 0 to exit.");

if(two.nextInt() != 0)

{

for(int i = 0; i<total;i++)

{

System.out.println(one[i]);

}

}

}

}

}
