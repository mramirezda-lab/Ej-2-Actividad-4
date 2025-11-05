/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopagina406;

/**
 *
 * @author crisc
 */
public class Vendedor {
    String nombre;
    String apellidos;
    int edad;

    Vendedor(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    void verificarEdad(int edad) {  
        if (edad < 18) {
            throw new IllegalArgumentException("Debe ser mayor de 18 años.");
        }
        if (edad >= 0 && edad < 120) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("Edad inválida (0–120).");
        }
    }
}