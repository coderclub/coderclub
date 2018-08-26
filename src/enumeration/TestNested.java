package enumeration;

public class TestNested {
    public static void main(String[] args) {

        OuterClass.InnerClassB.InnerMethodBB();
        OuterClass outerClass = new OuterClass();
        outerClass.innerA.InnerMethodA();
        OuterClass.InnerClassB.InnerMethodBB();

    }
}
