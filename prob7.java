
class Solution {
		static int y;
		public int reverse(int x) {
			int z;
//			int i = 1;
			int w = String.valueOf(x).length();			
			while(w > 0 ) {				
				z = x % 10;				
				y = y+ z*(int) Math.pow(10, w-1);	
				x = x/10;
// w				++i; 
				--w;
			}			
			return y;
		}

		public static void main(String[] args) {
			Solution sl = new Solution();		
			System.out.print(sl.reverse(21));
		}

}
