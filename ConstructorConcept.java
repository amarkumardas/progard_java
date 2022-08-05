import java.util.Scanner;

public class ConstructorConcept {
    int arr[]=new int[5];

    public ConstructorConcept(int a,int b,int c,int d,int e){
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
        arr[4]=e;
    }
    public  ConstructorConcept(ConstructorConcept obj){
        arr[0]=obj.arr[0]* obj.arr[0];
        arr[1]=obj.arr[1]* obj.arr[1];
        arr[2]=obj.arr[2]* obj.arr[2];
        arr[3]=obj.arr[3]* obj.arr[3];
        arr[4]=obj.arr[4]* obj.arr[4];
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();

        ConstructorConcept obj1=new ConstructorConcept(a,b,c,d,e);
        ConstructorConcept obj2=new ConstructorConcept(obj1);
        System.out.println(obj2.arr[0]+" "+obj2.arr[1]+" "+obj2.arr[2]+" "+obj2.arr[3]+" "+obj2.arr[4]);
    }
}
