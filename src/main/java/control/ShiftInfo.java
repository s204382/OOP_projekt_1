package control;

//Get and set info about shifts

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ShiftInfo {

    private String time;
    private String place;
    private String booth;
    private String admin;




    //String time, String place, String booth, String admin
    public String ShiftInfo(String time, String place, String booth, String admin) throws IOException {
        this.time = this.time;
        this.place = this.place;
        this.booth = this.booth;
        this.admin = this.admin;



        return ShiftInfo(this.time, this.place, this.booth, this.admin);

    }



    public String getTime() throws IOException {
        BufferedReader Shiftreader = new BufferedReader(new FileReader("C:\\Users\\charl\\OneDrive\\Dokumenter\\GitHub\\OOP_projekt_1\\shift.txt"));
        String ShiftLine = Shiftreader.readLine();
        String[] infosplit = ShiftLine.trim().split("\\s+");


        while(ShiftLine!=null) {
            this.time = infosplit[0]; // time
            ShiftLine = Shiftreader.readLine();
        }

        return this.time;

    }

    public String getPlace()  throws IOException {
        BufferedReader Shiftreader = new BufferedReader(new FileReader("C:\\Users\\charl\\OneDrive\\Dokumenter\\GitHub\\OOP_projekt_1\\shift.txt"));
        String ShiftLine = Shiftreader.readLine();
        String[] infosplit = ShiftLine.trim().split("\\s+");
        this.place = infosplit[1]; // place
        return place;
    }

    public String getBooth()  throws IOException {
        BufferedReader Shiftreader = new BufferedReader(new FileReader("C:\\Users\\charl\\OneDrive\\Dokumenter\\GitHub\\OOP_projekt_1\\shift.txt"));
        String ShiftLine = Shiftreader.readLine();
        String[] infosplit = ShiftLine.trim().split("\\s+");
        this.booth = infosplit[2];
        return booth;
    }

    public String getAdmin()  throws IOException {
        BufferedReader Shiftreader = new BufferedReader(new FileReader("C:\\Users\\charl\\OneDrive\\Dokumenter\\GitHub\\OOP_projekt_1\\shift.txt"));
        String ShiftLine = Shiftreader.readLine();
        String[] infosplit = ShiftLine.trim().split("\\s+");
        this.admin = infosplit[3];
        return admin;
    }





}




