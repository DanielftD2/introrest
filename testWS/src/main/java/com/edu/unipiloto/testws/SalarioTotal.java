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

@XmlRootElement(name = "Salario")
@XmlType(propOrder = {"sumaSalario"})
public class SalarioTotal {
    private int sumaSalario;

    // JAXB necesita un constructor sin argumentos
    public SalarioTotal() {
    }

    public SalarioTotal(int sumaSalario) {
        this.sumaSalario = sumaSalario;
    }

    @XmlElement
    public double getSumaSalario() {
        return sumaSalario;
    }

    public void setSumaSalario(int sumaSalario) {
        this.sumaSalario = sumaSalario;
    }
}
