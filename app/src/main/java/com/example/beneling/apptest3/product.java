package com.example.beneling.apptest3;

public class product {
    private int id;
    private String title;
    private String shortdesc;
    private int image;
    private int biodatanya;

    public product(int id, String title, String shortdesc, double rating, double price, int image, int biodatanya) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.image = image;
        this.biodatanya = biodatanya;

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }


    public int getImage() {
        return image;
    }

    public int getBiodatanya(){
        return biodatanya;
    }

}
