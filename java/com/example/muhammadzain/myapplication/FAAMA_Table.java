package com.example.muhammadzain.myapplication;

public class FAAMA_Table {
    private int id;
    private boolean status;


    public FAAMA_Table(int id, boolean status) {
        this.id = id;
        this.status = status;
    }
    public FAAMA_Table(){}


    public int getId() {
        return id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

