package ru.netology.model;

public class Order {
    private int id;
    private int userId;
    private double orderAmount;
    private String currencyOrder;
    private OrderItems orderItems;


    public Order(int id, int userId, double orderAmount, String currencyOrder, OrderItems orderItems) {
        this.id = id;
        this.userId = userId;
        this.orderAmount = orderAmount;
        this.currencyOrder = currencyOrder;
        this.orderItems = orderItems;
    }

    public Order() {
    }


    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public String getCurrencyOrder() {
        return currencyOrder;
    }

    public OrderItems getOrderItems() {
        return orderItems;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public void setCurrencyOrder(String currencyOrder) {
        this.currencyOrder = currencyOrder;
    }

    public void setOrderItems(OrderItems orderItems) {
        this.orderItems = orderItems;
    }
}
