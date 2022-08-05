import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task43 {
   //Task 43 : Accept a string, replace all vowels from the given string with # symbol and store updated string to file, using file handling.
   public static void main(String[] args) throws IOException {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter string: ");
       String str=sc.nextLine();
       char[]sb=str.toCharArray();
        for(int i=0;i<sb.length;i++){
           if(sb[i]=='a' || sb[i]=='e'  || sb[i]=='i' || sb[i]=='o' || sb[i]=='u'
                   || sb[i]=='A' || sb[i]=='E' || sb[i]=='I' || sb[i]=='O' || sb[i]=='U'){
               sb[i]='#';
           }
       }

       FileWriter fw=new FileWriter("K:\\filehandling.txt",true);
        fw.write(sb);
        fw.close();

       System.out.println("Successfully done");

   }
}
