package control;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class AnsvarligSide implements Initializable {
    public Label label1;
    public control.Frivillig frivilligApp;
    //create booth
    public TextField boothnameW;
    public TextField boothresponsibleW;
    public TextField boothplaceW;

    //read booth info
    /*BufferedReader readerbooth = new BufferedReader(new FileReader("C:\\Users\\charl\\OneDrive\\Dokumenter\\GitHub\\Projekt1\\Gitty\\booth.txt"));
    String boothline = readerbooth.readLine();
    String[] boothinfo = boothline.trim().split(" ");
    String namebooth = boothinfo[0]; // name of booth
    String placebooth = boothinfo[1]; // placement of booth
    String responsiblebooth = boothinfo[3]; // responsible of the booth*/

    public void setMainController(Frivillig frivillig){
        this.frivilligApp=frivillig;

    }



    public TableView<ShiftInfo> shifts;


    public TableColumn<ShiftInfo, String> Time;

    public TableColumn<ShiftInfo, String> Place;

    public TableColumn<ShiftInfo, String> Booth;

    public TableColumn<ShiftInfo, String> Admin;

    public Button changeInfoBtn;

    public Label LabelFname;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Time.setCellValueFactory(new PropertyValueFactory<ShiftInfo,String>("time"));
        Place.setCellValueFactory(new PropertyValueFactory<ShiftInfo,String>("place"));
        Booth.setCellValueFactory(new PropertyValueFactory<ShiftInfo,String>("booth"));
        Admin.setCellValueFactory(new PropertyValueFactory<ShiftInfo,String>("admin"));

        ObservableList<ShiftInfo> shift = FXCollections.observableArrayList();


        shifts.setItems(shift);

    }

    public void btnChangeInfoAdmin(ActionEvent actionEvent) {
    }

    /*public void createBooth(ActionEvent actionEvent) throws IOException {
        BufferedWriter boothWriter = new BufferedWriter(new FileWriter("C:\\Users\\charl\\OneDrive\\Dokumenter\\GitHub\\OOP_projekt_1\\booth.txt", true));

        String enteredBoothName;
        String enteredBoothPlace;
        String enteredBoothResp;

        enteredBoothName = boothnameW.getText();
        enteredBoothPlace = boothplaceW.getText();
        enteredBoothResp = boothresponsibleW.getText();

        boothWriter.write("\n" + enteredBoothName + "-" + enteredBoothPlace + "-" + enteredBoothResp);
        //find ud af hvordan man indskriver på den næste tomme linje,,
        boothWriter.close();

    }*/
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

