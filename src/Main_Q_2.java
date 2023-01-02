import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main_Q_2 {
    public static void main(String[] args) throws FileNotFoundException {
        char choice;
        Scanner in=new Scanner(System.in);
        process();// calling the function
        System.out.print("Do you wanna continue:(y for yes),(n for no):");  ///asking for continuation
        choice=in.next().charAt(0);
        while(choice=='y'){
            process();
            System.out.print("Do you wanna continue:(y for yes),(n for no):");
            choice=in.next().charAt(0);
        }
        if(choice=='n')System.exit(0); //exiting the program

    }

    //check if the user is inserting a valid date
    public static boolean date_validator(String s) {
        String[] arr;
        arr=s.split("/");

        Integer month = (Integer.valueOf(arr[0]));
        Integer day = (Integer.valueOf(arr[1]));            
        Integer year = (Integer.valueOf(arr[2]));

        if ((month <= 12) && (day <= 31)&&(2000<=year&&year<=2022)) {
            return true;
        } else return false;
    }
    public static void process() throws FileNotFoundException {
        Scanner input=new Scanner(System.in);
        Scanner input_s=new Scanner(System.in);
        Scanner input_d=new Scanner(System.in);
        Patient p=new Patient();
        Doctor d=new Doctor();
        Date date_A=new Date();
        Date date_D=new Date();
        Bill bill=new Bill();
        long patient_id;
        String first_name,last_name,special,A_date,D_date,first_name_p,last_name_p;

        //taking user input
        System.out.print("Enter Patient id: ");
        patient_id=input.nextInt();
        System.out.print("Enter Patient First name: ");
        first_name_p= input_s.next();
        System.out.print("Enter Patient last name: ");
        last_name_p= input_s.next();

        //setting the patient info in patient object
        p.setPatient_id(patient_id);
        p.setFirst_name(first_name_p);
        p.setLast_name(last_name_p);

        //taking user input for doctor info
        System.out.print("Enter doctor's First name: ");
        first_name= input_s.next();
        System.out.print("Enter doctor's last name: ");
        last_name= input_s.next();
        System.out.print("Enter doctor's speciality: ");
        special= input_s.next();

        //set the doc info in doctor object
        d.setFirst_name(first_name);
        d.setLast_name(last_name);
        d.setSpeciality(special);

        //taking user input for date
        System.out.print("Enter Admit date(month/day/year): ");
        A_date= input_d.next();

        //checking the date is valid or not
        while(!(date_validator(A_date))){
            System.out.println("Invalid date.Please Enter Again");
            System.out.print("Enter Admit date(month/day/year): "); //wrong input will not be excepted
            A_date= input_s.next();
        }

        //if it is, set the date
        date_A.setDate(A_date);

        // same process as admit date
        System.out.print("Enter Discharge date(month/day/year): ");
        D_date= input_s.next();
        while(!(date_validator(D_date))){
            System.out.println("Invalid date.Please Enter Again");
            System.out.print("Enter Discharge date(month/day/year): ");
            D_date= input_s.next();
        }
        date_D.setDate(D_date);

        //charges variables and taking user input
        int pharmacy,room,doc_fee;
        System.out.print("Enter Pharmacy Charges: ");
        pharmacy=input.nextInt();
        System.out.print("Enter room_rent Charges: ");
        room=input.nextInt();
        System.out.print("Enter Doctor's fee: ");
        doc_fee=input.nextInt();

        //setting the info in Bill object
        bill.setMedicine(pharmacy);
        bill.setRoom_charge(room);
        bill.setDoctor_fee(doc_fee);
        bill.total(pharmacy,room,doc_fee);

        String file_name=first_name_p+last_name_p+".txt";       //set the file name

        String s=(p.toString()+"\n"+d.toString()+"\n"+"Admit Date: "+date_A.toString()+"\n"
                +"Discharge Date: "+date_D.toString()+"\n"+bill.toString()); //using the tostring method convert the
                                                                        // the targeted info in one string
        try {
            PrintWriter write = new PrintWriter(file_name); //open and write in a txt file with the name of patient
            write.println(s); //write our new string
            write.close();
        }
        catch(FileNotFoundException o){
            System.out.println(o.toString());

        }

    }

}
