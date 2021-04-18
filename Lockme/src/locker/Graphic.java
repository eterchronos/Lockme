package locker;

import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Graphic  extends Password implements ActionListener {

	private JFrame window  	 	  		   = new JFrame();
	private JTextArea passField  		   = new JTextArea();
	private JButton bGen  		 		   = new JButton("Gerar");
	private JLabel labelInfo1	   		   = new JLabel();
	private JTextField inputLength 		   = new JTextField();
	private String myPass;
	private JCheckBox option1			   = new JCheckBox();
	private JCheckBox option2			   = new JCheckBox();
	private JCheckBox option3			   = new JCheckBox();
	private JCheckBox option4			   = new JCheckBox();
	private JScrollPane scroll			   = new JScrollPane();

	
	private Font labels = new Font("Courier New",Font.BOLD,14);
	
	
	public Graphic () {
		
		
		
	
		
		//app is running like this by default
		inputLength.setText("10");
		option1.setSelected(true);
		setOption(1);
		
		//add content
		window.add(scroll);
		window.add(bGen);
		//window.add(passField);
		window.add(labelInfo1);
		window.add(inputLength);
		window.add(option1);
		window.add(option2);
		window.add(option3);
		window.add(option4);
		window.setLayout(null);
		//Positions	
		bGen.setBounds(80,129,80,20);
		labelInfo1.setBounds(0,0,250,30);
		passField.setBounds(0,160,250,60);
		scroll.setBounds(0,160,250,60);
		inputLength.setBounds(0,35,250,30);
		option1.setBounds(0,70,125,20);
		option2.setBounds(125,70,125,20);
		option3.setBounds(0,100,125,20);
		option4.setBounds(125,100,125,20);
		
		
		//Texts
		labelInfo1.setText("Qual O Tamanho Da Sua Senha?");
		option1.setText("123");
		option2.setText("Abc");
		option3.setText("1A3b");
		option4.setText("#a2A");
		
		//listener
		bGen.addActionListener(this);
		option1.addActionListener(this);
		option2.addActionListener(this);
		option3.addActionListener(this);
		option4.addActionListener(this);
		
		
		//fonts
		bGen.setFont(labels);
		option1.setFont(labels);
		option2.setFont(labels);
		option3.setFont(labels);
		option4.setFont(labels);
		labelInfo1.setFont(labels);
		passField.setFont(labels);
		
		//others
		scroll.setViewportView(passField);
		passField.setLineWrap(true);
		window.setTitle("Lockme");	
		window.setSize(250,260);
		window.setVisible(true);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource() == option1) {
			setOption(1);
			option2.setSelected(false);
			option3.setSelected(false);
			option4.setSelected(false);
			 System.out.println(getOption());
		}else if(arg0.getSource() == option2) {
			setOption(2);
			option1.setSelected(false);
			option3.setSelected(false);
			option4.setSelected(false);
			 System.out.println(getOption());
		}else if(arg0.getSource() == option3) {
			setOption(3);
			option1.setSelected(false);
			option2.setSelected(false);
			option4.setSelected(false);
			 System.out.println(getOption());
		}else if(arg0.getSource() == option4) {
			setOption(4);
			option1.setSelected(false);
			option2.setSelected(false);
			option3.setSelected(false);
			 System.out.println(getOption());
		}else if (arg0.getSource() == bGen) {
			
			if(inputLength.getText().isEmpty() || inputLength.getText().equals("0")) {
				JOptionPane.showMessageDialog(window,
						"Vish... \n Não pode ser 0. \n Quantidade Não Pode Ser Vazio. "
						+ " \n Recomenda-se por segurança no mínimo 8 dígitos."
						);
			}else {
			setPassword(Integer.parseInt(inputLength.getText()));
			this.myPass = String.valueOf(getPassword());
			passField.setText(this.myPass);
			}
		}
			
		
		
	}
	
}
