public class Patient extends Person{            //extending from person class
    private long Patient_id;
    private String physician_name;
    private Date admit,discharge,date_of_birth;
    public Patient(){                                   //non-arg constructor
        Patient_id=0;
        physician_name="";
    }
    Patient(long Patient_id,Date date_of_birth, String physician_name, Date admit,Date discharge){
        this.Patient_id=Patient_id;
        this.date_of_birth=date_of_birth;                   //arg constructor
        this.physician_name=physician_name;
        this.admit=admit;
        this.discharge=discharge;
    }

    //setter methods
    public void setPhysician_name(String physician_name,Doctor doc) {
        doc.setFirst_name(String.valueOf(physician_name.split(" ",0)));
        doc.setLast_name(String.valueOf(physician_name.split(" ",0)));
    }

    public void setPatient_id(long Patient_id) {
        this.Patient_id=Patient_id;
    }

    public void setAdmit(String a,Date admit) {
        admit.setDate(a);
    }

    public void setDischarge(String d,Date discharge) {
        discharge.setDate(d);
    }

    public void setDate_of_birth(String dob, Date date_of_birth) {
        date_of_birth.setDate(dob);
    }

    @Override
    public String toString() {
        return "Patient: "+ super.toString()+"\n"+"ID: "+Patient_id;   //return the patient info
    }
}
