import java.util.Scanner;

public class QN1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three value: ");
		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();
		
		if(a>b && a>c) {
			System.out.print("The Maximum Temaparature is: "+a);
		}
		else if(b>a && b>c) {
			System.out.print("The Maximum Temaparature is: "+b);
		}
		else {
			System.out.print("The Maximum Temaparature is: "+c);
		}
	}

}
