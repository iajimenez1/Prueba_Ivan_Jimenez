
package test;

import Dominio.Curso;

public class PruebaCurso {
    public static void main(String[] args) {
        String nombre;
        double nota;
        Curso[] clase;
        int n= 3;
        Curso[] Curso = new Curso[n];
        llenaDatos(Curso);
        System.out.println("Datos Almacenados: ");
        for(int i=0;i<Curso.length;i++){
            System.out.println(Curso[i]);
        }
               
    }
    public static void llenaDatos(Curso cur[]){
        String nombre;
        char sexo;
        double nota;
        for(int i=0;i<cur.length;i++){
            System.out.println("Nombre : ");
            nombre = datos.nextLine();
            System.out.println("Sexo: ");
            sexo = datos.nextInt();
            System.out.println("Nota: ");
            nota = datos.nextDouble();
            cur[i]= new Curso(nombre,sexo,nota);
            //limpia el buffer
            datos.nextLine();
        }
        
    }
}
