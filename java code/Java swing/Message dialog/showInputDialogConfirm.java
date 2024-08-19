
import javax.swing.JOptionPane;

public class showInputDialogConfirm {
    public static void main(String[] args) {
        int check;

        JOptionPane.showMessageDialog(null,  "Do you want to check yourself " ,"Title",JOptionPane.INFORMATION_MESSAGE );

       String password = JOptionPane.showInputDialog(null ,"Enter your password" ,"password",JOptionPane.QUESTION_MESSAGE);

       if ("password".equals(password))
       {

        JOptionPane.showMessageDialog(null,"Your password is correct", "Message", 0);

        check=JOptionPane.YES_OPTION;


       }

       else
       {

        JOptionPane.showMessageDialog(null,"Your password is incorrect", "Message", 0);

        check = JOptionPane.NO_OPTION;


       }

      int choice = JOptionPane.showConfirmDialog(null,"If password correct say yes otherwise no" ,"Message " ,JOptionPane.YES_NO_OPTION );

      if(choice==check )
      {
         JOptionPane.showMessageDialog(null,"You told the  truth" ,"Message for you " ,0 );

      }

      else
      {

        JOptionPane.showMessageDialog(null,"You are a liar " ,"Message for you " ,0 );


      }

        
    }
    
}
