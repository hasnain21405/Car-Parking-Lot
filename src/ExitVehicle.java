import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;
public class ExitVehicle
{
	JLabel Ldate,Lslot,LCname,LTvehicle,LCmname,Lplate,Success;
	JTextField tf1,tf2,tf3,tf4,tf5;
	JButton Bfind,BExit,Back,Ba;
	JFrame f;
	ExitVehicle(Data d)
	{
		f=new JFrame("Exit Vehicle");
		Image i=Toolkit.getDefaultToolkit().getImage("icon.png");
		f.setIconImage(i);
		
		Ldate=new JLabel("\"Enter Details of Vehicle\"");
		Ldate.setBounds(90, 20, 200, 20);
		Ldate.setForeground(Color.white);
		Ldate.setFont(new Font(null,Font.BOLD,16));
		f.add(Ldate);
		
		Lslot=new JLabel("Slot No: ");
		Lslot.setBounds(30, 60, 100, 20);
		Lslot.setForeground(Color.white);
		f.add(Lslot);
		tf1=new JTextField();
		tf1.setBounds(140, 60, 40, 20);
		f.add(tf1);
		
		LCname=new JLabel("Customer Name: ");
		LCname.setBounds(30, 90, 120, 20);
		LCname.setForeground(Color.white);
		f.add(LCname);
		tf2=new JTextField();
		tf2.setBounds(140, 90, 150, 20);
		tf2.setEditable(false);
		f.add(tf2);
		LTvehicle=new JLabel("Vehicle Type:");
		LTvehicle.setBounds(30, 120, 150, 20);
		LTvehicle.setForeground(Color.white);
		f.add(LTvehicle);
		tf3=new JTextField();
		tf3.setBounds(140, 120, 150, 20);
		tf3.setEditable(false);
		f.add(tf3);
		
		LCmname=new JLabel("Company Name:");
		LCmname.setBounds(30, 150, 150, 20);
		LCmname.setForeground(Color.white);
		f.add(LCmname);
		tf4=new JTextField();
		tf4.setBounds(140, 150, 150, 20);
		tf4.setEditable(false);
		f.add(tf4);
	
		Lplate=new JLabel("Number Plate:");
		Lplate.setBounds(30, 180, 150, 20);
		Lplate.setForeground(Color.white);
		f.add(Lplate);
		tf5=new JTextField();
		tf5.setBounds(140, 180, 150, 20);
		tf5.setEditable(false);
		f.add(tf5);
		Success=new JLabel("Successfully Exit!");
		Success.setBounds(140, 215, 150, 20);
		
		////buttons///
		
		Bfind=new JButton("Find");
		Bfind.setBounds(60, 250, 80, 30);
		
		Bfind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=tf1.getText();
				int b=Integer.parseInt(a);
				if(b>=1 && b<=15)
				{
					if(d.Plate[b-1].equals("")) 
					{
						JOptionPane.showMessageDialog(f, " No vehicle Parked in Slot "+b+" !","Error", JOptionPane.ERROR_MESSAGE);
					}
					else 
					{
						tf2.setText(d.Cname[b-1]);
						tf3.setText(d.Tvehicle[b-1]);
						tf4.setText(d.Cmpname[b-1]);
						tf5.setText(d.Plate[b-1]);
					}
				}
				else
				{
					JOptionPane.showMessageDialog(f, "Please enter a valid Number b/w  1-15.","Error", JOptionPane.ERROR_MESSAGE);
				}
		}});
		
		f.add(Bfind);
		
		BExit=new JButton("Exit");
		BExit.setBounds(150, 250, 80, 30);
		BExit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String a=tf1.getText();
			int b=Integer.parseInt(a);
			if(tf3.getText().equals(""))
			{
				JOptionPane.showMessageDialog(f, "Please first find the vehicle to Exit.", "Error",JOptionPane.ERROR_MESSAGE);
			}
			else
			{
					if(tf3.getText().equals("Bike"))
					{
						d.bleaved++;
						d.bparked--;
						d.cash_receivable-=100;
						d.cash_received+=100;
					}
					else if(tf3.getText().equals("Car"))
					{
						d.cleaved++;
						d.cparked--;
						d.cash_receivable-=200;
						d.cash_received+=200;
					}
					else if(tf3.getText().equals("Bus"))
					{
						d.bsleaved++;
						d.bsparked--;
						d.cash_receivable-=300;
						d.cash_received+=300;
					}
					d.Slot[b-1]=0;
					d.Cname[b-1]="";
					d.Tvehicle[b-1]="";
					d.Cmpname[b-1]="";
					d.Plate[b-1]="";
					tf2.setText(null);
					tf3.setText(null);
					tf4.setText(null);
					tf5.setText(null);
					JOptionPane.showMessageDialog(f, "Successfully Exited!", "Message", JOptionPane.INFORMATION_MESSAGE);	
			}
		}
		});
		f.add(BExit);
		
		Back=new JButton("Back");
		Back.setBounds(240, 250, 80, 30);
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				FTable t=new FTable(null,null);
				new Vacant(null,null,t);
		}});
		f.add(Back);
		
		Ba=new JButton();
		Ba.setBounds(230, 250, 0, 0);
		f.add(Ba);
		
		f.setSize(400, 330);
		f.setLayout(null);	
		f.getContentPane().setBackground((new Color(0x2A3457)));
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
	}

}
