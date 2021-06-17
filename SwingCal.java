import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class AD extends JFrame implements ActionListener
{
	JButton j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11,j12,j13,j14,j15,j16,j17;
	String temp1,temp2,symbol1,s1;
	JTextField t1;
	Container c;
	public  AD()
	{
		setSize(350,370);
		setLocation(200,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		c=getContentPane();
		
		t1 = new JTextField(16);
		Font font3 = new Font("Liberation Serif",Font.BOLD,10);
		Font font1 = new Font("Liberation Serif",Font.BOLD,25);
		t1.setFont(font1);
		Color color1 = new Color(236,155,164);
		t1.setBackground(color1);
		t1.setSize(250,40);
		t1.setLocation(50,20);
		c.add(t1);

		j1 = new JButton("1");
		j1.setSize(50,30);
		j1.setLocation(50,100);
		Color color2 = new Color(114,159,207);
		j1.setBackground(color2);
		Font font2 = new Font("Liberation Serif",Font.BOLD,20);
		j1.setFont(font2);
		c.add(j1);

		j2 = new JButton("2");
		j2.setSize(50,30);
		j2.setLocation(110,100);
		j2.setBackground(color2);
		j2.setFont(font2);
		c.add(j2);
			
		j3 = new JButton("3");
		j3.setSize(50,30);
		j3.setLocation(170,100);
		j3.setBackground(color2);
		j3.setFont(font2);
		c.add(j3);

		j4 = new JButton("4");
		j4.setSize(50,30);
		j4.setLocation(50,150);
		j4.setBackground(color2);
		j4.setFont(font2);
		c.add(j4);

		j5 = new JButton("5");
		j5.setSize(50,30);
		j5.setLocation(110,150);
		j5.setBackground(color2);
		j5.setFont(font2);
		c.add(j5);

		j6 = new JButton("6");
		j6.setSize(50,30);
		j6.setLocation(170,150);
		j6.setBackground(color2);
		j6.setFont(font2);
		c.add(j6);

		j7 = new JButton("7");
		j7.setSize(50,30);
		j7.setLocation(50,200);
		j7.setBackground(color2);
		j7.setFont(font2);
		c.add(j7);

		j8 = new JButton("8");
		j8.setSize(50,30);
		j8.setLocation(110,200);
		j8.setBackground(color2);
		j8.setFont(font2);
		c.add(j8);

		j9 = new JButton("9");
		j9.setSize(50,30);
		j9.setLocation(170,200);
		j9.setBackground(color2);
		j9.setFont(font2);
		c.add(j9);

		j10 = new JButton(".");
		j10.setSize(50,30);
		j10.setLocation(50,250);
		j10.setBackground(color2);
		j10.setFont(font2);
		c.add(j10);

		j11 = new JButton("0");
		j11.setSize(50,30);
		j11.setLocation(110,250);
		j11.setBackground(color2);
		j11.setFont(font2);
		c.add(j11);

		j12 = new JButton("=");
		Color color3 = new Color(187,25,119);
		j12.setSize(50,30);
		j12.setLocation(170,250);
		j12.setBackground(color3);
		j12.setFont(font2);
		c.add(j12);

		j13 = new JButton("+");
		Color color4 = new Color(187,227,61);
		j13.setSize(45,30);
		j13.setLocation(250,100);
		j13.setBackground(color4);
		j13.setFont(font3);
		c.add(j13);

		j14 = new JButton("-");
		j14.setSize(45,30);
		j14.setLocation(250,140);
		j14.setBackground(color4);
		j14.setFont(font2);
		c.add(j14);

		j15 = new JButton("*");
		j15.setSize(45,30);
		j15.setLocation(250,180);
		j15.setBackground(color4);
		j15.setFont(font2);
		c.add(j15);

		j16 = new JButton("/");
		j16.setSize(45,30);
		j16.setLocation(250,220);
		j16.setBackground(color4);
		j16.setFont(font2);
		c.add(j16);

		j17 = new JButton("%");
		
		j17.setSize(45,30);
		j17.setLocation(250,260);
		j17.setBackground(color4);
		j17.setFont(font3);
		c.add(j17);

		j1.addActionListener(this);
		j2.addActionListener(this);
		j3.addActionListener(this);
		j4.addActionListener(this);
		j5.addActionListener(this);
		j6.addActionListener(this);
		j7.addActionListener(this);
		j8.addActionListener(this);
		j9.addActionListener(this);
		j10.addActionListener(this);
		j11.addActionListener(this);
		j12.addActionListener(this);
		j13.addActionListener(this);
		j14.addActionListener(this);
		j15.addActionListener(this);
		j16.addActionListener(this);
		j17.addActionListener(this);


		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str = e.getActionCommand();
		if(str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4"))
		{
			s1 = t1.getText();
			t1.setText(s1+str);
		}
		else if(str.equals("5") || str.equals("6") || str.equals("7") || str.equals("8"))
		{
			s1 = t1.getText();
			t1.setText(s1+str);
		}
		else if(str.equals("9") || str.equals("0") || str.equals("."))
		{
			s1 = t1.getText();
			t1.setText(s1+str);
		}

		if(str.equals("+"))
		{
			temp1 =t1.getText();
			t1.setText("");
			symbol1 = str;
		}
		if(str.equals("-"))
		{
			temp1 = t1.getText();
			t1.setText("");
			symbol1 = str;
		}
		if(str.equals("*"))
		{
			temp1 = t1.getText();
			t1.setText("");
			symbol1 = str;
		}
		if(str.equals("/"))
		{
			temp1 = t1.getText();
			t1.setText("");
			symbol1 = str;
		}
		if(str.equals("%"))
		{
			temp1 = t1.getText();
			t1.setText("");
			symbol1 = str;
		}

		if(str.equals("="))
		{
			if(symbol1.equals("+"))
			{
				temp2 = t1.getText();
				int x = Integer.parseInt(temp1);
				int y = Integer.parseInt(temp2);
				int z = x+y;
				t1.setText(""+z);
			}
			if(symbol1.equals("-"))
			{
				temp2 = t1.getText();
				int x = Integer.parseInt(temp1);
				int y = Integer.parseInt(temp2);
				int z = x-y;
				t1.setText(""+z);
			}
			if(symbol1.equals("*"))
			{
				temp2 = t1.getText();
				int x = Integer.parseInt(temp1);
				int y = Integer.parseInt(temp2);
				int z = x*y;
				t1.setText(""+z);
			}
			if(symbol1.equals("/"))
			{
				temp2 = t1.getText();
				int x = Integer.parseInt(temp1);
				int y = Integer.parseInt(temp2);
				try
				{
				int z = x/y;
				t1.setText(""+z);
				}
				catch(Exception k){}
			}
			if(symbol1.equals("%"))
			{
				temp2 = t1.getText();
				int x = Integer.parseInt(temp1);
				int y = Integer.parseInt(temp2);
				try
				{
				int z = x%y;
				t1.setText(""+z);
				}
				catch(Exception k){}
			}
			
		}
	}
}
class SwingCal
{
	public static void main(String args[])
	{
		AD a = new AD();
	}
}

