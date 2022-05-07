package control;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.event.ActionEvent;


import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class FrivilligSide implements Initializable {

    public control.Frivillig frivilligApp;



    public void setMainController(Frivillig frivillig){
        this.frivilligApp=frivillig;

    }

    public TableView<ShiftInfo> shifts;

    public TableColumn<ShiftInfo, String> Time;

    public TableColumn<ShiftInfo, String> Place;

    public TableColumn<ShiftInfo, String> Booth;

    public TableColumn<ShiftInfo, String> Admin;

    public Button changeInfoBtn;

    public Label LabelFnameFri;
    public Label LabelLnameFri;

 public void load() throws FileNotFoundException {
     BufferedReader readerPInfo = new BufferedReader(new FileReader("C:\\Users\\charl\\OneDrive\\Dokumenter\\GitHub\\OOP_projekt_1\\coworker.txt"));
     try {
         String readPInfolines;
         readPInfolines=readerPInfo.readLine();

         while(readPInfolines!=null) { //ready from

             String[] infosplit = readPInfolines.trim().split("\\s+");
             String mailfromtxt = infosplit[0]; // mail
             String codefromtxt = infosplit[1]; // code
             String rolefromtxt = infosplit[2]; // role
             String fnamefromtxt = infosplit[3]; // first name
             String lnamefromtxt = infosplit[4]; // last name

             LabelFnameFri.setText(fnamefromtxt);
             LabelLnameFri.setText(lnamefromtxt);

         }

     } catch (FileNotFoundException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     }
 }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        Time.setCellValueFactory(new PropertyValueFactory<ShiftInfo,String>("time"));
        Place.setCellValueFactory(new PropertyValueFactory<ShiftInfo,String>("place"));
        Booth.setCellValueFactory(new PropertyValueFactory<ShiftInfo,String>("booth"));
        Admin.setCellValueFactory(new PropertyValueFactory<ShiftInfo,String>("admin"));


        ObservableList<ShiftInfo> shift = FXCollections.observableArrayList(new ShiftInfo());
        shifts.setItems(shift);


    }



    public void btnChangeInfo(ActionEvent actionEvent){


    }








/*    public void btnPress(ActionEvent actionEvent) throws IOException {

        frivilligApp.AnsvarligSide();

    }*/

        //Her er der vagtoversigt siden

            //læser fra dokument med buffered reader
    //tjekker hver linje i dokumentet, gemmer det i et string array
    //loopet har jeg lavet så den læser hver linje og vi mangler at kunne få indsat, så man kan se det

    /*public void vagtplantab() throws IOException {
        BufferedReader readershift = new BufferedReader(new FileReader("booth.txt"));
        String shiftline = readershift.readLine();
        //read first line

        while(shiftline!=null){


            String[] shiftinfo = shiftline.trim().split(" ");
            String fname = shiftinfo[0]; // first name
            String lname = shiftinfo[1]; // last name
            String begintime = shiftinfo[2]; // begin time of the shift
            String location = shiftinfo[3]; //location of the boof
            String length = shiftinfo[4]; //leangth of shift
            String boothname = shiftinfo[5]; //name of booth

            //læser fra dokumentet og splitter ordene op now <3 <3




        }*/




}
    //shiftList.add

    //shiftList.addAll("1","2","3");


    //textflow part

    /* public void oplysninger?ButtonPushed()
     {
        String textAreaString = "";
        ObservableList listOfItems = listView.getSelectionModel().getSelectedItems();
        for (Object item : listOfItems)
        {
            textAreaString += String.format("%s%n",(String) item);
        }
        this.golfTextArea.setText(textAreaString);
     }*/


    //se vagtplan
    /*
    - adgang til shift fil (info om vagt er heri)
    -
     */

    //ændre stamoplysninger
    /*
    - adgang til coworker fil
    -
     */

