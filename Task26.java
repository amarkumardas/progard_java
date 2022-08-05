import java.util.Scanner;

public class Task26 {
    /*Task 26 :
Write a program to input electricity unit charge and calculate the total electricity bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill.*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter unit: ");
        float unit=sc.nextFloat();
        float charge;
        if(unit <=50){
            charge=unit*0.5f;
        } else if (unit <= 150) {
            charge=25+((unit-50)*0.75f);
        } else if (unit <= 250) {
            charge=25+75+((unit-150)*1.2f);
        }else {
            charge=25+75+120+((unit-250)*1.5f);
        }
        charge=charge+(0.2f*charge);
        System.out.println("Electricity bill Rs: "+charge);

    }
}
