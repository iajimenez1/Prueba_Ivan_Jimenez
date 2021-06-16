
package Dominio;


public class Curso {
    private String nombre;
    private double nota;
    private char sexo;

    public Curso(String nombre, double nota, char sexo) {
        this.nombre = nombre;
        this.nota = nota;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public char getSexo() {
        return sexo;
    }

    @Override
    public String toString(){
        return this.nombre+"  "+this.nota+"   "+this.sexo;
       
    }
}
