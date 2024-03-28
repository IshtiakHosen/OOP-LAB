import java.util.Scanner;

public class QN4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Types of Plant: ");
		int n = input.nextInt();
		
		int sum = 0;
		int[] Water = new int[n];
		for(int i = 0;i<n;i++) {
			
			System.out.print(i+" ");
			Water[i]=input.nextInt();
			
			sum =sum+Water[i];
		}
		
		System.out.println("Total water daily: "+sum);
		int Totalweekly=7*sum;
		System.out.println("Total water Weekly: "+Totalweekly);
		float avgWater=Totalweekly/7;
		System.out.println("Avarage water on Daily: "+avgWater);
		float avgWaterforEach=avgWater/n;
		System.out.println("Avarage water on Daily for Each Plant: "+avgWaterforEach);
		
	}

}
