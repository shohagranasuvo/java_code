import javax.swing.JOptionPane;
import javax.swing.ImageIcon;



class MessageDialog1{

public static void main(String[] args)

{
	//JOptionPane.showMessageDialog(null,"Wrong password \n Shohag","Warning You",JOptionPane.ERROR_MESSAGE);
	//JOptionPane.showMessageDialog(null,"Wrong password \n Shohag","Warning You",JOptionPane.INFORMATION_MESSAGE);
	//JOptionPane.showMessageDialog(null,"Wrong password \n Shohag","Warning You",JOptionPane.PLAIN_MESSAGE);
	//JOptionPane.showMessageDialog(null,"Wrong password \n Shohag","Warning You",3);
	
	ImageIcon icon = new ImageIcon("Selected photo.jpeg");
	JOptionPane.showMessageDialog(null ,"It's 5 perameter" ," 5 perameter" ,JOptionPane.INFORMATION_MESSAGE,icon);
}
} 



