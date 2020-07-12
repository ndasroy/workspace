package Practice;

import javax.swing.JOptionPane;

public class Variables {

	public static void main(String args[]){
		double base=2.1;
		double height=3.15;
		int area=(int)base*(int)height/2;
		JOptionPane myID=new JOptionPane();
		
		myID.showMessageDialog(null, area);
	}
}
