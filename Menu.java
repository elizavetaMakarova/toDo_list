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
 * This is class which visualize the main menu of the program 
 */
public class Menu extends JFrame
{
    
    private JButton addNewItem, showItems, exit;
    private File myFile;
    private JPanel gLay,sLay;
    private JTextArea note;

    /**
     * Constructor for objects of class Menu
     */
    public Menu() throws IOException 
    {
        super("Menu");
        myFile = new File("data.txt");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 200);
        setLayout(new BoxLayout(getContentPane(),BoxLayout.X_AXIS));
        gLay = new JPanel();
        sLay = new JPanel();
        gLay.setLayout(new GridLayout(3,1));
        note = new JTextArea("Press Add new Item to creat new item in your toDo list"+
        "\n"+"\n"+"Press Show Items to see your toDo list"+
        "\n"+"\n"+"Press Exit to close the program");
        addNewItem = new JButton("Add new Item");
        addNewItem.addActionListener(new Action());
        showItems = new JButton("Show Items");
        showItems.addActionListener(new Action());
        exit = new JButton("Exit");
        exit.addActionListener(new Action());
        gLay.add(addNewItem);
        gLay.add(showItems);
        gLay.add(exit);
        sLay.add(note);
        add(gLay);
        add(sLay);
        setVisible(true);
    }

    public class Action implements ActionListener
    {
      public void actionPerformed(ActionEvent e)
      {
       if(e.getSource()==exit)
      {
          System.exit(0);
      }
      if(e.getSource()==addNewItem) 
      {
          try {
            Visual v= new Visual();
            
            }
       catch(Exception ex) {
         JOptionPane.showMessageDialog(null,"Something is wrong");
          }
           
      }
      if(e.getSource()==showItems)
      {
          try {
            VisualList vl= new VisualList();
        }
       catch(Exception ex) {
         JOptionPane.showMessageDialog(null,"Something is wrong");
          }
          
      }
     }
   }
}
