package classes;

public class Time {
  public int hour;
  public int minute;
  public int seconds;

  public Time(){
    this.hour = 0;
    this.minute = 0;
    this.seconds = 0;
  }

  public Time(int hour,int minute, int seconds){
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
  public String toString(){
    return String.format("%02d: %02d: %02d:", this.hour, this.minute, this.seconds);
  }
  public void approx(){ //modifier
    if(this.seconds >=30 ){
      this.minute+=1;
      this.seconds=0;
      if(this.minute >=60){
        this.hour+=1;
        this.minute=0;
      }
      if(this.hour>=23){
        this.hour = 0;
      }
    }else{
      this.minute =0;
    }
  }
  public void setSeconds(int seconds){
    this.hour = seconds;
  }
  public static void main(String args[]){
    Time time = new Time(11, 50, 34);
    time.hour = 12;
    System.out.println(time.minute);
    Time time2 = new Time();
    time2.hour = 12;
    System.out.println("our time is "+ time);//time2.getHour() +time2.getMinute());
    System.out.println(time2);
    Time time3 = new Time(23,59,50);
    time3.approx();
    System.out.println("out second time is :"+time3);

  }
}
