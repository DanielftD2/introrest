/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.unipiloto.testws.services;

import java.util.Map;
import com.edu.unipiloto.testws.Persona;
import com.edu.unipiloto.testws.SalarioTotal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author User
 */

@Path("service")
public class Service {

    private static Map<Integer, Persona> persons = new HashMap<>();
    private static Map<Integer, Double> salariosuma = new HashMap<>();

    static {
        int count = 0;
        for (int i = 0; i <= 10; i++) {
            Persona persona = new Persona();
            int id = i + 1;
            count++;
            persona.setId(id);
            persona.setFullname("Mi persona: " + id);
            persona.setAge(new Random().nextInt(20 + id));
            persons.put(id, persona);
        }
    }
    
    @GET
    @Path("/getAllPersonsInJSON")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Persona> getAllPersonsInJSON() {
        
        return new ArrayList<Persona>(persons.values());
    }
    
    @POST
    @Path("/addAllPersonsInJSON")
    public List<Persona> addAllPersonsInJSON(List<Persona> pr) {
        for (Persona persona : pr) {
            persons.put(persona.getId(), persona);
        }
        return new ArrayList<Persona>(persons.values());
        
    }
    
    @GET
    @Path("/getAllPersonsInXML")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public List<Persona> getAllPersonsInXML() {        
        System.out.println("hola");
        return new ArrayList<Persona>(persons.values());
    }
    
    @GET
    @Path("/getSumaSalarioInJSON")
    @Produces(MediaType.APPLICATION_JSON)
    public SalarioTotal getSumaSalarioInJSON() {
        int sumaSalario = 0;
        for (Persona persona : persons.values()) {
            sumaSalario += persona.getSalario();
        }    
        return new SalarioTotal(sumaSalario);
    }
    
    
    @GET
    @Path("/getSumaPromedioSalarioInXML")
    @Produces(MediaType.APPLICATION_XML)
    public SalarioTotal getSumaPromedioSalarioInXML() {
        int sumaSalario = 0;
        for (Persona persona : persons.values()) {
            sumaSalario += persona.getSalario();
        }    
        sumaSalario=sumaSalario/persons.size();
        return new SalarioTotal(sumaSalario);
    }
    
    /*
    
    @GET
    @Path("/getSumaSalarioInJSON")
    @Produces(MediaType.APPLICATION_XML)
    public SalarioTotal getSumaPromedioSalarioInXML() {
        int sumaSalario = 0;
        for (Persona persona : persons.values()) {
            sumaSalario += persona.getSalario();
        }    
        sumaSalario=sumaSalario/persons.size();
        return new SalarioTotal(sumaSalario);
    }
    
    @GET
    @Path("/getpromedioSalarioinXML")
    @Produces(MediaType.APPLICATION_XML)
    public  List<Persona> getpromedioSalarioinXML(List<Persona> pr){
        double salario = 0;
        int contador = 1;
       for (Persona persona: pr) {
          salario += persona.getSalario();
          salario = salario/contador;
           persona.setSalariopromedio(salario);   
           persons.replace(persona.getId(), persona);
           contador++;
        }
        return new ArrayList<Persona>(persons.values());
        
    }
    
    
     */

    private SalarioTotal SalarioTotal(double sumaSalario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
