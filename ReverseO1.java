package leetcode;

import java.util.Scanner;

public class ReverseO1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		int reversed=0;
		if(input<0) {
			System.out.println("your input less than 0.");
			return;
		}
		while(input != 0) {
			reversed = reversed*10 + input%10 ;
			input /= 10;
		}
		System.out.println("the reversed number is "+reversed);
		return;
	}
}
