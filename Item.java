import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * Write a description of class VisualList here.
 *
 * @author Elizaveta Makarova
 * @version 1.0
 * This class is constructor for one item in the ToDo list
 */
public class Item 
{
    private int min;
    private int hour;
    private String location;
    private String note;
    public Item()
    { 
        min=00;
        hour=00;
        location="home";
        note="n/a";
    }
    public Item(int min1, int hour1, String note1, String location1) 
    {
        min=min1;
        hour=hour1;
        location=location1;
    }
    /**
    *Set note to the item
    */
    public void setNote(String note1)
    {
        note=note1;
    }
    /**
    *Get note as a String 
    */
    public String getNote()
    {
      return note;  
    }
    /**
    *Set time of the item 
    */
    public void setTime(int hour1, int min1)
    {
        if (min1<60 && hour1<24){
        min=min1;
        hour=hour1;
    }
    }
    /**
    *Get time of the item as a String 
    */
    public String getTime()
    {
      
        return hour+":"+min;  
    }
    /**
    *Get hour as an integer 
    */
    public int getHour()
    {
        return hour;
    }
    /**
    *Get minutes as an integer 
    */
    public int getMin()
    {
        return min;
    }
    /**
    *Set location of the item 
    */
    public void setLocation(String loc)
    {
        location=loc;
    }
    /**
    *Get location as a String 
    */
    public String getLocation()
    {
      return location;  
    }
    /**
    *Get all info about the item as a String 
    */
    public String getItem()
    {
        return "The time is "+hour+":"+min+"\n"+"The location is: "+location
        +"\n"+note;
    }
    /**
    *Get all info about the item as a String separated by comma  
    */
    public String getItemString()
    {
        return ""+hour+":"+min+" Location:"+location
        +" Note:"+note+",";
    }
}
