package control;

//Get and set info about shifts

public class Shift {
    private String time;
    private String place;
    private String booth;
    private String admin;

    public Shift(String time, String place, String booth, String admin) {
        this.time = time;
        this.place = place;
        this.booth = booth;
        this.admin = admin;
    }

    public String getTime() {
        return time;
    }

    public String getPlace() {
        return place;
    }

    public String getBooth() {
        return booth;
    }

    public String getAdmin() {
        return admin;
    }
}
