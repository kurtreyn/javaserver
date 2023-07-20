package com.server.javaserver.model;

import jakarta.persistence.*;

@Entity // annotation indicates that the class is a persistent Java class.
@Table(name = "tutorials") // annotation provides the table that maps this entity.
public class Tutorial {

    @Id // annotation is for the primary key.
    @GeneratedValue(strategy = GenerationType.AUTO) // @GeneratedValue annotation is used to define generation strategy for the primary key. GenerationType.AUTO means Auto Increment field.
    private long id;
    @Column(name = "title") //  annotation is used to define the column in database that maps annotated field.
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    // default constructor
    public Tutorial() {

    }

    // constructor with parameters
    public Tutorial(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean isPublished) {
        this.published = isPublished;
    }

    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }

}
