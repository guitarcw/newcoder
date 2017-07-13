package newcoder;

public class Solution_9 {
	public int RectCover(int target) {
		if (target<2){
			return (int) Math.ceil(target/2);
		} else {
			return RectCover(target-1)+RectCover(target-2);

		}

    }
	public static void main(String[] args){
		
	}

}
