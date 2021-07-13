/*5��*/
import java.util.*;

public class Depth {

	public static void main(String[] args) {
		// 0�� ��, 1�� ��
		int land = 0;
		int water = 1;

		// ������ array
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
		// �񱳴�� array
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
			
			// array�� ���� ���Ͽ� ��� ���� ������ while�� break;
			// �׷��� ������ compare�� depth�� ������ ġȯ
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
