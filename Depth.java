/*5번*/
import java.util.*;

public class Depth {

	public static void main(String[] args) {
		// 0은 땅, 1은 물
		int land = 0;
		int water = 1;

		// 원래의 array
		int [][] depth = {
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,1,0,0,0,0,0},
				{0,0,0,1,1,1,0,0,0,0},
				{0,1,1,1,1,1,1,0,0,0},
				{0,1,1,1,1,1,1,1,1,0},
				{0,1,1,1,1,1,1,1,1,0},
				{0,0,1,1,1,1,1,1,0,0},
				{0,0,0,1,1,1,1,0,0,0},
				{0,0,0,0,1,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}
				};
		// 비교대상 array
		int [][] compare = new int[10][10];
		
		while(true){
			for(int i = 0; i < depth.length; i++){
				for(int j = 0; j < depth.length; j++) {
					if(depth[i][j] >= water) {
						if(depth[i-1][j] >= depth[i][j] && depth[i+1][j] >= depth[i][j] && depth[i][j-1] >= depth[i][j] && depth[i][j+1] >= depth[i][j]) {
							depth[i][j] += 1;
						}
						else {
							depth[i][j] = depth[i][j];
						}
					}
					System.out.print(depth[i][j]);
				}
				System.out.println();
			}
			water++;
			
			// array의 값을 비교하여 모든 값이 같으면 while을 break;
			// 그렇지 않으면 compare을 depth의 값으로 치환
			if(Arrays.deepEquals(depth, compare)) {
				break;
			}
			else {
				for(int x = 0; x < depth.length; x++) {
					for(int y = 0; y < depth.length; y++) {
						compare[x][y] = depth[x][y];
					}
				}
			}
		}
	}
}
