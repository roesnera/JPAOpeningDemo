package com.example.JPAOpeningDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Candy {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Double price;
    private String flavor;

    public Candy(Integer id, String name, Double price, String flavor) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.flavor = flavor;
    }

    public Candy() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Candy candy)) return false;
        return Objects.equals(id, candy.id) && Objects.equals(name, candy.name) && Objects.equals(price, candy.price) && Objects.equals(flavor, candy.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, flavor);
    }

    @Override
    public String toString() {
        return "Candy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", flavor='" + flavor + '\'' +
                '}';
    }
}
