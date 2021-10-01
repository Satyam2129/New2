/*
Anonymous class
abstract
interface

if you don't know the defnition or the behaviour
then we will create abstract method

Object arr[5] = new Object[5];
arr[0] = new First();
arr[1] = new String("abc");


 */
//abstract class First{
//    abstract public void method1();
//}

//class Second extends First{
//
//    @Override
//    public void method1() {
//        System.out.println("Welcome");
//    }
//}
interface i1{
    void m1();
    default public void m5(){}
//    public void m2();
//    abstract void m3();
    // public abstract implicitly
    public static final int b = 80;
    //only public static final variables can be declared
}
public class Result {
//    default public void m4(){}
    public static void main(String[] args) {
        i1 obj = new i1() {
            @Override
            public void m1() {
                System.out.println("welcome to my java interface program");
            }
        };
        obj.m1();
//        Second obj = new Second();
//        obj.method1();
//        First obj = new First() {
//            @Override
//            public void method1() {
//                System.out.println("Welcome");
//            }
//        };
//        obj.method1();
    }
}
