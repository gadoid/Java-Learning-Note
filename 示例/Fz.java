public class Fz {
    public class InnerClass {
        public int getSum(int x, int y) {
            return x + y;
        }
    }

    public static void main(String[] args) {
        InnerClass ti = new Fz().new InnerClass();
        int i = ti.getSum(2, 3);
        System.out.println(i);
    }
}