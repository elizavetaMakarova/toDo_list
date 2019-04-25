import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * Write a description of class VisualList here.
 *
 * @author Elizaveta Makarova
 * @version 1.0
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
    public void setNote(String note1)
    {
        note=note1;
    }
    public String getNote()
    {
      return note;  
    }
    public void setTime(int hour1, int min1)
    {
        if (min1<60 && hour1<24){
        min=min1;
        hour=hour1;
    }
    }
    public String getTime()
    {
      
        return hour+":"+min;  
    }
    public int getHour()
    {
        return hour;
    }
    public int getMin()
    {
        return min;
    }
    public void setLocation(String loc)
    {
        location=loc;
    }
    public String getLocation()
    {
      return location;  
    }
    public String getItem()
    {
        return "The time is "+hour+":"+min+"\n"+"The location is: "+location
        +"\n"+note;
    }
     public String getItemString()
    {
        return ""+hour+":"+min+" Location:"+location
        +" Note:"+note+",";
    }
}
