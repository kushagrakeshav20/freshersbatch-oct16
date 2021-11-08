import java.util.Scanner;
public class student_Avg {
	public static void main(String args[]){
		
		int total = 0,avg=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark of subject A ");
		int A = sc.nextInt();
		System.out.println("Enter the mark of subject B ");
		int B = sc.nextInt();
		System.out.println("Enter the mark of subject C ");
		int C = sc.nextInt();
		
		 total = A+B+C;
		 System.out.println("Total "+total);
		 
		 avg=total/3;
		 System.out.println("Average "+avg);
		
		
		
	}

}
