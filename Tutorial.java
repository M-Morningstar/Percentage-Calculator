import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Tutorial{
       public static void main(String[] args)
       {
    	String[] choices = {"a) To find what is ....% of .....", "b) To find .... is what percent of ...."};
       	JFrame jf = new JFrame("Percentage Calculator");
       	JLabel jl = new JLabel();
       	JComboBox jb = new JComboBox(choices);
       	JTextField t1,t2;
       	JButton b = new JButton("Calculate");
       	
       	jl.setSize(400,550);
       	
       	jb.setBounds(75,75,200,20);

    	t1 = new JTextField("First Number");
    	t1.setBounds(75,125,150,20);
    	
    	t2 = new JTextField("Second Number");
    	t2.setBounds(75,175,150,20);
    	
    	b.setBounds(95, 225, 100, 20);
    	
       	jf.add(t1); jf.add(t2); 
       	jf.add(b);
       	jf.add(jb);
       	jf.add(jl);
       	jf.setSize(400, 400);
       	jf.setLayout(null);
       	jf.setVisible(true);
       	
       	b.addActionListener(new ActionListener(){
       		public void actionPerformed(ActionEvent e) {
       			
       			if(jb.getItemAt(jb.getSelectedIndex()).equals(choices[0])) {
       				String s1 = t1.getText();
       				String s2 = t2.getText();
       				
       				Double num1 = Double.parseDouble(s1);
       				Double num2 = Double.parseDouble(s2);
       				
       				Double answer = num1 * (num2/100); 
       				
       				jl.setText("The final answer is --> " + Double.toString(answer));
       			}
       			else {
       				String s1 = t1.getText();
       				String s2 = t2.getText();
       				
       				Double num1 = Double.parseDouble(s1);
       				Double num2 = Double.parseDouble(s2);
       				
       				Double answer = (num1/num2)*100;
       				
       				jl.setText("The final answer is --> " + Double.toString(answer));
       			}
       		}
       		
       	});

       }
}