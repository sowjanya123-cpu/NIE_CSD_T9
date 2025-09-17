package main.java.com.models;

public class Games {
    private String id;
    private String name;
    private Double price;
    private String description;

    // Default constructor
    public Games() {
    }

    // Parameterized constructor
    public Games(String id, String name, Double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    // Optional: toString method for easy printing
    @Override
    public String toString() {
        return "Games [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + "]";
    }
}
