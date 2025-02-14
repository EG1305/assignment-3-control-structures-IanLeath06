import javax.swing.JOptionPane;

public class SpeedDetector2 {
	public static void main(String[] args) {
	String input;
	input = JOptionPane.showInputDialog("Please enter your speed");
	int speed = Integer.parseInt(input);	
	JOptionPane.showMessageDialog(null, "Your speed is " + speed);
	if (speed > 60) {
		JOptionPane.showMessageDialog(null, "Slow down! Drive safe.", "Ticket warning", JOptionPane.ERROR_MESSAGE);
	}
	else {
		JOptionPane.showMessageDialog(null, "Congratulations! You are a safe driver.");
	}
}
}
