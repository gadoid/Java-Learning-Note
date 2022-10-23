public class Person implements Cloneable {

    Head head;

    Person(Head head) {
        this.head = head;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p = new Person(new Head());
        Person p1 = (Person) p.clone();
        System.out.println("p == p1 " + (p == p1));
        System.out.println("p.head == p1.head " + (p.head == p1.head));
    }

}

class Head {
    String s;

    void set(String s1) {
        s = s1;
    }
}
