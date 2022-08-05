import java.util.Scanner;

public class Overloading {
    void area(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
    void area(int base ,int height){
        System.out.println("the area of the triangle is "+(float)(base*height)/2+" sq units");
    }
    public static void main(String[] args) {
        Overloading ob = new Overloading();
        int choice=0;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("1.Find area of square.\n2.Find area of rectangle.\n3.Find area of circle.\n4.Find area of triangle");
            choice=sc.nextInt();
            if(choice==1){
                System.out.println("Enter side of square");
                ob.area(sc.nextFloat());
            }
            else if(choice==2){
                System.out.println("Enter side of rectangle");
                System.out.println("Enter length of rectangle");
                float length=sc.nextFloat();
                System.out.println("Enter breath of rectangle");
                float breath=sc.nextFloat();
                ob.area(length,breath);
            }
            else if(choice==3){
                System.out.println("Enter radius of circle");
                ob.area(sc.nextDouble());
            }
           else if(choice==4){
                System.out.println("Enter base of triangle");
                int base=sc.nextInt();
                System.out.println("Enter height of triangle");
                int height=sc.nextInt();
                ob.area(base,height);
            }else {
                System.out.println("Wrong choice");
            }
        }while(choice <= 4);

    }
}
