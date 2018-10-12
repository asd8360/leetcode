package leetcode;

public class S771 {
	public int numJewelsInStones(String J, String S) {

		char[] Jarray = J.toCharArray();
		char[] Sarray = S.toCharArray();
		int ans = 0;
		
		for(int i = 0;i<Jarray.length;i++) {
			for(int j = 0;j<Sarray.length-ans;j++) {
				if(Jarray[i] == Sarray[j]) {
					
					for(int j1=j;j1<Sarray.length-1-ans;j1++) {
						Sarray[j1] = Sarray[j1+1];
					}
					ans++;
					j--;
				}
			}
		}
		
		return ans;
	}
	
//	public static void main(String[] args) {
//		String j = "ASbq";
//		String s = "AAASXSSBbasq";
//		S771 test = new S771();
//		
//		System.out.println(test.numJewelsInStones(j, s));
//	}
}
