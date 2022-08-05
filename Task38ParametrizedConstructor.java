public class Task38ParametrizedConstructor {
    public static void main(String[] args) {
        C obj=new C(3);
    }

}
class A{
    public A(int x){
        System.out.println("class A constructor value:"+x);
        demo1();
    }
    public void demo1(){
        System.out.println("Class A method executed");
    }
}
class B extends A{
    public  B(int x){
        super(1);
        System.out.println("class B constructor value: "+x);
        demo2();
    }
    public void demo2(){
        System.out.println("Class B method executed");
    }

}
class C extends B{
    public C(int x){
        super(2);
        System.out.println("C class constructor value: "+x);
        demo3();
    }
    public void demo3(){
        System.out.println("Class C method executed");
    }
}