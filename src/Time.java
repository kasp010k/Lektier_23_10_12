public class Time {

    public static void main(String[] args) {

        Time time1 = new Time();
        Time time2 = new Time(555550000);

        System.out.println("Klokken er  "+time1.getHour()+":"+time1.getMinute()+":"+time1.getSecond());


        System.out.println("Tid efter 555550000 ms  "+time2.getHour()+":"+time2.getMinute()+":"+time2.getSecond());


    }




    int hour;
    int minute;
    int second;
    long klokken;


    Time(){
        klokken=System.currentTimeMillis();
    }


    Time(long time){
        klokken=time;
    }

    Time(int hour, int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public int getHour() {
        return (int)(klokken / (1000 * 60 * 60)) % 24 +2;
    }

    public int getMinute() {
        return (int)(klokken / (1000 * 60)) % 60;
    }

    public int getSecond() {
        return (int)(klokken / 1000) % 60;
    }

    public void setTime(long elapsedTime){
        this.klokken = elapsedTime;
    }

}