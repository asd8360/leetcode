package leetcode;

public class S9 {
	public static void main(String[] args) {
//		System.out.println(isPalindrome(13531));
		System.out.println(isPalindrome(10));
	}
	public static boolean isPalindrome(int x) {
		if(x<0) return false;
		else if(x==0) return true;
		int [] num = new int[32];
		int i=0;
		while(x>0) {
			num[i] = x%10;
			x/=10;
			i++;
		}
		i -= 1;
		for(int j=0; j<(i+1)/2; j++) {
			if(num[j] != num[i-j]) return false;
		}
		return true;
	}
}
