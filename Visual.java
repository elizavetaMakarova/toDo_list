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

/**
 * Write a description of class VisualList here.
 *
 * @author Elizaveta Makarova
 * @version 1.0
 */
public class Visual extends JFrame
{
    private JLabel timelbl,locationlbl, notelbl;
    private JButton save,reset;
    private JTextField hour, min, location;
    private JTextArea note;
    private ToDo tlist= new ToDo();
    private Item item= new Item();
    private JPanel gridLay,snrLay;
    public Visual() throws IOException
    {
        super("ToDo list");
        
        setSize(400, 200);
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        gridLay = new JPanel();
        gridLay.setLayout(new GridLayout(1,3));
        snrLay = new JPanel();
        snrLay.setLayout(new GridLayout(1,3));
        timelbl= new JLabel("Enter time: ");
        locationlbl = new JLabel("Enter location: ");
        notelbl= new JLabel("Enter note: ");
        note=new JTextArea(10,20);
        location=new JTextField();
        hour=new JTextField("hours");
        min=new JTextField("minutes");
        save= new JButton("Save");
        reset= new JButton("Reset");
        reset.addActionListener(new Action());
        save.addActionListener(new Action());
        
        gridLay.add(timelbl);
        gridLay.add(hour);
        gridLay.add(min);
        this.add(gridLay);
        add(locationlbl);
        add(location);
        add(notelbl);
        add(note);
        snrLay.add(save);
        snrLay.add(reset);
        add(snrLay);
        setVisible(true);
        
        
    }
    
    private void creatItems(Item item) throws IOException
    {
        tlist.addItem(item);
    }
    public class Action implements ActionListener 
    {
      public void actionPerformed(ActionEvent e) 
    {
      
        if(e.getSource()==save) 
       {
          try{
         
          item.setNote(note.getText());
          item.setTime(Integer.parseInt(hour.getText()),Integer.parseInt(min.getText()));
          item.setLocation(location.getText());
          try {
            creatItems(item);
        }
        catch(Exception ex) {
         JOptionPane.showMessageDialog(null,"Enter some value");
          }
           
          
          JOptionPane.showMessageDialog(null,item.getItem());
      }
       
        
        catch (Exception ex)
        {
           JOptionPane.showMessageDialog(null,"Time is invalid"); 
        }
      }
     
       if(e.getSource()==reset)
       {
          hour.setText("hours");
          min.setText("minutes");
          location.setText("");
          note.setText("");
       }
     
    }
}
}