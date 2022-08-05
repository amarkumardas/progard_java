import java.util.Scanner;

public class Task40 {
    /*Task 40 : Write a java program that let the user choose his/her username and password. The program verifies whether the chosen username and password are valid. If either one of them is invalid, it notifies the user by raising exception and explain the cause of invalidity. The rules for choosing valid usernames and passwords are:
a. A username must be of length 6-15 characters.
b. A username must start with an uppercase English alphabet A to Z.
c. A password must not be shorter than 8 characters but must not exceed 256.
d. There cannot be any types of parentheses or whitespaces in a valid username or password.
e. A password cannot contain or be the same as its associated username*/
    public static void main(String[] args) {
        String userName="",userPass="";
        Scanner sc=new Scanner(System.in);
        int userArr[]=new int[3];
        System.out.println("\n\033[0;31m|-----------------------------------|\n" +
                                       "\033[0m| USERNAME AND PASSWORD VALIDATION  |\n"+
                                       "\033[0;31m|__________________________________ |");
        do {
            userArr=new int[3];
            System.out.println("\n\033[0;33m|-----------------------RULES FOR CREATING USERNAME------------------|\n" +
                                 "| 1.Username must be of length 6-15 characters.                      |\n" +
                                 "| 2.Username must start with an uppercase English alphabet A to Z.   |\n" +
                                 "| 3.There cannot be any types of parentheses or whitespaces.         |\n"+
                                 "|____________________________________________________________________|\n");
            System.out.println("\033[0mCreate Username: ");
            userName = sc.nextLine();

            if(!(userName.length() >=6 && userName.length() <=15)){
                System.out.println("\033[0;31mIt must be of length 6 to 15 characters. Your Username length is : "+userName.length());
                userArr[0]=1;
            }
            if(!(userName.charAt(0) >= 'A' && userName.charAt(0) <= 'Z')){
                System.out.println("\033[0;31mIt must start with Alphabet and should be in Capital letter");
                userArr[1]=1;
            }
           if(userName.contains("(") || userName.contains(" ")){
               System.out.println("\033[0;31mIt must not contain ( or ) or whitespace");
               userArr[2]=1;
           }
           if(sum(userArr)==0){
               System.out.println("Successfully Created Username: "+userName);
               break;
           }
        }while(true);
        while(true){
            userArr=new int[3];
            System.out.println("\n\033[0;33m|-------------------------RULES FOR CREATING PASSWORD-----------------------|\n" +
                                           "| 1.Password must not be shorter than 8 characters but must not exceed 256. |\n" +
                                           "| 2.Password cannot contain or be the same as its associated username       |\n" +
                                           "| 3.There cannot be any types of parentheses or whitespaces.                |\n"+
                                           "|___________________________________________________________________________|\n");
            System.out.println("\033[0mCreate Password: ");
            userPass = sc.nextLine();
            if(!(userPass.length() >=8 && userPass.length() <=256)){
                System.out.println("\033[0;31mPassword must not be shorter than 8 characters but must not exceed 256.Your Length: "+userPass.length());
                userArr[0]=1;
            }
            if(userPass.contains("(") || userPass.contains(" ")){
                System.out.println("\033[0;31mIt must not contain ( or ) or whitespace");
                userArr[1]=1;
            }
            if(userPass.matches(userName)){
                System.out.println("\033[0;31mPassword and Username cannot be same\nYour Password: "+userPass+"\nYour UserName: "+userName);
                userArr[2]=1;
            }
            if(sum(userArr)==0){
                System.out.println("Successfully Created Username: "+userName+" and "+" Password: "+userPass);
                break;
            }
        }
    }
    public static int sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}
