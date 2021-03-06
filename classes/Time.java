public class Time {
  public int hour;
  public int minute;
  public double seconds;

  public Time(){
    this.hour = 0;
    this.minute = 0;
    this.seconds = 0.0;
  }

  public Time(int hour,int minute, double seconds){
    this.hour = hour;
    this.minute = minute;
    this.seconds = seconds;
  }
  public int getHour(){
    return this.hour;
  }
  public int getMinute(){
    return this.hour;
  }
  public int getSeconds(){
    return this.hour;
  }

  public void setHour(int hour){
    this.hour = hour;
  }
  public static void main(String args[]){
    Time time = new Time(11, 50, 34.3);
    System.out.println(time.hour);
    Time time2 = new Time();
    System.out.println("our time is "+time2.getHour()+time2.getMinute());
  }
}
