import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        System.out.println("input");
        int sc = score.nextInt();
        switch (sc) {
            case 90:
                System.out.println("1");
                break;
            case 80:
                System.out.println("2");
                break;
            case 70:
                System.out.println("3");
                break;
            default:
                System.out.println("4");
        }
        score.close();
    }
}
