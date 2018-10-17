import java.awt.*;
import javax.swing.*;
	public class LayoutDemo extends JFrame {
		private JLabel t1 = new JLabel();
		private	JButton b1 =  new JButton("+");
		private JButton b2 = new JButton("-");
		private JButton b3 = new JButton("*");
		private JButton b4 = new JButton("/");
		
		public LayoutDemo (){
			p5.setBackgrond(color.white);
			p5.setPreferredSixe(new Dimension(75,75));
			setLayaout(new FlowLayout());
			add(b1); add(b2); add(b3); add(b4); add(t1);
			pack();
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE;
		}
		public static void main (string[] arg) {
			LayoutDemo Y = new LayoutDemo();
	}
	}
			
		