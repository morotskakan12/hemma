import static javax.swing.JOptionPane.*;
	
	public class matte {
		
		public static void main (String[] arg) { 
		int x;
		int y = 0;
		int c =0;
		String indata;
		indata = showInputDialog("vilken multiplikaton");
		x = Integer.parseInt (indata);
			
			while(y<11){
				System.out.println( c );
				c = c+x;
				
				y= y+1;
				
				
			}
		}
	}