package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;


public class jpanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		jf.setBounds(200,200,1000,800);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JButton jb1 = new JButton("按钮一");
		JButton jb2 = new JButton("按钮二");
		JLabel jl = new JLabel("这是标签",SwingConstants.LEFT);
		JPanel jp = new JPanel(new FlowLayout());
		
		jp.add(jb1);
		jp.add(jb2);
		jf.add(jp);
		jp.add(jl);
	}

}
