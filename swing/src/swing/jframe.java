package swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class jframe extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame("My first Frame");
		Container container = jf.getContentPane();
//		container.add();
		jf.add(new JButton("按钮"));
		jf.setVisible(true);
		jf.setSize(200, 300);
		jf.setDefaultCloseOperation(3);
		jf.setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
		
	}

}
