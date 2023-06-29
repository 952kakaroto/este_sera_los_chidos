/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.los_chidos.model;

/**
 *
 * @author LENOVO
 */
public class ProductosModel {
     
    private String nombre;
    private double precio;
    private Integer Cantidad;
    private String Descripcion;

    public ProductosModel(String nombre, double precio, Integer Cantidad, String Descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.Cantidad = Cantidad;
        this.Descripcion = Descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return "ProductosModel{" + "nombre=" + nombre + ", precio=" + precio + ", Cantidad=" + Cantidad + ", Descripcion=" + Descripcion + '}';
    }

   
    
    
}
