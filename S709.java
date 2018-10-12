package leetcode;

public class S709 {
	public String toLowerCase(String str) {
		
		char[] arr = str.toCharArray();
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] >= 'A' & arr[i] <= 'Z')
				arr[i] += 32;
		}
		
		return arr.toString();
		
		
//		return str.toLowerCase();
	}
	
	public static void main(String[] args) {
		S709 test = new S709();
		String str = "HelloWorld";
		
		System.out.println(test.toLowerCase(str));
		
	}
	
}
