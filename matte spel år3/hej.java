import static javax.swing.JOptionPane.*;
import java.util.Random;
	public class hej {
		public static void main (String[] arg) {
		Random rand = new Random();
			int n = rand.nextInt(50)+1;
			showMessageDialog (null,n);
		}
	}