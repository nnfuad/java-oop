class A // automatically extends Object class
{
    public A(){
        //super(); (It's present even if we dont call it)
        System.out.println("in A");
    }
    public A(int n){
        //super(); (It's present even if we dont call it)
        System.out.println("in A int");
    }
}
class B extends A // B extends A and A extends Object,thats a multilevel inheritance
{
    public B(){
        //super(); (It's present even if we dont call it)
        System.out.println("in B");
    }
    public B(String a){
        System.out.println("in B String");
    }
    public B(int n){
        //super(); (It's present even if we dont call it)
        //super(n);  calls int A then this is executed
        this();//calls current class default constructor,in default theres super so A is also called
        System.out.println("in B int");
    }
}
public class thissuper{
    public static void main(String[] args) {
        B obj = new B(1);
    }
}