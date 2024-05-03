import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class AddVehicle 
{
	JLabel Ldate,Lslot,LCname,LTvehicle,LCmname,Lplate,Success;
	JTextField tf1,tf2,tf4,tf5;
	final JComboBox cb;
	JButton BPark,BClear,Back,Ba;
	JFrame f;
	
	AddVehicle(Data d)
	{
		f=new JFrame("Park Vehicle");
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
		f.add(tf2);
		LTvehicle=new JLabel("Vehicle Type:");
		LTvehicle.setBounds(30, 120, 150, 20);
		LTvehicle.setForeground(Color.white);
		f.add(LTvehicle);
		
		String vehicle[]= {"Bike","Car","Bus"};
		cb=new JComboBox(vehicle);
		cb.setBounds(140, 120, 150, 20);
		f.add(cb);
		
		LCmname=new JLabel("Company Name:");
		LCmname.setForeground(Color.white);
		LCmname.setBounds(30, 150, 150, 20);
		f.add(LCmname);
		
		tf4=new JTextField();
		tf4.setBounds(140, 150, 150, 20);
		f.add(tf4);
	
		Lplate=new JLabel("Number Plate:");
		Lplate.setBounds(30, 180, 150, 20);
		Lplate.setForeground(Color.white);
		f.add(Lplate);
		tf5=new JTextField();
		tf5.setBounds(140, 180, 150, 20);
		f.add(tf5);
		
		
		////buttons///
		BPark=new JButton("Park");
		BPark.setBounds(60, 250, 80, 30);
		BPark.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
						////////////////checking for all field are empty or filled////////
						if(tf1.getText().equals("") || tf2.getText().equals("") || cb.getItemAt(cb.getSelectedIndex()).equals("") || tf4.getText().equals("") || tf5.getText().equals(""))
						{
							JOptionPane.showMessageDialog(f, "Please enter all details.","Error", JOptionPane.ERROR_MESSAGE);
						}
						else
						{
							String ss=tf1.getText();
							int TT=Integer.parseInt(ss);
								if(TT>=1 && TT<=15) //////////checking for 1-15 slot number
								{
									int t=1;
									for(int j=0;j<15;j++)
									{
										if(tf5.getText().equals(d.Plate[j]))
										{
											t++;
											break;
										}
									}
									
									if(t==1)///////////////// for vehicle whether is it already parked or not//////
									{
										int Try = 1;
										int i=Integer.parseInt(tf1.getText());
										for(int j = 1;j<=15;j++)
										{
											if(j==d.Slot[i-1])/////////////////checking for empty slot////////
											{
												Try++;
												JOptionPane.showMessageDialog(f, "Slot "+j+" is not Empty!","Error", JOptionPane.ERROR_MESSAGE);
												break;
											}
										}
										if(Try==1)
										{
											if(cb.getItemAt(cb.getSelectedIndex()).equals("Car"))
											{
												d.c++;
												d.cparked++;
												d.cash_receivable+=200;
												d.tamount+=200;
											}
											else if(cb.getItemAt(cb.getSelectedIndex()).equals("Bus"))
											{
												d.bs++;
												d.bsparked++;
												d.cash_receivable+=300;
												d.tamount+=300;
											}
											else if(cb.getItemAt(cb.getSelectedIndex()).equals("Bike"))
											{
												d.b++;
												d.bparked++;
												d.cash_receivable+=100;
												d.tamount+=100;
											}
											d.Slot[i-1]=i;
											d.Cname[i-1]=tf2.getText();
											d.Tvehicle[i-1]=(String) cb.getItemAt(cb.getSelectedIndex());
											d.Cmpname[i-1]=tf4.getText();
											d.Plate[i-1]=tf5.getText();
											JOptionPane.showMessageDialog(f, "Successfully Parked!", "Message", JOptionPane.INFORMATION_MESSAGE);
										}
									}
									else
									{
										JOptionPane.showMessageDialog(f, "This Vehicle is Already Parked!","Error", JOptionPane.ERROR_MESSAGE);
									}
								}
								else
								{
									JOptionPane.showMessageDialog(f, "Please enter a valid Number b/w  1-15.","Error", JOptionPane.ERROR_MESSAGE);
								}
							}
					}});
		f.add(BPark);
		
		BClear=new JButton("Clear");
		BClear.setBounds(150, 250, 80, 30);
		BClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tf1.setText(null);
			tf2.setText(null);
			cb.setSelectedItem("Bike");
			tf4.setText(null);
			tf5.setText(null);
		}});
		f.add(BClear);
		
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
		Ba.setBounds(240, 250, 0, 0);
		f.add(Ba);
		
	
		f.setSize(400, 330);
		f.setLayout(null);
		f.getContentPane().setBackground((new Color(0x2A3457)));
		f.setLocationRelativeTo(null);
		f.setVisible(true);

	}
}
