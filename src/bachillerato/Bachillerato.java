/*
 *Leer los siguientes datos de los alumnos de una escuela: Número de control, Nivel, Especialidad. Calcular lo siguiente:

a)	Cuántos alumnos son de bachillerato
b)	Cuántos alumnos son de profesional
c)	Cuántos alumnos son de maestría
d)	Cuántos alumnos son de sistemas

 */
package bachillerato;

import java.util.Scanner;

/**
 *
 * josselyne ester chilito galindez  codigo:20201187434
 */
public class Bachillerato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
       int nivel, Nestudiantes,bachillerato=0, profesional=0, mastria=0, sistemas=0;
       long Ncontrol;
       String especialidad;
       
       System.out.println("diguite el numero de estudiantes: ");
        Nestudiantes = entrada.nextInt();
        
       for (int c=1;c<=Nestudiantes;c++){
           System.out.println("ingrese el numero de control(codigo) #"+c);
            Ncontrol = entrada.nextLong();
           System.out.println("ingrese el nivel en el cual se encuentre(semestre)");
            nivel = entrada.nextInt();
            
       
        System.out.println("¿cual es su especialidad en la U?");
         especialidad = entrada.next();
        
        if ( "bachillerato".equals(especialidad)){
            bachillerato++;
        } 
        else if ( "profesional".equals(especialidad)){
            profesional++;
        } 
        else if ( "mastria".equals(especialidad)){
            mastria++;
        } 
        else if ( "sistemas".equals(especialidad)){
            sistemas++;
        } 
        }
        
        System.out.println("el numero de alumnos en bachillerato es de: "+bachillerato);
        System.out.println("el numero de alumnos en profesional es de: "+profesional);
        System.out.println("el numero de alumnos en mastria es de: "+mastria);
        System.out.println("el numero de alumnos en sistemas es de: "+sistemas);

    }
    
    
}
    


