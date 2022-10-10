import java.util.Scanner;

public class salary
{
  public static void main(String args[])
  {
    float sal,tax,allow,net;

    System.out.println("Enter salary");
    Scanner in = new Scanner(System.in);
    sal = in.nextInt();
	tax=(20/100)*sal;
	allow=(40/100)*sal;
	net=(sal-tax-allow);

   

    System.out.println("net salary is " + net);
  }
}