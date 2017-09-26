import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int num=1;
        int cube=1;
        JTextArea table = new JTextArea(15,2);

        Scanner input = new Scanner(System.in);
        while (num <=15)
        {
          table.append("Numbers");
            if (num <=15) {
                cube = num * num * num;
               System.out.print("The numbers are"+cube);
               cube =input.nextInt();
            }
        else {
                System.out.println("Error");
            }
            }


    }
}
