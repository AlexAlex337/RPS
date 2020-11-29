import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import rpsstring.rpsstring;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


	  
public class stringGUI extends JFrame {
	private JButton bIsPrefix = new JButton("������ 2 ������� 1-��?");
	private JButton bIsSuffix = new JButton("������ 2 ������� 1-��?");
	private JButton bIsSubstring = new JButton("������ 2 ���������� 1-��?");
	private JButton bIsSubsequence = new JButton("������ 2 ��������������������� 1-��?");
	
	
	private JTextField str1 = new JTextField(20);
	
	private JTextField str2 = new JTextField(20);
	private JLabel label1 = new JLabel("������� ������ ������:");
	private JLabel label2 = new JLabel("������� ������ ������:");
	
	
	public stringGUI() {
		super("������ ��� �����");
		this.setBounds(100,100,600,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(4,2,2,2));
		container.add(label1);
		container.add(str1);
		container.add(label2);
		container.add(str2);
		container.add(bIsPrefix);
		container.add(bIsSuffix);
		container.add(bIsSubstring);
		container.add(bIsSubsequence);
	
		str1.setDocument(new JTextFieldLimit(25));
		str2.setDocument(new JTextFieldLimit(25));
		bIsSuffix.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = str1.getText();
				String sub = str2.getText();

				boolean res = rpsstring.isSuffix(str, sub);
				if (res) {
					String message ="������ 2 �������� ��������� ������ 1\n";
					JOptionPane.showMessageDialog(null, message, "���������", JOptionPane.PLAIN_MESSAGE);	
				}
				
				else {
					String message ="������ 2 �� �������� ��������� ������ 1\n";
					JOptionPane.showMessageDialog(null, message, "���������", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});

		bIsPrefix.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = str1.getText();
				String sub = str2.getText();

				boolean res = rpsstring.isPrefix(str, sub);
				if (res) {
					String message ="������ 2 �������� ��������� ������ 1\n";
					JOptionPane.showMessageDialog(null, message, "���������", JOptionPane.PLAIN_MESSAGE);	
				}
				
				else {
					String message ="������ 2 �� �������� ��������� ������ 1\n";
					JOptionPane.showMessageDialog(null, message, "���������", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		
		bIsSubstring.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = str1.getText();
				String sub = str2.getText();

				boolean res = rpsstring.isSubstring(str, sub);
				if (res) {
					String message ="������ 2 �������� ���������� ������ 1\n";
					JOptionPane.showMessageDialog(null, message, "���������", JOptionPane.PLAIN_MESSAGE);	
				}
				
				else {
					String message ="������ 2 �� �������� ���������� ������ 1\n";
					JOptionPane.showMessageDialog(null, message, "���������", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		
		bIsSubsequence.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = str1.getText();
				String sub = str2.getText();
				int n = str.length();
				int m = sub.length();

				boolean res = rpsstring.isSubsequence(sub, str, m, n);
				if (res) {
					String message ="������ 2 �������� ����������������������� ������ 1\n";
					JOptionPane.showMessageDialog(null, message, "���������", JOptionPane.PLAIN_MESSAGE);	
				}
				
				else {
					String message ="������ 2 �� �������� ����������������������� ������ 1\n";
					JOptionPane.showMessageDialog(null, message, "���������", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		
	

		
	} 
}

 class JTextFieldLimit extends PlainDocument{
	  private int limit;

	  JTextFieldLimit(int limit) {
	   super();
	   this.limit = limit;
	   }

	  public void insertString( int offset, String  str, AttributeSet attr ) throws BadLocationException {
	    if (str == null) return;

	    if ((getLength() + str.length()) <= limit) {
	      super.insertString(offset, str, attr);
	    }
	  }
	}

		
		
		
	

	
	
	
	

