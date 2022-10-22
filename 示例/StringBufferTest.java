import java.util.Scanner;

public class StringBufferTest {
    public static void main(String[] args) {
        System.out.println("请输入内容");
        Scanner input = new Scanner(System.in);
        String sc = input.next();
        StringBuffer file = new StringBuffer(sc);
        int index = file.lastIndexOf(".");
        int errIndex1 = file.lastIndexOf(".");
        int errIndex2 = file.lastIndexOf("。")
        if(index != -1 && file.substring(index+1, file.length()).equals("java")){
            System.out.println("OK")
        }else if()
    }
}
