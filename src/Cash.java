import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Cash implements ActionListener
{
	JFrame f,info;
	JTextField t1,t2,t3,bp,bl,cp,cl,bsp,bsl,tb,tc,tbs;
	JLabel l,l1,l2,l3,lp,ll,lv,lb,lc,lbus,ltv;
	JButton back;
	String s;
	
	Cash(Vacant v,Data d)
	{
		f=new JFrame("Parking Lot");
		Image i=Toolkit.getDefaultToolkit().getImage("icon.png");
		f.setIconImage(i);
		
		l=new JLabel("\"Cash Details\"");
		l.setFont(new Font("", Font.PLAIN, 20));
		l.setBounds(135,20,150,25);
		l.setForeground(Color.white);
		f.add(l);
		
		lv=new JLabel("\"Vehicles\"");
		lv.setBounds(30,70,100,20);
		lv.setForeground(Color.white);
		f.add(lv);
		
		lp=new JLabel("\"Parked\"");
		lp.setBounds(130,70,100,20);
		lp.setForeground(Color.white);
		f.add(lp); 
		
		ll=new JLabel("\"Leaved\"");
		ll.setBounds(210,70,100,20);
		ll.setForeground(Color.white);
		f.add(ll); 
		
		lb=new JLabel("Bikes:");
		lb.setBounds(40,100,100,20);
		lb.setForeground(Color.white);
		f.add(lb);
		
		lc=new JLabel("Cars:");
		lc.setBounds(40,130,100,20);
		lc.setForeground(Color.white);
		f.add(lc);
		lbus=new JLabel("Buses:");
		lbus.setBounds(40,160,100,20);
		lbus.setForeground(Color.white);
		f.add(lbus);
		
		bp=new JTextField();
		bp.setBounds(140,100,35,20);
		s=String.valueOf(d.bparked);
		bp.setText(s);
		bp.setEditable(false);
		f.add(bp);
		
		cp=new JTextField();
		cp.setBounds(140,130,35,20);
		s=String.valueOf(d.cparked);
		cp.setText(s);
		cp.setEditable(false);
		f.add(cp);
		
		bsp=new JTextField();
		bsp.setBounds(140,160,35,20);
		s=String.valueOf(d.bsparked);
		bsp.setText(s);
		bsp.setEditable(false);
		f.add(bsp);
		
		bl=new JTextField();
		bl.setBounds(220,100,35,20);
		s=String.valueOf(d.bleaved);
		bl.setText(s);
		bl.setEditable(false);
		f.add(bl);
		
		cl=new JTextField();
		cl.setBounds(220,130,35,20);
		s=String.valueOf(d.cleaved);
		cl.setText(s);
		cl.setEditable(false);
		f.add(cl);
		
		bsl=new JTextField();
		bsl.setBounds(220,160,35,20);
		s=String.valueOf(d.bsleaved);
		bsl.setText(s);
		bsl.setEditable(false);
		f.add(bsl);
		
		ltv=new JLabel("\"Total\"");
		ltv.setBounds(295,70,100,20);
		ltv.setForeground(Color.white);
		f.add(ltv); 
		
		tb=new JTextField();
		tb.setBounds(300,100,35,20);
		s=String.valueOf(d.b);
		tb.setText(s);
		tb.setEditable(false);
		f.add(tb);
		
		tc=new JTextField();
		tc.setBounds(300,130,35,20);
		s=String.valueOf(d.c);
		tc.setText(s);
		tc.setEditable(false);
		f.add(tc);
		
		tbs=new JTextField();
		tbs.setBounds(300,160,35,20);
		s=String.valueOf(d.bs);
		tbs.setText(s);
		tbs.setEditable(false);
		f.add(tbs);
		////////////////////////////////////////
		
		l1=new JLabel("Cash Received:");
		l1.setBounds(50,220,150,20);
		l1.setForeground(Color.white);
		f.add(l1);
		t1=new JTextField();
		t1.setBounds(200,220,100,20);
		s=String.valueOf("Rs: "+d.cash_received+"/-");
		t1.setText(s);
		t1.setEditable(false);
		f.add(t1);
		
		l2=new JLabel("Cash Receivable:");
		l2.setBounds(50,250,150,20);
		l2.setForeground(Color.white);
		f.add(l2);
		t2=new JTextField();
		t2.setBounds(200,250,100,20);
		s=String.valueOf("Rs: "+d.cash_receivable+"/-");
		t2.setText(s);
		t2.setEditable(false);
		f.add(t2);
		
		l3=new JLabel("Total Amount:");
		l3.setBounds(150,290,150,20);
		l3.setForeground(Color.white);
		f.add(l3);
		t3=new JTextField();
		t3.setBounds(150,310,90,20);
		s=String.valueOf("Rs: "+d.tamount+"/-");
		t3.setText(s);
		t3.setEditable(false);
		f.add(t3);
		
		back=new JButton("Back");
		back.setBounds(300, 325, 80, 30);
		f.add(back);
		back.addActionListener(this);
	
		
		f.getContentPane().setBackground((new Color(0x2A3457)));
		f.setSize(400,400);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setVisible(true);	

	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==back)
		{
	
		Data d=new Data();
			FTable t =new FTable(null,d); 
			
			f.dispose();
			
		}
		
	}

}






