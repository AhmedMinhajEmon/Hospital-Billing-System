public class Bill {
    private long patient_id;
    private int medicine, doctor_fee,room_charge;
    public Bill(){                                                                //default constructor
        this.patient_id=0;
        this.medicine=0;
        this.doctor_fee=0;
        this.room_charge=0;
    }
    public Bill(long patient_id,int medicine,int room_charge,int doctor_fee){     //arg constructor
        this.patient_id=patient_id;
        this.medicine=medicine;
        this.doctor_fee=doctor_fee;
        this.room_charge=room_charge;
    }

    //getter method
    public long getPatient_id() {                                           // it is to print patient id
        return patient_id;
    }

    @Override
    public String toString() {      //returning our targeted info
        return String.format("%-18s","Pharmacy Charges:")+"$ "+medicine
        +"\n"+String.format("%-18s","Room Charges:")+"$ "+room_charge
                +"\n"+String.format("%-18s","Doctor's Fees:")+"$ "+doctor_fee+"\n"+
                "--------------------------------------------------------"+"\n"+String.format("%-18s","Total Charges:")+"$ "+total(medicine,room_charge,doctor_fee);
    }

    //setter method
    public void setMedicine(int medicine) {
        this.medicine = medicine;
    }

    public void setRoom_charge(int room_charge) {
        this.room_charge = room_charge;
    }

    public void setDoctor_fee(int doctor_fee) {
        this.doctor_fee = doctor_fee;
    }

    //returning the total cost
    public int total(int medicine, int room_charge, int doctor_fee){
        return medicine+room_charge+doctor_fee;
    }
}
