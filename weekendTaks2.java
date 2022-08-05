import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.exit;

public class weekendTaks2 {
    /*Weekend Task 2 : Create a NUMBER SYSTEM CONVERSION CALCULATOR.
      The weekend task is mandatory to all ... complete is in well and proper manner ..
       provide your 100% in it.... It is going to consider as one of your assessment .*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte choice=0;
        do {
                    System.out.println(Color.RESET + "\n\nb***********CONVERSION MENU************");
                    System.out.println("1.ENTER BINARY NUMBER\n2.ENTER DECIMAL NUMBER\n3.ENTER OCTAL NUMBER\n4.ENTER HEXADECIMAL NUMBER\n5.EXIT");
                    System.out.println("***********ENTER YOUR CHOICE FOR CONVERSION************");
                    choice = sc.nextByte();
            if(choice==1){
                Binary obj1=new Binary();
                obj1.toDecimal();
            } else if (choice==2) {
              Decimal obj=new Decimal();
              obj.toBinary();
            }else if (choice==3) {
               Octal obj=new Octal();
               obj.toBinary();
            }else if (choice==4) {
              Hexa obj=new Hexa();
              obj.toBinary();
            }else if (choice==5) {
              exit(0);
            }else
                System.out.println("Inavalid option");

        }while(true);

    }

}
class Binary{
    static long binary;
    public void toDecimal(){
        Scanner sc=new Scanner(System.in);
          do{
              int r=0,c=0,num;
                      long b=0;
              System.out.println("Enter Binary number: ");
              binary=sc.nextLong();
              b= binary;
              while(b>0)
              {
                  if((b %10==0)|| (b%10==1))
                      c++;
                  r++;
                  b=b/10;
              }
              if(c==r){
                  break;
              }else{
                  System.out.println("Not a binary number");
              }
          }while(true);

          long binarys=binary;
        long remainder;
        int decimalNumber = 0, i = 0;
        while (binarys != 0) {
            remainder = binarys % 10;
            binarys /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        System.out.println(Color.RESET+"*************RESULT***************");
        System.out.println(Color.YELLOW+"Binary to Decimal : "+decimalNumber);
        System.out.println("Binary to Octal : "+toOctal(binary));
        System.out.println("Binary to Hexadecimal : "+toHexaDecimal(decimalNumber));
    }
    public int toOctal(long binaryNumber){
        int octalNumber = 0, decimalNumber = 0, i = 0;

        while (binaryNumber != 0) {
            decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
            ++i;
            binaryNumber /= 10;
        }
        i = 1;
        while (decimalNumber != 0) {
            octalNumber += (decimalNumber % 8) * i;
            decimalNumber /= 8;
            i *= 10;
        }
        return octalNumber;
    }
    public String toHexaDecimal(long decimalNumber){
            char arr[] = { 'A', 'B', 'C', 'D', 'E', 'F' };
            int remainder, i = 0;
            String hexNumber = "";
            while (decimalNumber != 0) {
                remainder = (int)decimalNumber % 16;
                if (remainder >= 10)
                    hexNumber = arr[remainder - 10] + hexNumber;

                else
                    hexNumber = remainder + hexNumber;

                decimalNumber /= 16;
            }
            return hexNumber;
        }
}
class Decimal{
    static int decimal;
    public void toBinary(){
        Scanner sc=new Scanner(System.in);
       while(true) {
           try {
               System.out.println("Enter Decimal number: ");
                decimal=Integer.parseInt(sc.next());
               break;
           }catch(Exception e){
               System.out.println("It is not decimal number");
           }
       }
        System.out.println(Color.RESET+"*************RESULT***************");
        System.out.print(Color.YELLOW+"Decimal to Binary : ");
        int x=decimal;
        int binary[] = new int[40];
        int index = 0;
        while(x > 0){
            binary[index++] = x%2;
            x = x/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }

        System.out.println("\nDecimal to Octal : "+toOctal());
        System.out.print("Decimal to Hexadecimal : ");
        toHexaDecimal();
    }
    public int toOctal( ){
        int octalNumber = 0, i = 1;
         int x=decimal;
        while (x != 0)
        {
            octalNumber += (x % 8) * i;
            x /= 8;
            i *= 10;
        }
        return octalNumber;
    }
    public void toHexaDecimal(){
        int x=decimal;
        int[] hexNum = new int[100];


        int i = 0;
        while (x != 0) {

            hexNum[i] = x % 16;
            x = x / 16;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            if (hexNum[j] > 9)
                System.out.print((char)(55 + hexNum[j]));
            else
                System.out.print(hexNum[j]);
        }
    }
}
class Octal {
    static int octal;
    public void toBinary() {
        Scanner sc = new Scanner(System.in);
        boolean flag=false;
        int y=0,r=0;
        do{
            System.out.println("Enter Octal number: ");
            octal = sc.nextInt();
            y=octal;
            flag=false;
           while(y !=0){
               r=y%10;
               if(!(r <=7)){
                   flag=true;
               }
               y=y/10;
               if(flag){
                   System.out.println("It is not octal number");
                   break;
               }
           }
           if(!flag)
               break;

        }while(true);

        int x = octal;
        int i = 0;
        int decimalValue = 0;
        int binaryValue = 0;

        while (x != 0) {
            decimalValue += (x % 10) * Math.pow(8, i);
            ++i;
            x /= 10;
        }
        i = 1;
        while (decimalValue != 0) {
            binaryValue += (decimalValue % 2) * i;
            decimalValue /= 2;
            i *= 10;
        }
        System.out.println(Color.RESET+"*************RESULT***************");
            System.out.println(Color.YELLOW+"Octal to Binary : " + binaryValue);
            System.out.println("Octal to Decimal : " + toDecimal());
            Binary obj2=new Binary();
            System.out.print("Octal to Hexadecimal : "+obj2.toHexaDecimal(toDecimal()) );

        }
        public int toDecimal () {
            int x = octal;
            int decimalNumber = 0, i = 0;

            while(x != 0)
            {
                decimalNumber += (x % 10) * Math.pow(8, i);
                ++i;
                x/=10;
            }

            return decimalNumber;
        }

}
class Hexa {
    static String hexa;

    public void toBinary() {
        Scanner sc = new Scanner(System.in);

        boolean flag=true;
        do{
            System.out.println("Enter HexaDecimal number: ");
            hexa = sc.next();
            hexa=hexa.toUpperCase();
            flag=true;
            int n = hexa.length();
            for (int i = 0; i < n; i++) {
                char ch = hexa.charAt(i);
                if ((ch < '0' || ch > '9') && (ch < 'A' || ch > 'F')) {
                    flag=false;
                    break;
                }
            }
            if(flag){
                break;
            }else{
                System.out.println("It is not hexadecimal number");
            }

        }while(true);
        String x = hexa;
        String binary = "";
        x = x.toUpperCase();
        HashMap<Character, String> hashMap
                = new HashMap<Character, String>();
        hashMap.put('0', "0000");
        hashMap.put('1', "0001");
        hashMap.put('2', "0010");
        hashMap.put('3', "0011");
        hashMap.put('4', "0100");
        hashMap.put('5', "0101");
        hashMap.put('6', "0110");
        hashMap.put('7', "0111");
        hashMap.put('8', "1000");
        hashMap.put('9', "1001");
        hashMap.put('A', "1010");
        hashMap.put('B', "1011");
        hashMap.put('C', "1100");
        hashMap.put('D', "1101");
        hashMap.put('E', "1110");
        hashMap.put('F', "1111");
        int i;
        char ch;
        for (i = 0; i < x.length(); i++) {
            ch = x.charAt(i);
            if (hashMap.containsKey(ch))
                binary += hashMap.get(ch);
            else {
                binary = "Invalid Hexadecimal String";
            }
        }
        System.out.println(Color.RESET+"*************RESULT***************");
        System.out.println(Color.YELLOW+"Hexadecimal to Binary : " + binary);
        System.out.println("Hexadecimal to Decimal : " + toDecimal());
        System.out.println("Hexadecimal to Octal : "+ toOctal());

    }
    public int toDecimal () {
        String x = hexa;
        x = x.toUpperCase();
        int num = 0;
        String hstring = "0123456789ABCDEF";
        for (int i = 0; i < x.length(); i++)
        {
            char ch = x.charAt(i);
            int n = hstring.indexOf(ch);
            num = 16*num + n;
        }
        return num;
    }
    public String toOctal() {
        String x = hexa;

        int dec = 0;
        String hexa = x;
        int c = hexa.length() - 1;
        for(int i = 0; i < hexa.length() ; i ++ )
        {
            char ch = hexa.charAt(i);
            switch (ch)
            {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    dec = dec + Integer.parseInt(Character.toString(ch))*
                            (int)Math.pow(16,c);
                    c--;
                    break;
                case 'a':
                case 'A':
                    dec = dec + 10 * (int)Math.pow(16, c);
                    c--;
                    break;
                case 'b':
                case 'B':
                    dec = dec + 11 * (int)Math.pow(16, c);
                    c--;
                    break;
                case 'c':
                case 'C':
                    dec = dec + 12 * (int)Math.pow(16, c);
                    c--;
                    break;
                case 'd':
                case 'D':
                    dec = dec + 13 * (int)Math.pow(16, c);
                    c--;
                    break;
                case 'e':
                case 'E':
                    dec = dec + 14 * (int)Math.pow(16, c);
                    c--;
                    break;
                case 'f':
                case 'F':
                    dec = dec + 15 * (int)Math.pow(16, c);
                    c--;
                    break;
                default:
                    System.out.println("Invalid hexa input");
                    break;
            }
        }
        String oct ="";
        while(dec > 0)
        {
            oct = dec % 8 + oct;
            dec = dec / 8;
        }

        return oct;
    }
}
class Color{
    public static final String YELLOW="\033[0;33m";
    public static final String RESET="\033[0m";
}