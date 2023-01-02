public class Person {
    private String first_name,last_name;
    public Person(){
        this.first_name="";                     //non-arg constructor
        this.last_name="";
    }
    public Person(String first_name,String last_name){                       //arg constructor
        this.first_name=first_name;
        this.last_name=last_name;
    }

    //setter methods
    public void setFirst_name(String first_name) {                             //it will set the first name
        this.first_name = first_name;
    }
    public void setLast_name(String last_name) {                                //this method will set the last name
        this.last_name = last_name;
    }

    @Override
    public String toString() {                                                //return the name
        return first_name+" "+last_name;
    }
}
