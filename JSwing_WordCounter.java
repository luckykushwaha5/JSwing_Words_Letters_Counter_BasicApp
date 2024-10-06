import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
//import javax.swing.text.StyledEditorKit.ForegroundAction;

public class JSwing implements ActionListener{

    JTextArea jtextarea;
    JLabel jlable;
    JLabel jlable1;

    public JSwing(){
        JFrame jframe = new JFrame();

        //TextArea
        jtextarea = new JTextArea();
        jtextarea.setBounds(75,100,250,150);
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        jtextarea.setBorder(border);
        jtextarea.setBackground(Color.YELLOW);
        jtextarea.setForeground(Color.RED);
        jframe.add(jtextarea);

        //Button
        JButton jbutton = new JButton("Click Here");
        jbutton.setBounds(135,280,120,30);
        jframe.add(jbutton);

        //Button Functionality
        jbutton.addActionListener(this);

        //Lable
        jlable = new JLabel( " ");
        jlable.setBounds(75,60,250,30);
        jframe.add(jlable);

        jlable1 = new JLabel( " ");
        jlable1.setBounds(75,30,250,30);
        jframe.add(jlable1);

        //Frame methods
        jframe.setLayout(null);
        jframe.setSize(400,400);
        jframe.setVisible(true);
        jframe.setTitle("Text Counter App");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e){
        String text = jtextarea.getText();
        String textArr[] = text.split(" ");
        jlable.setText("No.of characters in Textarea : " + text.length());
        jlable1.setText("No.of words in Textarea : " + textArr.length);

    }
    public static void main(String args[]){
        JSwing jswing = new JSwing();
    }
}