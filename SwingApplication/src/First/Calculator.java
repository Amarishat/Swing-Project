package First;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class Calculator {
	double n1,n2,n3,result;
	String op;
    String ans;
    
	private JFrame frame;
	private JTextField txtSimpleCalculator;
	private JTextField textField;
	private JTextField txtConverter;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setFont(new Font("Arial", Font.BOLD, 18));
		frame.setBounds(100, 100, 901, 327);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JButton btnNewButton = new JButton("<-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String b=null;
			if(textField.getText().length()>0)
			{
				StringBuilder str=new StringBuilder(textField.getText());
				str.deleteCharAt(textField.getText().length()-1);
				b=str.toString();
				textField.setText(b);
			}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(24, 99, 50, 21);
		frame.getContentPane().add(btnNewButton);
		
		final JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText() +	btnCe.getText();
				textField.setText(a);
			}
		});
		btnCe.setBounds(84, 99, 50, 21);
		frame.getContentPane().add(btnCe);
		
		final JButton btnNewButton_2 = new JButton("7");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String a=textField.getText()+ btnNewButton_2.getText();
			textField.setText(a);
			
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_2.setBounds(24, 130, 50, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		final JButton btnNewButton_3 = new JButton("8");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String a=textField.getText()+ btnNewButton_3.getText();
			textField.setText(a);
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_3.setBounds(84, 130, 50, 21);
		frame.getContentPane().add(btnNewButton_3);
		
		final JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText() +	btnNewButton_4.getText();
				textField.setText(a);
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_4.setBounds(24, 161, 50, 21);
		frame.getContentPane().add(btnNewButton_4);
		
		final JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText() + btnNewButton_5.getText();
				textField.setText(a);
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_5.setBounds(84, 161, 50, 21);
		frame.getContentPane().add(btnNewButton_5);
		
		final JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText() +	btnC.getText();
				textField.setText(null);
			}
		});
		btnC.setBounds(144, 99, 50, 21);
		frame.getContentPane().add(btnC);
		
		final JButton btnNewButton_7 = new JButton("9");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String a=textField.getText() +	btnNewButton_7.getText();
			textField.setText(a);
			}
		});
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_7.setBounds(144, 130, 50, 21);
		frame.getContentPane().add(btnNewButton_7);
		
		final JButton btnNewButton_8 = new JButton("6");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText() +	btnNewButton_8.getText();
				textField.setText(a);
			}
		});
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_8.setBounds(144, 161, 50, 21);
		frame.getContentPane().add(btnNewButton_8);
		
		final JButton btnNewButton_9 = new JButton("1");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText() +	btnNewButton_9.getText();
				textField.setText(a);
			}
		});
		btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_9.setBounds(24, 192, 50, 21);
		frame.getContentPane().add(btnNewButton_9);
		
		final JButton btnNewButton_10 = new JButton("2");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText() +	btnNewButton_10.getText();
				textField.setText(a);
			}
		});
		btnNewButton_10.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_10.setBounds(84, 192, 50, 21);
		frame.getContentPane().add(btnNewButton_10);
		
		final JButton btnNewButton_11 = new JButton("3");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText() +	btnNewButton_11.getText();
				textField.setText(a);
			}
		});
		btnNewButton_11.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_11.setBounds(144, 192, 50, 21);
		frame.getContentPane().add(btnNewButton_11);
		
		txtSimpleCalculator = new JTextField();
		txtSimpleCalculator.setBackground(Color.LIGHT_GRAY);
		txtSimpleCalculator.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtSimpleCalculator.setText(" Simple Calculator");
		txtSimpleCalculator.setBounds(291, 10, 151, 43);
		frame.getContentPane().add(txtSimpleCalculator);
		txtSimpleCalculator.setColumns(10);
		
		final JButton btnNewButton_12 = new JButton("0");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText() +	btnNewButton_12.getText();
				textField.setText(a);
			}
		});
		btnNewButton_12.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_12.setBounds(24, 218, 110, 21);
		frame.getContentPane().add(btnNewButton_12);
		
		final JButton btnNewButton_13 = new JButton(".");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText() +	btnNewButton_13.getText();
				textField.setText(a);
			}
		});
		btnNewButton_13.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_13.setBounds(144, 218, 50, 21);
		frame.getContentPane().add(btnNewButton_13);
		
		final JButton btnNewButton_14 = new JButton("+");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				n1=Double.parseDouble(textField.getText());
			    op="+";
			    textField.setText(null);
			}
		});
		btnNewButton_14.setBounds(206, 218, 50, 21);
		frame.getContentPane().add(btnNewButton_14);
		
		final JButton btnNewButton_15 = new JButton("-");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				n1=Double.parseDouble(textField.getText());
			    op="-";
			    textField.setText(null);
			}
		});
		btnNewButton_15.setBounds(206, 192, 50, 21);
		frame.getContentPane().add(btnNewButton_15);
		
		final JButton btnNewButton_16 = new JButton("*");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				n1=Double.parseDouble(textField.getText());
			    op="*";
			    textField.setText(null);
			}
		});
		btnNewButton_16.setBounds(206, 161, 50, 21);
		frame.getContentPane().add(btnNewButton_16);
		
		final JButton btnNewButton_17 = new JButton("/");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				n1=Double.parseDouble(textField.getText());
			    op="/";
			    textField.setText(null);
			}
		});
		btnNewButton_17.setBounds(206, 130, 50, 21);
		frame.getContentPane().add(btnNewButton_17);
		
		final JButton btnNewButton_18 = new JButton("+/-");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
			    op="+/-";
			    textField.setText(null);
			}
		});
		btnNewButton_18.setBounds(204, 99, 50, 21);
		frame.getContentPane().add(btnNewButton_18);
		
		final JButton btnNewButton_1 = new JButton("=");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				n2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
					result=n1+n2;
					String ans=String.format("%.2f",result);
					textField.setText(ans);
					
				}
			   if(op=="-")
				{
					result=n1-n2;
					String ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="*")
				{
					result=n1*n2;
					String ans=String.format("%.2f",result);
					textField.setText(ans);
				}
			   if(op=="/")
				{
					result=n1/n2;
					String ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="%")
				{
					result=n1%n2;
					String ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="x^y")
				{
					result=Math.pow(n2, n1);
					String ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				
				if(op=="sqrt")
				{
					result=Math.sqrt(n1);
					String ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				
				
				
			}
		});
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(268, 192, 50, 47);
		frame.getContentPane().add(btnNewButton_1);
		
		final JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
			    op="sqrt";
			    textField.setText(null);
			}
		});
		btnSqrt.setBounds(268, 99, 50, 21);
		frame.getContentPane().add(btnSqrt);
		
		final JButton btnNewButton_19 = new JButton("%");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
			    op="%";
			    textField.setText(null);
			}
		});
		btnNewButton_19.setBounds(268, 130, 50, 21);
		frame.getContentPane().add(btnNewButton_19);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
			    op="1/x";
			    textField.setText(null);
			}
		});
		btnx.setBounds(268, 161, 50, 21);
		frame.getContentPane().add(btnx);
		
		final JButton btnNewButton_6 = new JButton("L");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
			    op="L";
			    textField.setText(null);
			}
		});
		btnNewButton_6.setBounds(341, 99, 63, 21);
		frame.getContentPane().add(btnNewButton_6);
		
		final JButton btnNewButton_6_1 = new JButton("pi");
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
			    op="pi";
			    textField.setText(null);
				
				
			}
		});
		btnNewButton_6_1.setBounds(341, 130, 63, 21);
		frame.getContentPane().add(btnNewButton_6_1);
		
		final JButton btnNewButton_6_2 = new JButton("x^y");
		btnNewButton_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				n1=Double.parseDouble(textField.getText());
			    op="x^y";
			    textField.setText(null);
				
			}
		});
		btnNewButton_6_2.setBounds(341, 161, 63, 21);
		frame.getContentPane().add(btnNewButton_6_2);
		
		final JButton btnNewButton_6_3 = new JButton("x^2");
		btnNewButton_6_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				
				
				double a=Math.pow(n1,2);
				String b=String.format("%.2f",a);
				textField.setText(b);
				
				
			}
		});
		btnNewButton_6_3.setBounds(341, 192, 63, 21);
		frame.getContentPane().add(btnNewButton_6_3);
		
		final JButton btnNewButton_6_4 = new JButton("x^3");
		btnNewButton_6_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				
				double a=Math.pow(n1,3);
				String b=String.format("%.2f",a);
				textField.setText(b);
				
			}
		});
		btnNewButton_6_4.setBounds(341, 218, 63, 21);
		frame.getContentPane().add(btnNewButton_6_4);
		
		final JButton btnNewButton_6_5 = new JButton("Sin");
		btnNewButton_6_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			n1=Double.parseDouble(textField.getText());	
			double a=Math.sin(n1);
			String b=String.format("%.2f",a);
			textField.setText(b);
			
			}
		});
		btnNewButton_6_5.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_6_5.setBounds(414, 99, 63, 21);
		frame.getContentPane().add(btnNewButton_6_5);
		
		final JButton btnNewButton_6_6 = new JButton("Bin");
		btnNewButton_6_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int a=Integer.parseInt(textField.getText());
			textField.setText(Integer.toBinaryString(a));
				
			}
		});
		btnNewButton_6_6.setBounds(414, 218, 63, 21);
		frame.getContentPane().add(btnNewButton_6_6);
		
		final JButton btnNewButton_6_7 = new JButton("Cos");
		btnNewButton_6_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());	
				double a=Math.cos(n1);
				String b=String.format("%.2f",a);
				textField.setText(b);
			}
		});
		btnNewButton_6_7.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_6_7.setBounds(414, 130, 63, 21);
		frame.getContentPane().add(btnNewButton_6_7);
		
		final JButton btnNewButton_6_8 = new JButton("Tan");
		btnNewButton_6_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());	
				double a=Math.tan(n1);
				String b=String.format("%.2f",a);
				textField.setText(b);
			}
		});
		btnNewButton_6_8.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_6_8.setBounds(414, 161, 63, 21);
		frame.getContentPane().add(btnNewButton_6_8);
		
		JButton btnNewButton_6_9 = new JButton("Cbr");
		btnNewButton_6_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6_9.setBounds(414, 192, 63, 21);
		frame.getContentPane().add(btnNewButton_6_9);
		
		final JButton btnNewButton_6_10 = new JButton("Sinh");
		btnNewButton_6_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());	
				double a=Math.sinh(n1);
				String b=String.format("%.2f",a);
				textField.setText(b);
			}
		});
		btnNewButton_6_10.setBounds(487, 99, 63, 21);
		frame.getContentPane().add(btnNewButton_6_10);
		
		final JButton btnNewButton_6_11 = new JButton("Cosh");
		btnNewButton_6_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());	
				double a=Math.cosh(n1);
				String b=String.format("%.2f",a);
				textField.setText(b);
			}
		});
		btnNewButton_6_11.setBounds(487, 130, 63, 21);
		frame.getContentPane().add(btnNewButton_6_11);
		
		final JButton btnNewButton_6_12 = new JButton("Tanh");
		btnNewButton_6_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());	
				double a=Math.tanh(n1);
				String b=String.format("%.2f",a);
				textField.setText(b);
			}
		});
		btnNewButton_6_12.setBounds(487, 161, 63, 21);
		frame.getContentPane().add(btnNewButton_6_12);
		
		final JButton btnNewButton_6_13 = new JButton("Rund");
		btnNewButton_6_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			n1=Double.parseDouble(textField.getText());	
			n1=Math.round(n1);
			
			}
		});
		btnNewButton_6_13.setBounds(487, 192, 63, 21);
		frame.getContentPane().add(btnNewButton_6_13);
		
		final JButton btnNewButton_6_14 = new JButton("Hex");
		btnNewButton_6_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int a=Integer.parseInt(textField.getText());
			textField.setText(Integer.toHexString(a));
			}
		});
		btnNewButton_6_14.setBounds(487, 218, 63, 21);
		frame.getContentPane().add(btnNewButton_6_14);
		
		final JButton btnNewButton_6_15 = new JButton("Mod");
		btnNewButton_6_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText() +	btnNewButton_6_15.getText();
				textField.setText(a);
			}
		});
		btnNewButton_6_15.setBounds(560, 99, 63, 21);
		frame.getContentPane().add(btnNewButton_6_15);
		
		final JButton btnNewButton_6_16 = new JButton("Inx");
		btnNewButton_6_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText() +	btnNewButton_6_16.getText();
				textField.setText(a);
			}
		});
		btnNewButton_6_16.setBounds(560, 130, 63, 21);
		frame.getContentPane().add(btnNewButton_6_16);
		
		JButton btnNewButton_6_17 = new JButton("C");
		btnNewButton_6_17.setBounds(560, 161, 63, 21);
		frame.getContentPane().add(btnNewButton_6_17);
		
		final JButton btnNewButton_6_18 = new JButton("2pi");
		btnNewButton_6_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText() +	btnNewButton_6_18.getText();
				textField.setText(a);
			}
		});
		btnNewButton_6_18.setBounds(560, 192, 63, 21);
		frame.getContentPane().add(btnNewButton_6_18);
		
		final JButton btnNewButton_6_19 = new JButton("Oct");
		btnNewButton_6_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toOctalString(a));
				
			}
		});
		btnNewButton_6_19.setBounds(560, 218, 63, 21);
		frame.getContentPane().add(btnNewButton_6_19);
		
		JPanel panel = new JPanel();
		panel.setBounds(824, 108, -121, 74);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(652, 10, 225, 253);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"India", "Uk", "USA"}));
		comboBox.setBounds(55, 54, 127, 21);
		panel_1.add(comboBox);
		
		txtConverter = new JTextField();
		txtConverter.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtConverter.setText("       Converter");
		txtConverter.setBounds(45, 10, 154, 34);
		panel_1.add(txtConverter);
		txtConverter.setColumns(10);
		
		JButton btnNewButton_20 = new JButton("Converter");
		
		
		btnNewButton_20.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_20.addActionListener(new ActionListener() {
			double UK=1.2;
			double USA=5;
			
			public void actionPerformed(ActionEvent e) {
			double db=Double.parseDouble(textField_1.getText());
			
			if(comboBox.getSelectedItem().equals("India"));
			{
				String c=String.format("Rs. %.2f",db);
				textField_2.setText(c);
				
			}
			if(comboBox.getSelectedItem().equals("USA"));
			{
				String c=String.format("Dollar. %.2f",db*USA);
				textField_2.setText(c);
				
			}
			if(comboBox.getSelectedItem().equals("Uk"));
			{
				String c=String.format("Pounds. %.2f",db*UK);
				textField_2.setText(c);
				
			}
			
			}
		});
		btnNewButton_20.setBounds(10, 185, 85, 51);
		panel_1.add(btnNewButton_20);
		
		textField_1 = new JTextField();
		textField_1.setBounds(75, 97, 96, 51);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_21 = new JButton("Clear");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_21.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_21.setBounds(130, 185, 85, 51);
		panel_1.add(btnNewButton_21);
		
		textField_2 = new JTextField();
		textField_2.setBounds(75, 156, 96, 19);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(25, 20, 183, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
