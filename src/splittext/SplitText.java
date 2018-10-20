/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splittext;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Art7n
 */
public class SplitText extends JFrame {
    private JButton splitButton = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel labelResult = new JLabel ();
    private JLabel result = new JLabel();
    SplitText (){
        super("Split Text");
	this.setBounds(100,100,250,200);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labelResult.setText("Result");
        
        Container container = this.getContentPane();
	container.setLayout(new GridLayout(3,2,2,2));
	container.add(input);
        splitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                splitButtonActionPerformed(evt);
            }
        });
        container.add(splitButton);
        container.add(result);
    }
    private void splitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String Str = input.getText();
        String [] strMass = Str.split(" ");
        String resultStr = new String();
        
        if(strMass.length > 4){
            for( int i = 0; i < strMass.length; i++){
                resultStr += strMass [i]+ " ";
                if( ((i+1) % 4) == 0){
                    resultStr += "<br>";
                }
            }
            result.setText("<html>" + resultStr + "</html>");
        }else{
           this.result.setText(input.getText());
        }  
        
    }
     
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SplitText frame = new SplitText ();
        frame.setVisible(true);
    }
    
}
