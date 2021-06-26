//package frame_;
import java.awt.*;

import java.awt.event.*;
public class Calculator extends Frame implements ActionListener
{
	Panel input_panel,main_Panel,button_panel;
	Label result,input_1,input_2;
	Button buttons[];
	TextField input_1_textBox,input_2_textBox,result_textBox;
	String source_button;
	Boolean a=true;
	double c;
	public static void main(String[] arr)
	{
		Calculator temp=new Calculator();
		temp.screen();
	}
	
	//Activates the calculator screen
	public void screen() 
	{
		setBounds(50,50,500,300);
		setLayout(new BorderLayout());
		setVisible(true);
		
		
		main_Panel = new Panel();
		main_Panel.setBackground(Color.gray);
		main_Panel.setLayout(new GridLayout(4,3));
		add(main_Panel,BorderLayout.CENTER);
		
		
		
		input_panel=new Panel();
		input_panel.setBounds(10,25,310,65);
		input_panel.setBackground(Color.blue);
		input_panel.setLayout(new GridLayout(3,1));
		main_Panel.add(input_panel);
		
		input_1=new Label("INPUT1:");
		input_panel.add(input_1);
		input_1_textBox=new TextField(10);
		input_1_textBox.requestFocus();
		input_panel.add(input_1_textBox);
		
		input_2=new Label("INPUT2:");
		input_panel.add(input_2);
		input_2_textBox=new TextField(10);
		input_panel.add(input_2_textBox);
		
		result=new Label("ans:");
		input_panel.add(result);
		result_textBox=new TextField(10);
		result_textBox.setEditable(false);
		input_panel.add(result_textBox);
		
		button_panel=new Panel();
		button_panel.setBounds(10,90,310,435);
		button_panel.setLayout(new GridLayout(4,4));
		main_Panel.add(button_panel);
		
		buttons =new Button[20];
		
		buttons[0]=new Button("1");
		buttons[0].addActionListener(this);
		button_panel.add(buttons[0]);
		
		buttons[1]=new Button("2");
		buttons[1].addActionListener(this);
		button_panel.add(buttons[1]);
		
		buttons[2]=new Button("3");
		buttons[2].addActionListener(this);
		button_panel.add(buttons[2]);
		
		buttons[3]=new Button("+");
		buttons[3].addActionListener(this);
		button_panel.add(buttons[3]);
		
		buttons[4]=new Button("-");
		buttons[4].addActionListener(this);
		button_panel.add(buttons[4]);
		
		buttons[5]=new Button("4");
		buttons[5].addActionListener(this);
		button_panel.add(buttons[5]);
		
		buttons[6]=new Button("5");
		buttons[6].addActionListener(this);
		button_panel.add(buttons[6]);
				
		buttons[7]=new Button("6");
		buttons[7].addActionListener(this);
		button_panel.add(buttons[7]);
		
		buttons[8]=new Button("*");
		buttons[8].addActionListener(this);
		button_panel.add(buttons[8]);
		
		buttons[9]=new Button("%");
		buttons[9].addActionListener(this);
		button_panel.add(buttons[9]);
		
		buttons[10]=new Button("7");
		buttons[10].addActionListener(this);
		button_panel.add(buttons[10]);
		
		buttons[11]=new Button("8");
		buttons[11].addActionListener(this);
		button_panel.add(buttons[11]);
		
		buttons[12]=new Button("9");
		buttons[12].addActionListener(this);
		button_panel.add(buttons[12]);
		
		buttons[13]=new Button("/");
		buttons[13].addActionListener(this);
		button_panel.add(buttons[13]);
		
		buttons[14]=new Button("pow");
		buttons[14].addActionListener(this);
		button_panel.add(buttons[14]);
		
		buttons[15]=new Button("Reset");
		buttons[15].addActionListener(this);
		button_panel.add(buttons[15]);
		
		buttons[16]=new Button("0");
		buttons[16].addActionListener(this);
		button_panel.add(buttons[16]);
		
		buttons[17]=new Button(".");
		buttons[17].addActionListener(this);
		button_panel.add(buttons[17]);
		
		buttons[18]=new Button("DEL");
		buttons[18].addActionListener(this);
		button_panel.add(buttons[18]);
		
		buttons[19]=new Button("ENTER");
		buttons[19].addActionListener(this);
		button_panel.add(buttons[19]);
		
		WindowListener Wd=new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		
		addWindowListener(Wd);
			
	}
	
	public void actionPerformed(ActionEvent e)
	{
		source_button=((Button)e.getSource()).getLabel();
		switch(source_button)
		{
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
			case "0":
			case ".":
				if(a==true)
					input_1_textBox.setText(input_1_textBox.getText()+source_button);
				else
					input_2_textBox.setText(input_2_textBox.getText()+source_button);
				break;
			case "ENTER":
					a=!a;
					if(a==true)
						input_1_textBox.requestFocus();
					else
						input_2_textBox.requestFocus();
				break;
			case "Reset":
				input_1_textBox.setText("");
				input_2_textBox.setText("");
				result_textBox.setText("");
				a=true;
				input_1_textBox.requestFocus();
				break;
			case "+":
				try {
					c=Double.parseDouble(input_1_textBox.getText())+Double.parseDouble(input_2_textBox.getText());
					result_textBox.setText(Double.toString(c));
				}
				catch(Exception exc)
				{
					result_textBox.setText("NULL");
				}
				break;
			case "-":
				try {
					c=Double.parseDouble(input_1_textBox.getText())-Double.parseDouble(input_2_textBox.getText());
					result_textBox.setText(Double.toString(c));
				}
				catch(Exception exc)
				{
					result_textBox.setText("NULL");
				}
				break;		
			case "*":
				try {
					c=Double.parseDouble(input_1_textBox.getText())*Double.parseDouble(input_2_textBox.getText());
					result_textBox.setText(Double.toString(c));
				}
				catch(Exception exc)
				{
					result_textBox.setText("NULL");
				}
					break;
			case "/":
				try {
					int ress=(int)(Double.parseDouble(input_1_textBox.getText())/Double.parseDouble(input_2_textBox.getText()));
					result_textBox.setText(Integer.toString(ress));
				}
				catch(Exception exc)
				{
					result_textBox.setText("NULL");
				}
				break;
			case "pow":
				try {
					c=Math.pow(Double.parseDouble(input_1_textBox.getText()),Double.parseDouble(input_2_textBox.getText()));
					result_textBox.setText(Double.toString(c));
				}
				catch(Exception exc)
				{
					result_textBox.setText("NULL");
				}
				break;
			case "%":
				try {
					c=Double.parseDouble(input_1_textBox.getText())%Double.parseDouble(input_2_textBox.getText());
					result_textBox.setText(Double.toString(c));
				}
				catch(Exception exc)
				{
					result_textBox.setText("NULL");
				}
				break;
			case "DEL":
				if(a==true)
					input_1_textBox.setText(input_1_textBox.getText().substring(0,input_1_textBox.getText().length()-1));
				else
					input_2_textBox.setText(input_2_textBox.getText().substring(0,input_2_textBox.getText().length()-1));
				
		}
		
	}
}
