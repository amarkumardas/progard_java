import java.util.Scanner;

public class Task25 {
    /*Write a Java program for bonus calculation. Accept basic salary from user.
    Calculate TA = 10%, DA= 15%, HRA = 20%, PF= 12% of basic salary. If basic >= 20,000
    then give 10% bonus otherwise give 20% bonus on basic salary.
     Calculate his gross (final) salary ( gross salary = Basic + DA + TA + HRA + Bonus – PF)
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your basic salary: ");
        float salary=sc.nextFloat();
        float bonus,grossSalary;
        if(salary >= 20000.0){
            bonus= 0.1f*salary;
        }else{
            bonus=0.2f*salary;
        }
        System.out.println("Your Bonus Rs. "+bonus);
        System.out.println("TA: "+0.1f*salary);
        System.out.println("DA: "+0.15f*salary);
        System.out.println("HRA: "+0.2f*salary);
        System.out.println("PF: "+0.12f*salary);
        grossSalary= (salary+0.15f*salary+0.1f*salary+0.2f*salary+bonus)-(0.12f*salary);
        System.out.println("Gross salary: "+grossSalary);
    }
}
