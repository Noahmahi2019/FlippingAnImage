import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] nums = {{1, 1,0}, {1, 0, 5}, {0, 0, 0}};
        int[][] numbers ={{1, 2,3}, {5, 6, 7}, {7, 8, 8}};
        System.out.println(Arrays.deepToString(flipImage(nums)));
        System.out.println(Arrays.deepToString(flipImage(numbers)));
    }
    public static int[][] flipImage(int[][] num) {
        for (int i = 0; i < num.length; i++) {
            int j = 0;
            int k = num[i].length - 1;
            while (j < k) {
                int temp = num[i][j];
                num[i][j++] = num[i][k];
                num[i][k--] = temp;
            }
        }
        return num;
    }
}
