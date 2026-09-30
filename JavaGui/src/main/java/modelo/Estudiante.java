/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author drogg
 */
public class Estudiante {

    private String nombre;
    private double nota1;
    private double nota2;
    

    public Estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularDefinitiva() {
        double resultado = (nota1 + nota2) / 2.0;
        return resultado;
    }

    public String obtenerEstado() {
if (calcularDefinitiva() >=3.0){
    String estado= "aprobado";
    return estado;
}
else{
    String estado = "no aprobado";
    return estado;
}
    }
}
