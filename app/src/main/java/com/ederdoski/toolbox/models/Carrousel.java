package com.ederdoski.toolbox.models;

import java.util.ArrayList;

public class Carrousel {

    private String title;
    private String type;
    private ArrayList<Movies> items;

    public Carrousel(String title, String type, ArrayList<Movies> items) {
        this.title = title;
        this.type  = type;
        this.items = items;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Movies> getItems() {
        return items;
    }

    public void setItems(ArrayList<Movies> items) {
        this.items = items;
    }
}
