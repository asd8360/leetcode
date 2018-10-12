package leetcode;

import zheng.Reverse;

public class S7 {
	public static void main(String[] args) {
		System.out.println(Math.pow(2, 31));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(reverse(1534236469));
	}
	public static int reverse(int x) {
		if((float)x>=Math.pow(2, 31) | (float)x<=-Math.pow(2, 31))
			return 0;
        int signal = 1;
        if(x<0) signal = -1;
        long ans = 0;
        while(x > 0) {
        	ans *= 10;
        	int k = x % 10;
        	ans += k;
        	x /= 10;
        	if(ans>=Integer.MAX_VALUE)
        		return 0;
        }
        return (int)ans * signal;
    }
}
