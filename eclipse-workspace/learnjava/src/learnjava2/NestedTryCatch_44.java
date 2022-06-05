package learnjava2;

import java.util.Scanner;

public class NestedTryCatch_44 {
	public static void main(String[] args) {
		int [] marks = {12,13,14};
		Scanner sc = new Scanner(System.in);
		
		
		boolean flag = true;
		while(flag) {
			System.out.println("Enter the index");
			int index = sc.nextInt();
		
		try {
			System.out.println("Welcome");
			try {
				
				System.out.println(marks[index]);
				flag = false;
				System.out.println("Haa ab sahi hai");
				
			} 
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("sahi daal bhenchod");
				
			}
			
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		}
		
	}

}
