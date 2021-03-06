/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.model;

/**
 *
 * @author joser
 */
public class Student {
    
    private String name;
    private String lastName;
    private String id; //matricula
    
    public Student() {
        
    }

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    
    //para metodos de acceso alt e insert
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return String.format("id=%s\n,name=%s\n,lastName=%s", id, name, lastName);
    }
    
}
