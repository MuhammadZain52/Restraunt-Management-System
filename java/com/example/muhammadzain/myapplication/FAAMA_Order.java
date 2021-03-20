package com.example.muhammadzain.myapplication;

public class FAAMA_Order {
    private int orderId;

    private int tableNo;

    private String dishName;

    private int Priority;



    public FAAMA_Order(){}

    public FAAMA_Order(int orderId, int tableNo, String dishName, int priority) {
        this.orderId = orderId;
        this.tableNo = tableNo;
        this.dishName = dishName;
        Priority = priority;
    }


    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public void setPriority(int priority) {
        Priority = priority;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getTableNo() {
        return tableNo;
    }

    public String getDishName() {
        return dishName;
    }

    public int getPriority() {
        return Priority;
    }

}
