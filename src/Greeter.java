import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	
	String answer = JOptionPane.showInputDialog("What is your super cool nickname?");
	JOptionPane.showMessageDialog(null, "Hello " + answer);
	JOptionPane.showMessageDialog(null, "Have a nice day");
    JOptionPane.showInputDialog("How's life");
	JOptionPane.showMessageDialog(null, "Why " + answer);
}
}
