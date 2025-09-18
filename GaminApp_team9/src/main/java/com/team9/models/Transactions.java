package com.team9.models;

public class Transactions {
    private String id;
    private String memberId;
    private String gameId;
    private Double amount;
    private String dateTime;

    public Transactions() {
    }

    public Transactions(String id, String memberId, String gameId, Double amount, String dateTime) {
        this.id = id;
        this.memberId = memberId;
        this.gameId = gameId;
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

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
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
        return "Transactions [id=" + id + ", memberId=" + memberId + ", gameId=" + gameId + ", amount=" + amount + ", dateTime=" + dateTime + "]";
    }
}
