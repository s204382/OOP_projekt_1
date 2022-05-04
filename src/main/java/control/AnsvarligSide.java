package control;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.*;

public class AnsvarligSide {
    public Label label1;
    public control.Frivillig frivilligApp;
    //create booth
    public TextField boothnameW;
    public TextField boothresponsibleW;
    public TextField boothplaceW;

    //read booth info
    /*BufferedReader readerbooth = new BufferedReader(new FileReader("C:\\Users\\charl\\OneDrive\\Dokumenter\\GitHub\\Projekt1\\Gitty\\booth.txt"));
    String boothline = readerbooth.readLine();
    String[] boothinfo = boothline.trim().split("-");
    String namebooth = boothinfo[0]; // name of booth
    String placebooth = boothinfo[1]; // placement of booth
    String responsiblebooth = boothinfo[3]; // responsible of the booth*/

    public void setMainController(Frivillig frivillig){
        this.frivilligApp=frivillig;

    }


    public void createBooth(ActionEvent actionEvent) throws IOException {
        BufferedWriter boothWriter = new BufferedWriter(new FileWriter("C:\\Users\\charl\\OneDrive\\Dokumenter\\GitHub\\OOP_projekt_1\\booth.txt", true));

        String enteredBoothName;
        String enteredBoothPlace;
        String enteredBoothResp;

        enteredBoothName = boothnameW.getText();
        enteredBoothPlace = boothplaceW.getText();
        enteredBoothResp = boothresponsibleW.getText();

        boothWriter.write(enteredBoothName + "-" + enteredBoothPlace + "-" + enteredBoothResp);
        //find ud af hvordan man indskriver på den næste tomme linje,,
        boothWriter.close();

    }
//se plan
    /*
    - adgang til shift fil (info om vagt er heri)
    - sortere i vagtplan efter bod og efter frivillig
     */

    //medarbejder
    /*
    - adgang til coworker fil
    -
     */

    //ændre plan/bod
    /*
    - tilgå booth fil
    - ændre plan
    - opret bod (udgiv vagtplan - skrive til shift fil) (skrive ind til booth fil)
    - ændre bod (udgiv vagtplan igen, samme funktion) (ret i booth fil)
     */



}

