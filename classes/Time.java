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
    return this.minute;
  }
  public int getSeconds(){
    return this.seconds;
  }

  public void setHour(int hour){
    this.hour = hour;
  }
  public void setMinute(int minute){
    this.hour = minute;
  }
  public void setSeconds(int seconds){
    this.hour = seconds;
  }
  public static void main(String args[]){
    Time time = new Time(11, 50, 34.3);
    time.hour = 12;
    System.out.println(time.minute);
    Time time2 = new Time();
    time2.hour = 12;
    System.out.println("our time is "+time2.getHour() +time2.getMinute());

  }
}
