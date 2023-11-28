public class makanmalam{
    private int hour;
    private int minute;
    private int sec;

    public void setTime (int h, int m, int s){
        hour = ((h>=0 && h<24) ? h:0);
        minute = ((m>=0 && m<60) ? m:0);
        sec = ((s>=0 && s<60) ? s:0);

    }

    public String toMilitary(){
        return String.format ("%02d : %02d : %02d", hour, minute, sec); 

    }
}

//hour must be in between 0-24
//minute must be in between 0-60
//second must be in between 0-60

// ? : check sama ada betul ke tidak 
// %02d : format 00:00:00