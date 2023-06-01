/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.tarea6;

/**
 *
 * @author Fomento Ocupacional
 */
public class Tarea6EDClase {
     public void aplicarDescuento(double precioProducto, int numProductos){     double total;
    if(numProductos>3)
        precioProducto-=CTE0;
            if (numProductos!=0){
            total = precioProducto*CTE1;
            impresion(total);
        }else {
            total = precioProducto*CTE2;
            impresion(total);
        }   

    } 

    private void impresion(double total) {
        System.out.println("El total a pagar es:"+total);
        System.out.println("Enviado");
    }
    private static final int CTE0 = 5;
    private static final double CTE2 = 0.95;
    private static final double CTE1 = 0.8;
}
