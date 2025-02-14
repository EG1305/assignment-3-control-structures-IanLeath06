import javax.swing.JOptionPane;

public class SpeedDetector {
	public static void main(String[] args) {
	String input;
	input = JOptionPane.showInputDialog("Please enter your speed");
	int speed = Integer.parseInt(input);	
	if (speed > 60) {
		JOptionPane.showMessageDialog(null, "Slow down! Drive safe.", "Ticket warning", JOptionPane.ERROR_MESSAGE);
	}
	JOptionPane.showMessageDialog(null, "Your speed is " + speed);
}
}
