public class Time {
  public int hour;
  public int minute;
  public double second;

  public Time(){
    this.hour = 0;
    this.minute = 0;
    this.second = 0.0;
  }

  public Time(int hour,int minute, double seconds){
    this.hour = hour;
    this.minute = minute;
    this.second = seconds;
  }
  public static void main(String args[]){
    Time time = new Time(11, 50, 34.3);
    System.out.println(time.minute);
  }
}
