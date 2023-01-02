public class Doctor extends Person{                                             //extending from person class
    private String speciality;
    public Doctor(){
        super();
        this.speciality="";
    }
    public Doctor(String first_name,String last_name,String speciality){        //arg constructor
        super(first_name,last_name);
        this.speciality=speciality;
    }

    @Override
    public void setFirst_name(String first_name) {                      //It will set the first name(Override method)
        super.setFirst_name(first_name);
    }

    @Override
    public void setLast_name(String last_name) {                        //It will set the last name(Override method)
        super.setLast_name(last_name);
    }

    public void setSpeciality(String speciality) {                      // this method will set the speciality
        this.speciality = speciality;
    }

    @Override
    public String toString() {                                          //print the speciality
        return "Attending Physician: "+super.toString()+" "+speciality;
    }
}
