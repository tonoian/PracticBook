package herbert_schildt.chapter_3;
// Продемонстрировать применение двухмерного массива
public class TweDArray {
    public static void main(String[] args) {
        int[][] tweD = new int [4] [5];
        int i, j, k = 0;

        for(i = 0; i < 4; i++)
            for(j = 0; j < 5; j++){
                tweD[i][j] = k;
                k++;
            }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++)
                System.out.print(tweD[i][j] + " ");
            System.out.println();
        }
    }
}
