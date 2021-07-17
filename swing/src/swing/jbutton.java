package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class jbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame("JFrame");
		jf.setVisible(true);
		jf.setBounds(200, 300, 500, 400);
		jf.setLayout(new FlowLayout());
		
		JButton jb = new JButton("按钮");
		jb.setBorderPainted(true);
		jb.setEnabled(true);
		
		JComboBox jcb = new JComboBox();
		jcb.addItem("---请选择学历---");
		jcb.addItem("高中");
		jcb.addItem("大学");
		jcb.addItem("研究生");
		
		jf.add(jcb);
		jf.add(jb);

		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
