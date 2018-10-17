import java.awt.*;
import javax.swing.*;
	public class LayoutDemo extends JFrame {
		private JLabel t1 = new JLabel("hej alla");
		private	JButton b1 =  new JButton("+");
		private JButton b2 = new JButton("-");
		private JButton b3 = new JButton("*");
		private JButton b4 = new JButton("/");
		private JPanel p5 = new JPanel ();
		
		public LayoutDemo (){
			p5.setBackground(Color.white);
			p5.setPreferredSize(new Dimension(300,300));
			setLayout(new FlowLayout());
			add(b1); add(b2); add(b3); add(b4); add(t1, BorderLayout.NORTH);
			pack();
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		public static void main (String[] arg) {
			LayoutDemo y = new LayoutDemo();
	}
	}
			
		