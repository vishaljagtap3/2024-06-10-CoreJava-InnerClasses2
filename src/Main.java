public class Main {
    public static void main(String[] args) {

        Outer o1 = new Outer(10);

        Outer.Inner in1 = new Outer.Inner(11);
        Outer.Inner in2 = new Outer.Inner(22);

        in1.display();
        in2.display();

    }
}
