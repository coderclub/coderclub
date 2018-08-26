package enumeration;

public class OuterClass {

    InnerClassA innerA = new InnerClassA();

    public void OuterMethodA (){
        System.out.println("Method 2 from OuterClassA");
        innerA.InnerMethodA();
    }
    public void OuterMethodB () {
System.out.println("Method 2 from OuterClassA");
innerA.InnerMethodA();
    }

    public class InnerClassA {
        public void InnerMethodA(){
            System.out.println("Method 1 from InnerClassB");
        }
    }
    public static class InnerClassB {
        public void InnerMethodB(){
            System.out.println("Method from InnerClassB");
        }
        public static  void InnerMethodBB(){
System.out.println("Method 2 from static InnerClassB");
        }
    }


}






