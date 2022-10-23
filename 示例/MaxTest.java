import java.util.Scanner;

public class MaxTest {
    public static void main(String[] args) {
        System.out.println("请输入行数：");
        Scanner input = new Scanner(System.in);
        int line_number = input.nextInt();
        int[][] yh = new int[line_number][];
        for (int num = 0; num < line_number; num++) {
            yh[num] = new int[num + 1];
            for (int i = 0; i < yh[num].length; i++) {
                if (i == 0 | i == yh[num].length - 1) {
                    yh[num][i] = 1;
                } else {
                    yh[num][i] = yh[num - 1][i - 1] + yh[num - 1][i];
                }
            }
        }
        for (int i = 0; i < yh[i].length; i++) {
            for (int j = 0; j < (line_number - yh[i].length) / 2 + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(yh[i][j] + " ");
            }
            System.out.println("");
        }
        input.close();
    }
}
