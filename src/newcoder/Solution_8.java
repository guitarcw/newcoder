package newcoder;
//ÌøÌ¨½×
public class Solution_8 {
	public int JumpFloor(int target) {
		int last=0;
		if (target<=1) {
			return 1;
			
		} else {
			while (target>0) {
				last=last+JumpFloor(--target);
			}
		}
		return last;
    }
	public static void main(String[] args){
		int input=4;
		Solution_8 sol=new Solution_8();
		System.out.println(sol.JumpFloor(input));
	}
}
