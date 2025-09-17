package main.java.com.models;

import org.bson.types.ObjectId;
import java.util.Date;

public class Collections {
    private ObjectId _id;   // Primary Key
    private Date date;      // Not Null
    private Double amount;  // Not Null

    // Default constructor
    public Collections() {
    }

    // Parameterized constructor
    public Collections(ObjectId _id, Date date, Double amount) {
        this._id = _id;
        this.date = date;
        this.amount = amount;
    }

    // Getters and Setters
    public ObjectId get_id() {
        return _id;
    }
    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    // toString method
    @Override
    public String toString() {
        return "Collections [_id=" + _id + ", date=" + date + ", amount=" + amount + "]";
    }
}