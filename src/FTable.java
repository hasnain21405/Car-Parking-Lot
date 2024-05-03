import java.awt.Font;

import javax.swing.*;
	
public class FTable {
	
		JTextField e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,lane1,lane2,lane3,lane4,lane5;
		
		FTable(Vacant v,Data d){

			lane1=new JTextField("LANE 1");
			lane1.setBounds(60,70,60,20);
			lane1.setEditable(false);
			lane1.setFont(new Font(null,Font.BOLD,12));
				
			e1=new JTextField(d.s1);
			e1.setBounds(60,90,60,20);
			e1.setEditable(false);
		
			e2=new JTextField(d.s2);
			e2.setBounds(60,110,60,20);
			e2.setEditable(false);
			
			e3=new JTextField(d.s3);
			e3.setBounds(60,130,60,20);
			e3.setEditable(false);
			
			lane2=new JTextField("LANE 2");
			lane2.setBounds(120,70,60,20);
			lane2.setEditable(false);
			lane2.setFont(new Font(null,Font.BOLD,12));
			
			e4=new JTextField(d.s4);
			e4.setBounds(120,90,60,20);
			e4.setEditable(false);
			
			e5=new JTextField(d.s5);
			e5.setBounds(120,110,60,20);
			e5.setEditable(false);
			
			e6=new JTextField(d.s6);
			e6.setBounds(120,130,60,20);
			e6.setEditable(false);
			

			lane3=new JTextField("LANE 3");
			lane3.setBounds(180,70,60,20);
			lane3.setEditable(false);
			lane3.setFont(new Font(null,Font.BOLD,12));
			
			
			e7=new JTextField(d.s7);
			e7.setBounds(180,90,60,20);
			e7.setEditable(false);
		
			e8=new JTextField(d.s8);
			e8.setBounds(180,110,60,20);
			e8.setEditable(false);
			
			e9=new JTextField(d.s9);
			e9.setBounds(180,130,60,20);
			e9.setEditable(false);
			
			lane4=new JTextField("LANE 4");
			lane4.setBounds(240,70,60,20);
			lane4.setEditable(false);
			lane4.setFont(new Font(null,Font.BOLD,12));
			
			
			e10=new JTextField(d.s10);
			e10.setBounds(240,90,60,20);
			e10.setEditable(false);
			
			e11=new JTextField(d.s11);
			e11.setBounds(240,110,60,20);
			e11.setEditable(false);
		
			e12=new JTextField(d.s12);
			e12.setBounds(240,130,60,20);
			e12.setEditable(false);
			
			lane5=new JTextField("LANE 5");
			lane5.setBounds(300,70,60,20);
			lane5.setEditable(false);
			lane5.setFont(new Font(null,Font.BOLD,12));
	
			e13=new JTextField(d.s13);
			e13.setBounds(300,90,60,20);
			e13.setEditable(false);
			
			e14=new JTextField(d.s14);
			e14.setBounds(300,110,60,20);
			e14.setEditable(false);
			
			e15=new JTextField(d.s15);
			e15.setBounds(300,130,60,20);
			e15.setEditable(false);
			
			if(d.Slot[0]==1) {
				e1.setText("Parked1");
			}if(d.Slot[1]==2) {
				e2.setText("Parked2");
			}if(d.Slot[2]==3) {
				e3.setText("Parked3");
			}if(d.Slot[3]==4) {
				e4.setText("Parked4");
			}if(d.Slot[4]==5) {
				e5.setText("Parked5");
			}if(d.Slot[5]==6) {
				e6.setText("Parked6");
			}if(d.Slot[6]==7) {
				e7.setText("Parked7");
			}if(d.Slot[7]==8) {
				e8.setText("Parked8");
			}if(d.Slot[8]==9) {
				e9.setText("Parked9");
			}if(d.Slot[9]==10) {
				e10.setText("Parked10");
			}if(d.Slot[10]==11) {
				e11.setText("Parked11");
			}if(d.Slot[11]==12) {
				e12.setText("Parked12");
			}if(d.Slot[12]==13) {
				e13.setText("Parked13");
			}if(d.Slot[13]==14) {
				e14.setText("Parked14");
			}if(d.Slot[14]==15) {
				e15.setText("Parked15");
			}
	}
}


