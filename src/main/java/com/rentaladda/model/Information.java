package com.rentaladda.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Rentaladda_Information")
public class Information {

    @Id
    public String id;

    public String name;
    public String text;

    public Information(String id, String name, String text) {
        this.id = id;
        this.name = name;
        this.text = text;
    }

    public Information(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public Information() {
    }

    public Information(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public String toString() {
        return "Information{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
