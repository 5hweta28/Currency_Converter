import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;

public class CC extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JComboBox comboBox;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;

	public static void main (String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CC frame = new CC();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(341, 108, 203, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		String [] choices = {"", "Rupee to Dollar", "Rupee to Pound","Dollar to Rupee","Dollar to Pound","Pound to Rupee","Pound to Dollar"};
		comboBox = new JComboBox(choices);
		comboBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		comboBox.setBounds(341, 198, 296, 45);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("CURRENCY CONVERTER");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(170, 27, 379, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the Number to convert :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(26, 105, 350, 37);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2.setBounds(257, 293, 203, 57);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Result : ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3.setBounds(86, 306, 121, 31);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Conversion From - To :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setBounds(26, 202, 239, 41);
		contentPane.add(lblNewLabel_4);
		
		comboBox.addActionListener(this);
		
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String text = textField.getText();
		double x=Double.parseDouble(text);
		if(e.getSource()==comboBox) {
			String selected = comboBox.getSelectedItem().toString();
			
			if(selected.equalsIgnoreCase("Rupee to Dollar")) {
				x=x*0.012;
				String s=Double.toString(x);
				lblNewLabel_2.setText(s);
				
			}
			
			else if(selected.equalsIgnoreCase("Rupee to Pound")){
				x=x*0.0098;
				String s=Double.toString(x);
				lblNewLabel_2.setText(s);
				
			}
			else if(selected.equalsIgnoreCase("Dollar to Rupee")){
				x=x*82.05;
				String s=Double.toString(x);
				lblNewLabel_2.setText(s);
				
			}
			else if(selected.equalsIgnoreCase("Dollar to Pound")){
				x=x*0.8041;
				String s=Double.toString(x);
				lblNewLabel_2.setText(s);
				
			}
			else if(selected.equalsIgnoreCase("Pound to Rupee")){
				x=x*102.11;
				String s=Double.toString(x);
				lblNewLabel_2.setText(s);
				
			}
			else if(selected.equalsIgnoreCase("Pound to Dollar")){
				x=x*1.24;
				String s=Double.toString(x);
				lblNewLabel_2.setText(s);
				
			}
		}
	}
}

