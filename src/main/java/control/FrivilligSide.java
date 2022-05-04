package control;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FrivilligSide {
    //public Label label1;
    public control.Frivillig frivilligApp;
    //public TableColumn boothCollum;


    //public TableView Shift;



    public void setMainController(Frivillig frivillig){
        this.frivilligApp =frivillig;

    }

    public void vagtplantab() throws IOException {
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




        }




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
}
