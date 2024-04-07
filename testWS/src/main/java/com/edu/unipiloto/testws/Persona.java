/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.unipiloto.testws;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author User
 */
@XmlRootElement(name = "persona")
@XmlType(propOrder = {"id","fullname","age","salario"})
public class Persona {
    private int id;
    private String fullname;
    private int age;
    private int salario;
    private static int salariomin = 3600 ;



    @XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @XmlElement
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @XmlElement
    public int getSalario() {
        return salario = (getAge()*salariomin)/3;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
   
    
    
    
 
   
    
}
