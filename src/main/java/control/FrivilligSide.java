package control;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FrivilligSide implements Initializable {

    public control.Frivillig frivilligApp;


    public void setMainController(Frivillig frivillig){
        this.frivilligApp=frivillig;

    }

    //removed @FXML since they know B)
    public TableView<Shift> shifts;

    public TableColumn<Shift, String> Time;

    public TableColumn<Shift, String> Place;

    public TableColumn<Shift, String> Booth;

    public TableColumn<Shift, String> Admin;


    ObservableList<Shift> shift = FXCollections.observableArrayList(
            new Shift("1/5 8:00AM", "Next to concert hall A", "Drink Seller","God"),
            new Shift("1/5 7:00PM", "Ticket Checker B", "Ticket Booth B", "Rogier")
    );

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Time.setCellValueFactory(new PropertyValueFactory<Shift,String>("time"));
        Place.setCellValueFactory(new PropertyValueFactory<Shift,String>("place"));
        Booth.setCellValueFactory(new PropertyValueFactory<Shift,String>("booth"));
        Admin.setCellValueFactory(new PropertyValueFactory<Shift,String>("admin"));

        shifts.setItems(shift);

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

