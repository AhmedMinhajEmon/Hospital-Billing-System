import static java.lang.Math.abs;

public class Date {
    private String month,day,year,d;
    Date(){
        d="";
        month="";
        day="";
        year="";
    }
    Date(String month,String day,String year,String d){                      //arg constructor
        this.month=month;
        this.day=day;
        this.year=year;
        this.d=d;
    }

    //setter method
    public void setDate(String d) {
        String[] arr;
        arr=d.split("/");
        this.month=String.valueOf(arr[0]);
        this.day=String.valueOf(arr[1]);
        this.year=String.valueOf(arr[2]);
    }

    @Override
    public String toString() {
        return month+"-"+day+"-"+year;
    } //return the date

}
