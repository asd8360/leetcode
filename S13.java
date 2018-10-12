package leetcode;

class S13{
	public static void main(String args[]){
		System.out.println(romanToInt("III"));
	}
	public static int romanToInt(String s){
		char [] a = s.toCharArray();

		int ans = 0;
		for(int i = 0; i < a.length; i++){
			if(i == a.length -1){
				if(a[i] == 'I') ans+= 1;
				if(a[i] == 'V') ans+= 5;
				if(a[i] == 'X') ans+= 10;
				if(a[i] == 'L') ans+= 50;
				if(a[i] == 'C') ans+= 100;
				if(a[i] == 'D') ans+= 500;
				if(a[i] == 'M') ans+= 1000;
				break;
			}
			// 遍历到第i个元素
			if(a[i] == 'I'){
				if(a[i+1] == 'V'){
					ans += 4;
					i++;
				}
				else if(a[i+1] == 'X'){
					ans += 9;
					i++;
				}
				else ans += 1;
			}
			else if (a[i] == 'X'){
				if(a[i+1] == 'L'){
					ans += 40;
					i++;
				}
				else if (a[i+1] == 'C'){
					i++;
					ans += 90;
				}
				else ans += 10;
			}
			else if(a[i] == 'C'){
				if(a[i+1] == 'D'){
					i++;
					ans+= 400;
				}
				else if (a[i+1] == 'M'){
					i++;
					ans+= 900;
				}
				else ans+= 100;
			}
			else if (a[i] == 'V') ans+= 5;
			else if (a[i] == 'L') ans+= 50;
			else if (a[i] == 'D') ans+= 500;
			else if (a[i] == 'M') ans+= 1000;
		}
		return ans;
	}

}