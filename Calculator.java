package frame_;
import java.awt.*;
import java.awt.event.*;
public class Task extends Frame implements ActionListener
{
	Panel p,p1,p2;
	Label l,l1,l2;
	Button b[];
	TextField t,t1,t2;
	String B;
	Boolean a=true;
	double c;
	public static void main(String[] arr)
	{
		Task t=new Task();
		t.screen();
	}
	public void actionPerformed(ActionEvent e)
	{
		B=((Button)e.getSource()).getLabel();
		switch(B)
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
					t.setText(t.getText()+B);
				else
					t1.setText(t1.getText()+B);
				break;
			case "ENTER":
					a=!a;
				break;
			case "Reset":
				t.setText("");
				t1.setText("");
				t2.setText("");
				a=true;
				break;
			case "+":
				c=Double.parseDouble(t.getText())+Double.parseDouble(t1.getText());
				t2.setText(Double.toString(c));
				break;
			case "-":
				c=Double.parseDouble(t.getText())-Double.parseDouble(t1.getText());
				t2.setText(Double.toString(c));
				break;		
			case "*":
					c=Double.parseDouble(t.getText())*Double.parseDouble(t1.getText());
					t2.setText(Double.toString(c));
					break;
			case "/":
				int d=(int)(Double.parseDouble(t.getText())/Double.parseDouble(t1.getText()));
				t2.setText(Integer.toString(d));
				break;
			case "pow":
				c=Math.pow(Double.parseDouble(t.getText()),Double.parseDouble(t1.getText()));
				t2.setText(Double.toString(c));
				break;
			case "%":
				c=Double.parseDouble(t.getText())%Double.parseDouble(t1.getText());
				t2.setText(Double.toString(c));
				break;
			case "<=":
				if(a==true)
					t.setText(t.getText().substring(0,t.getText().length()-1));
				else
					t1.setText(t1.getText().substring(0,t1.getText().length()-1));
				
				
		}
		
	}
	public void screen() 
	{
		setBounds(50,50,300,400);
		setLayout(new BorderLayout());
		setVisible(true);
		
		
		p2=new Panel();
		p2.setBackground(Color.gray);
		add(p2,BorderLayout.CENTER);
		
		
		p=new Panel();
		p.setBounds(10,25,310,65);
		p.setBackground(Color.blue);
		p.setLayout(new GridLayout(3,1));
		p2.add(p);
		
		l=new Label("p:");
		p.add(l);
		t=new TextField(10);
		p.add(t);
		
		l1=new Label("q:");
		p.add(l1);
		t1=new TextField(10);
		p.add(t1);
		
		l2=new Label("ans:");
		p.add(l2);
		t2=new TextField(10);
		t2.setEditable(false);
		p.add(t2);
		
		p1=new Panel();
		p1.setBounds(10,90,310,435);
		p1.setLayout(new GridLayout(4,4));
		p2.add(p1);
		
		b=new Button[20];
		
		b[0]=new Button("1");
		b[0].addActionListener(this);
		p1.add(b[0]);
		
		b[1]=new Button("2");
		b[1].addActionListener(this);
		p1.add(b[1]);
		
		b[2]=new Button("3");
		b[2].addActionListener(this);
		p1.add(b[2]);
		
		b[3]=new Button("+");
		b[3].addActionListener(this);
		p1.add(b[3]);
		
		b[4]=new Button("-");
		b[4].addActionListener(this);
		p1.add(b[4]);
		
		b[5]=new Button("4");
		b[5].addActionListener(this);
		p1.add(b[5]);
		
		b[6]=new Button("5");
		b[6].addActionListener(this);
		p1.add(b[6]);
				
		b[7]=new Button("6");
		b[7].addActionListener(this);
		p1.add(b[7]);
		
		b[8]=new Button("*");
		b[8].addActionListener(this);
		p1.add(b[8]);
		
		b[9]=new Button("%");
		b[9].addActionListener(this);
		p1.add(b[9]);
		
		b[10]=new Button("7");
		b[10].addActionListener(this);
		p1.add(b[10]);
		
		b[11]=new Button("8");
		b[11].addActionListener(this);
		p1.add(b[11]);
		
		b[12]=new Button("9");
		b[12].addActionListener(this);
		p1.add(b[12]);
		
		b[13]=new Button("/");
		b[13].addActionListener(this);
		p1.add(b[13]);
		
		b[14]=new Button("pow");
		b[14].addActionListener(this);
		p1.add(b[14]);
		
		b[15]=new Button("Reset");
		b[15].addActionListener(this);
		p1.add(b[15]);
		
		b[16]=new Button("0");
		b[16].addActionListener(this);
		p1.add(b[16]);
		
		b[17]=new Button(".");
		b[17].addActionListener(this);
		p1.add(b[17]);
		
		b[18]=new Button("<=");
		b[18].addActionListener(this);
		p1.add(b[18]);
		
		b[19]=new Button("ENTER");
		b[19].addActionListener(this);
		p1.add(b[19]);
		
		WindowListener Wd=new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		addWindowListener(Wd);
			
	}
}
