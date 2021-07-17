package swing;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class jdialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame("This is JFrame");
		jf.setBounds(400, 300, 200, 200);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JDialog jd = new JDialog(jf, "This is JDialog");
		jd.setBounds(400, 300, 100, 100);
		jd.setVisible(true);
		jd.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

}
