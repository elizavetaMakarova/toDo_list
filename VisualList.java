import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;
/**
 * Write a description of class VisualList here.
 *
 * @author Elizaveta Makarova
 * @version 1.0
 */
public class VisualList extends JFrame
{
    // instance variables - replace the example below with your own
    private JList list = new JList();
    private DefaultListModel listModel = new DefaultListModel();
    private JButton markDone;

    public VisualList() throws IOException {
        super("ToDo list");
        
        setSize(400, 200);
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
      
        File file = new File("data.txt");

        Scanner scan = null;

        scan = new Scanner(file);

        while (scan.hasNextLine()) {
           String line = scan.nextLine();
           String[] lineArray = line.split(",");
        
         for (String s: lineArray)
         {
             listModel.addElement(s);
         }
 
    }
    
       list = new JList(listModel);
       markDone = new JButton("Mark as done");
       markDone.addActionListener(new Action());

        add(list);
        add(markDone);

        setVisible(true);
   
}

public class Action implements ActionListener 
    {
      public void actionPerformed(ActionEvent e) 
    {
      
       if(e.getSource()==markDone) 
      {
          
         int selectedIndex = list.getSelectedIndex();
           if (selectedIndex != -1) {
           listModel.remove(selectedIndex);
        }
        String strToTxt= listModel.toString().replace("]", "").replace("[", "") ;
        try{
        File data = new File("data.txt");
        FileWriter printL = new FileWriter(data, false);
       
        printL.write(strToTxt+",");
        printL.close();
         }
         catch(Exception ex) {
         JOptionPane.showMessageDialog(null,"Something is wrong");
          }
      }
}
}
}
