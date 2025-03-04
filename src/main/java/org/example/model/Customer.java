package org.example.model;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Customer implements Serializable {
    private String customerNo;

    private String name;

    private String surname;

    private List<Card> cards = new ArrayList<>();

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+"\n" +
                "Surname: "+this.surname+"\n" +
                "Cards: "+cards.size();
    }
}