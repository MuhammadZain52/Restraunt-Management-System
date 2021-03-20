package com.example.muhammadzain.myapplication;

import java.util.ArrayList;

public class FAAMA_Waiter {

    private int waiterId;
    private String waiterName;
    private ArrayList<Integer> assignedTables;

    public FAAMA_Waiter(){}
    public FAAMA_Waiter(int waiterId, String waiterName, ArrayList<Integer> assignedTables) {
        this.waiterId = waiterId;
        this.waiterName = waiterName;
        this.assignedTables = assignedTables;
    }

    public int getWaiterId() {
        return waiterId;
    }

    public String getWaiterName() {
        return waiterName;
    }

    public ArrayList<Integer> getAssignedTables() {
        return assignedTables;
    }


    public void setWaiterId(int waiterId) {
        this.waiterId = waiterId;
    }

    public void setWaiterName(String waiterName) {
        this.waiterName = waiterName;
    }

    public void setAssignedTables(ArrayList<Integer> assignedTables) {
        this.assignedTables = assignedTables;
    }
}
