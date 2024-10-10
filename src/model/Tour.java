package model;

public class Tour {
    private String tourName;
    private String tourDescription;
    private String tourDate;
    private double price;

    public Tour(String tourName, String tourDescription, String tourDate, double price) {
        this.tourName = tourName;
        this.tourDescription = tourDescription;
        this.tourDate = tourDate;
        this.price = price;
    }

    public Tour() {
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getTourDescription() {
        return tourDescription;
    }

    public void setTourDescription(String tourDescription) {
        this.tourDescription = tourDescription;
    }

    public String getTourDate() {
        return tourDate;
    }

    public void setTourDate(String tourDate) {
        this.tourDate = tourDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
