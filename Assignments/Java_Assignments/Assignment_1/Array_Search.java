import java.util.Scanner;
public class Array_Search {
	
	public static void main(String[] args) {
		int flag = 0,i=0,n,x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		 n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the all Element");
		for( i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the search element");
		x = sc.nextInt();
		for( i=0;i<n;i++) {
			if(a[i] == x) {
				 flag = 1;
				break;
			}else {
				 flag = 0;
			}
				
		}
		if(flag == 1) {
			System.out.println("Element Found :  " +(i+1) );
		}else
			System.out.println("Element Not Found");
	}

}
