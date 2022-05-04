package control;

import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class FrivilligSide {
    public Label label1;
    public control.Frivillig frivilligApp;
    public TabPane vagtTab;
    //public ListView shiftList;
    //public TextFlow information;

    public ListView ShiftList;
    public Tab vagtplantab;


    public void setMainController(Frivillig frivillig){
        this.frivilligApp =frivillig;

    }

    public TabPane ShowVagtTab() {

        return vagtTab;
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
