import java.util.Scanner;
import java.awt.Toolkit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Wapp {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message :");
        String message = sc.nextLine();
        System.out.println("How Many times to print : ");
        int size = sc.nextInt();


        //this 3 lines is nothing but the code for copy paste the message
        StringSelection ss= new StringSelection(message); // this code itself suggest that the code here justify here it is selecting or copying the text which we want to copy and paste it 
        Clipboard cb= Toolkit.getDefaultToolkit().getSystemClipboard();  // this code is justifying the copied message is saved to the clipboard
        cb.setContents(ss,null);  // now this code is justifying the copied text is set in clipboard where we have created the object of clipboard, now just import everything
        

        //it is just done to run the code after this seconds not immediatly after entering the details 
        // as we want to do this in other window like whatsapp will be open in other window so it will take time so we are making the code sleeping so it will get some time to execute
        Thread.sleep(2000); // just throw exception it will go error

        Robot robot = new Robot();  // here it will give error even after importing so in this case u have to throw an exception as seen above throws AWT exception is thrown

         //just to check u can open notepad and after running and typing the message in the console just go to notepad window it will print it in notepad
        //here it will print the data but it will just print for 1 time so we are adding the for loop to print n times
       for(int i=1; i<=size; i++)
       {
        robot.keyPress(KeyEvent.VK_CONTROL);  // here vk is virtual keyboard and control + v is printed to paste
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        //here on running it is printing the message the amount of time it is said but it is not sending so we have to make an automation for enter button that after every print it will wutomatically enter the send button so below is the code for that
         robot.keyPress(KeyEvent.VK_ENTER);
         robot.keyRelease(KeyEvent.VK_ENTER);

         // here just to have some time after one message we are adding some time to send other message
         Thread.sleep(1000);
       }

       //here we have used clipboard the reason is as soon as u open other window the clipboard of that window will be used so we can use it anywhere u need so as soon as u open notepad the clipboard is active and it starts printing there and the same goes with the whatsapp
}
}


// mow u can see the code is perfecly working and u can use it anywhere u need 
//reference from coding wallah 