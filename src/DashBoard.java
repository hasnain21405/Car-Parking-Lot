import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DashBoard implements ActionListener 
{
	JFrame frame;
	JLabel title, title2,pic;
	JButton Vacant, about, logout;
	Image image = new ImageIcon(this.getClass().getResource("/download.png")).getImage();
	String TempPass,TempUname;
	
	DashBoard(String TempUname,String TempPass)
	{
		this.TempPass=TempPass;this.TempUname=TempUname;
		
		frame = new JFrame("Dashboard");
		Image i=Toolkit.getDefaultToolkit().getImage("icon.png");
		frame.setIconImage(i);
		
		title = new JLabel("\"Parking System\"");
		title.setBounds(200,30,300,25);
		title.setForeground(Color.white);
		title.setFont(new Font(null,Font.BOLD,20));
		
		title2 = new JLabel("Admin Dashboard");
		title2.setBounds(40,60,130,35);
		title2.setForeground(Color.white);
		title2.setFont(new Font(null,Font.BOLD,14));
		
		Vacant = new JButton("Vacant");
		Vacant.setBounds(40,100,130,20);
		Vacant.setFocusable(false);
		
		about = new JButton("About Project");
		about.setBounds(40,130,130,20);
		about.setFocusable(false);
		
		logout = new JButton("Logout and Exit");
		logout.setBounds(40,160,130,20);
		logout.setFocusable(false);
		
		pic =new JLabel();
		pic.setBounds(220,50,300,300);
		pic.setIcon(new ImageIcon(image));
		pic.setFocusable(false);
		
		frame.add(title);
		frame.add(title2);
		frame.add(Vacant);
		frame.add(about);
		frame.add(logout);
		frame.add(pic);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setBackground((new Color(0x2A3457)));
		frame.setSize(550,400);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		Vacant.addActionListener(this);
		about.addActionListener(this);
		logout.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{	 
		if(e.getSource()==Vacant) 
		{
			FTable t=new FTable(null,null);
			frame.dispose();	
			new Vacant(TempUname, TempPass,t);
		}
		else if(e.getSource()==about) 
		{
			frame.dispose();	
			new About(TempUname, TempPass);	
		}	
		else if(e.getSource()==logout)
		{
			frame.dispose();
			new LogIn(TempUname, TempPass);
		}		
	}
}

