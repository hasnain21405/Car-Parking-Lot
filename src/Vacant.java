import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import java.awt.font.*;

public class Vacant implements ActionListener{

	JLabel l,carL,bikeL,busL,l1,l2,RateL,R1,R2,R3;
	JFrame f;
	JButton b1,b2,b3,record,cash;
	JTable jt;
	String TempUname,TempPass;
	
	Vacant(String TempUname,String TempPass,FTable t)
	{
		this.TempPass=TempPass;this.TempUname=TempUname;
		f=new JFrame("Menu");
		Image i=Toolkit.getDefaultToolkit().getImage("icon.png");
		f.setIconImage(i);
		
		l1=new JLabel("\"VACANT\"");
		l1.setBounds(180, 20, 150, 30);
		Font fn=new Font("Arial",Font.BOLD,20) ;
		l1.setForeground(Color.white);
		l1.setFont(fn);

		f.add(t.e1);
		f.add(t.e2);
		f.add(t.e3);
		f.add(t.e4);
		f.add(t.e5);
		f.add(t.e6);
		f.add(t.e7);
		f.add(t.e8);
		f.add(t.e9);
		f.add(t.e10);
		f.add(t.e11);
		f.add(t.e12);
		f.add(t.e13);
		f.add(t.e14);
		f.add(t.e15);
		f.add(t.lane1);
		f.add(t.lane2);
		f.add(t.lane3);
		f.add(t.lane4);
		f.add(t.lane5);
		
		l2=new JLabel("Vehicles:");
		l2.setBounds(55, 160, 100, 30);
		l2.setFont(new Font(null,Font.BOLD,16));
		l2.setForeground(Color.white);
		
		l=new JLabel("Ticket Rates:");
		l.setBounds(190,160,100,30);
		l.setFont(new Font(null,Font.BOLD,16));
		l.setForeground(Color.white);
		f.add(l);
		
		carL=new JLabel("Bike");
		carL.setBounds(55,195,100,20);
		carL.setFont(new Font(null,Font.PLAIN,14));
		carL.setForeground(Color.white);
		f.add(carL);
		
		bikeL=new JLabel("Car");
		bikeL.setBounds(55,215,100,20);
		bikeL.setFont(new Font(null,Font.PLAIN,14));
		bikeL.setForeground(Color.white);
		f.add(bikeL);
		
		busL=new JLabel("Bus");
		busL.setBounds(55,235,100,20);
		busL.setFont(new Font(null,Font.PLAIN,14));
		busL.setForeground(Color.white);
		f.add(busL);

		R1=new JLabel("100 Pkr");
		R1.setBounds(190,195,100,20);
		R1.setFont(new Font(null,Font.PLAIN,12));
		R1.setForeground(Color.white);
		f.add(R1);
		
		R2=new JLabel("200 Pkr");
		R2.setBounds(190,215,100,20);
		R2.setFont(new Font(null,Font.PLAIN,12));
		R2.setForeground(Color.white);
		f.add(R2);
		
		R3=new JLabel("300 Pkr");
		R3.setBounds(190,235,100,20);
		R3.setFont(new Font(null,Font.PLAIN,12));
		R3.setForeground(Color.white);
		f.add(R3); 
		
		b1=new JButton("Add Vehicle");
		b1.setBounds(25, 310, 125, 30);
		b1.setFocusable(false);
		b2=new JButton("Exit Vehicle");
		b2.setBounds(160, 310, 125, 30);
		b2.setFocusable(false);
		b3=new JButton("Back");
		b3.setBounds(295, 310, 125, 30);
		b3.setFocusable(false);
		
		cash=new JButton("Cash");
		cash.setBounds(295, 230, 125, 30);
		cash.setFocusable(false);
		f.add(cash);
		
		record=new JButton("Record");
		record.setBounds(295, 270, 125, 30);
		record.setFocusable(false);
		f.add(record);
		
		f.add(l1);
		f.add(l2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		record.addActionListener(this);
		cash.addActionListener(this);
		
		f.getContentPane().setBackground((new Color(0x2A3457)));
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(470, 400);
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{
		Data d=new Data();
		 
		if(e.getSource()==b1) 
		{
			f.dispose();
			new AddVehicle(d);
			
		}
		else if(e.getSource()==b2) 
		{
			f.dispose();
			new ExitVehicle(d);
	
		}	
		else if(e.getSource()==b3)
		{
			f.dispose();
			new DashBoard(TempUname, TempPass);

		}	
		else if(e.getSource()==record)
		{
			new Record(d,null);
		

		}
		else if(e.getSource()==cash)
		{
			
			new Cash(null,d);
		}
	}
}
