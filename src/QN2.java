import java.util.Scanner;

public class QN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		
		if((year%4==0 && year%100 != 0)|| year%400==0) {
			System.out.println(year+" is a Leapyear.");
		}
		else {
			System.out.println(year+" is not a Leapyear.");
		}
	}

}
