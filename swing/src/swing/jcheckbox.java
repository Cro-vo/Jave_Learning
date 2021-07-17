package swing;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class jcheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame("这是JF");
		jf.setBounds(100, 100, 600, 400);
		jf.setLayout(new BorderLayout());
		
		JPanel jp1 = new JPanel();
		TextArea ta = new TextArea();
		jp1.add(ta);
		jf.add(jp1,BorderLayout.NORTH);
		
		JPanel jp2 = new JPanel();
		JCheckBox jc1 = new JCheckBox("复选框一");
		JCheckBox jc2 = new JCheckBox("复选框二");
		JCheckBox jc3 = new JCheckBox("复选框三");
		jc1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (jc1.isSelected())
				{
					ta.append("复选框一被选中\n");
				}
//				System.out.println(ta.getText());
			}
		});
		jc2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (jc2.isSelected())
				{
					ta.append("复选框二被选中\n");
				}
			}
		});
		jc3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (jc3.isSelected())
				{
					ta.append("复选框三被选中\n");
				}
			}
		});

		
		jp2.add(jc1);
		jp2.add(jc2);
		jp2.add(jc3);
		
		
		jf.add(jp2,BorderLayout.SOUTH);
		
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

}
