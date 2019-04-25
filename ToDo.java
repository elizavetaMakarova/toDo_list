import java.util.ArrayList;
import java.util.stream.*;
import java.io.*;
import java.io.FileWriter;
import java.io.PrintWriter;


/**
 * Write a description of class VisualList here.
 *
 * @author Elizaveta Makarova
 * @version 1.0
 */
public class ToDo 
{
    private ArrayList<Item> toDo;
    private ArrayList<Item> toDo1;
    public ToDo() throws IOException
   {
       super();
       toDo= new ArrayList();
    }
    public void addItem(Item i) throws IOException
    {
        toDo.add(i);
        
        File data = new File("data.txt");
        FileWriter printL = new FileWriter(data, true);
       
        printL.write(i.getItemString());
        printL.close();
    }
    
    public ArrayList<Item> getItemsAfter(int hour1, int min1)
    {
       toDo1=toDo.stream()
       .filter(e->e.getMin()>min1)
       .filter(e->e.getHour() > hour1).collect(Collectors 
                            .toCollection(ArrayList::new)); 
       return toDo1;
    }
    public ArrayList<Item> getItemsEqual(int hour1, int min1)
    {
       toDo1=toDo.stream()
       .filter(e->e.getMin()==min1)
       .filter(e->e.getHour()== hour1).collect(Collectors 
                            .toCollection(ArrayList::new)); 
       return toDo1;
    }
    public ArrayList<Item> getList()
    {
        return (toDo);
    }
    public String getStringList()
    {
        return (toDo.stream().map( n -> n.getItem() )
        .collect( Collectors.joining( "\n" ) ));
    }
}

