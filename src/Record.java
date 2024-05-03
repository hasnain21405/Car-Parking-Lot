import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Record extends JFrame implements ActionListener {
	
	static JTable table;
	JButton b1;

	Record(Data d,AddVehicle a){
	
		table=new JTable();
		Object[] columns={"Name","Vehicle","Company","No.Plate"} ;
		
		DefaultTableModel model=new DefaultTableModel();
		
		setSize( 352, 130);
		
		model.setColumnIdentifiers(columns);
		
		table.setModel(model);
		table.setAutoCreateRowSorter(true);
		table.setBounds(200,30,300,300);
		
		getContentPane().add(table);
		
		JScrollPane pane=new JScrollPane(table);
		pane.setBounds(94,11,395,264);
		getContentPane().add(pane);
		
		JPanel panel = new JPanel();
		pane.setColumnHeaderView(panel);
		
		getContentPane().setLayout(null);
		
		Object[] row=new Object[4];	   
		
		
		int i=0;

		for(;i<=14;)
		{
			i++;
		row[0]=d.Cname[i-1];
		row[1]=d.Tvehicle[i-1];
		row[2]=d.Cmpname[i-1];
		row[3]=d.Plate[i-1];
		model.addRow(row);
		
		}
 
		 JLabel lblNewLabel = new JLabel("Slot No.");
		 lblNewLabel.setForeground(new Color(255, 255, 255));
		 lblNewLabel.setBounds(35, 10, 49, 14);
		 getContentPane().add(lblNewLabel);
		 
		 JLabel lblNewLabel_15 = new JLabel("1");
		 lblNewLabel_15.setForeground(new Color(255, 255, 255));
		 lblNewLabel_15.setBounds(80, 33, 49, 14);
		 getContentPane().add(lblNewLabel_15);
		 setVisible(true);
		 
		 JLabel lblNewLabel_1 = new JLabel("2");
		 lblNewLabel_1.setForeground(new Color(255, 255, 255));
		 lblNewLabel_1.setBounds(80, 49, 49, 14);
		 getContentPane().add(lblNewLabel_1);
		 
		 JLabel lblNewLabel_12 = new JLabel("3");
		 lblNewLabel_12.setForeground(new Color(255, 255, 255));
		 lblNewLabel_12.setBounds(80, 64, 49, 14);
		 getContentPane().add(lblNewLabel_12);
		 
		 JLabel lblNewLabel_11 = new JLabel("4");
		 lblNewLabel_11.setForeground(new Color(255, 255, 255));
		 lblNewLabel_11.setBounds(80, 80, 58, 14);
		 getContentPane().add(lblNewLabel_11);
		 
		 JLabel lblNewLabel_10 = new JLabel("5");
		 lblNewLabel_10.setForeground(new Color(255, 255, 255));
		 lblNewLabel_10.setBounds(80, 96, 49, 14);
		 getContentPane().add(lblNewLabel_10);
		 
		 
		 JLabel lblNewLabel_9 = new JLabel("6");
		 lblNewLabel_9.setForeground(new Color(255, 255, 255));
		 lblNewLabel_9.setBounds(80, 110, 49, 14);
		 getContentPane().add(lblNewLabel_9);
		 
		 JLabel lblNewLabel_8 = new JLabel("7");
		 lblNewLabel_8.setForeground(new Color(255, 255, 255));
		 lblNewLabel_8.setBounds(80, 125, 49, 14);
		 getContentPane().add(lblNewLabel_8);
		 
		 JLabel lblNewLabel_7 = new JLabel("8");
		 lblNewLabel_7.setForeground(new Color(255, 255, 255));
		 lblNewLabel_7.setBounds(80, 142, 49, 14);
		 getContentPane().add(lblNewLabel_7);
		 
		 JLabel lblNewLabel_6 = new JLabel("9");
		 lblNewLabel_6.setForeground(new Color(255, 255, 255));
		 lblNewLabel_6.setBounds(80, 159, 49, 14);
		 getContentPane().add(lblNewLabel_6);
		 
		 
		 JLabel lblNewLabel_5 = new JLabel("10");
		 lblNewLabel_5.setForeground(new Color(255, 255, 255));
		 lblNewLabel_5.setBounds(75, 174, 49, 14);
		 getContentPane().add(lblNewLabel_5);
		 
		 JLabel lblNewLabel_4 = new JLabel("11");
		 lblNewLabel_4.setForeground(new Color(255, 255, 255));
		 lblNewLabel_4.setBounds(75, 190, 49, 14);
		 getContentPane().add(lblNewLabel_4);
		 
		 JLabel lblNewLabel_3 = new JLabel("12");
		 lblNewLabel_3.setForeground(new Color(255, 255, 255));
		 lblNewLabel_3.setBounds(75, 205, 49, 14);
		 getContentPane().add(lblNewLabel_3);
		 
		
		 JLabel lblNewLabel_14 = new JLabel("13");
		 lblNewLabel_14.setForeground(new Color(255, 255, 255));
		 lblNewLabel_14.setBounds(75, 222, 49, 14);
		 getContentPane().add(lblNewLabel_14);
		 
		 JLabel lblNewLabel_13 = new JLabel("14");
		 lblNewLabel_13.setForeground(new Color(255, 255, 255));
		 lblNewLabel_13.setBounds(75, 240 , 49, 14);
		 getContentPane().add(lblNewLabel_13);
		 
		 JLabel lblNewLabel_2 = new JLabel("15");
		 lblNewLabel_2.setForeground(new Color(255, 255, 255));
		 lblNewLabel_2.setBounds(75, 255, 49, 14);
		 getContentPane().add(lblNewLabel_2);
		 
		 b1=new JButton("Back");
		 b1.setBounds(460, 285, 80, 30);
		 add(b1);
		 b1.addActionListener(this);
		 
		 Image i1=Toolkit.getDefaultToolkit().getImage("icon.png");
		 setIconImage(i1);
		 setSize(560,360);
		 getContentPane().setBackground(new Color(0x2A3457));
		 setLocationRelativeTo(null);
		 getContentPane().setLayout(null);
		 
	}
	public static void main(String[] args)
	{
		new Record(null,null);
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			dispose();
		}
		
	}
}
