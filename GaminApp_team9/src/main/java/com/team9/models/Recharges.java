package com.team9.models;

public class Recharges {
    private String id;
    private String memberId;
    private Double amount;
    private String dateTime;

    public Recharges() {
    }

    public Recharges(String id, String memberId, Double amount, String dateTime) {
        this.id = id;
        this.memberId = memberId;
        this.amount = amount;
        this.dateTime = dateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Recharges [id=" + id + ", memberId=" + memberId + ", amount=" + amount + ", dateTime=" + dateTime + "]";
    }
}
