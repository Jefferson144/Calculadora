/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Jefferson Naravaez
 */
public class ejercicio {

    public static void main(String[] args) {
        final int sueldoBase = 987450 * 2;
        String nom1 = JOptionPane.showInputDialog(null, "Digite el nombre y apellido de la persona 1", "INCOGNITA", JOptionPane.QUESTION_MESSAGE);
        int edad1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la edad de la persona 1", "INCOGNITA", JOptionPane.QUESTION_MESSAGE));
        String nom2 = JOptionPane.showInputDialog(null, "Digite el nombre y apellido de la persona 2", "INCOGNITA", JOptionPane.QUESTION_MESSAGE);
        int edad2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la edad de la persona 2", "INCOGNITA", JOptionPane.QUESTION_MESSAGE));

        if (edad1 > edad2) {
            JOptionPane.showMessageDialog(null, "La persona " + nom1 + " es mayor que " + nom2, "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else if (edad2 > edad1) {
            JOptionPane.showMessageDialog(null, "La persona " + nom2 + " es mayor que " + nom1, "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Las 2 personas poseen la misma edad", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }

        int dia1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el dia de la persona N° 1 en numero", "INCOGNITA", JOptionPane.QUESTION_MESSAGE));
        String pasa = "No";
        while (pasa.equalsIgnoreCase("No")) {
            if (dia1 > 0 && dia1 < 31) {
                pasa = "Si";
            } else {
                JOptionPane.showMessageDialog(null, "El dia debe ser mayor a 0 y menor que 31", "ERROR", JOptionPane.ERROR_MESSAGE);
                dia1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el dia de la persona N° 1 en numero", "INCOGNITA", JOptionPane.QUESTION_MESSAGE));
            }
        }
        pasa = "No";
        int dia2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el dia de la persona N° 2 en numero", "INCOGNITA", JOptionPane.QUESTION_MESSAGE));
        while (pasa.equalsIgnoreCase("No")) {
            if (dia2 > 0 && dia2 < 31) {
                pasa = "Si";
            } else {
                JOptionPane.showMessageDialog(null, "El dia debe ser mayor a 0 y menor que 31", "ERROR", JOptionPane.ERROR_MESSAGE);
                dia2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el dia de la persona N° 2 en numero", "INCOGNITA", JOptionPane.QUESTION_MESSAGE));
            }
        }
        //siguiente algoritmo basado en el mes de junio
        if (dia1 == 7 || dia1 == 14 || dia1 == 21 || dia1 == 28) {
            JOptionPane.showMessageDialog(null, "la persona " + nom1 + " es el dia Lunes", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else if (dia1 == 1 || dia1 == 8 || dia1 == 15 || dia1 == 22 || dia1 == 29) {
            JOptionPane.showMessageDialog(null, "la persona " + nom1 + " es el dia Martes", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else if (dia1 == 2 || dia1 == 9 || dia1 == 16 || dia1 == 23 || dia1 == 30) {
            JOptionPane.showMessageDialog(null, "la persona " + nom1 + " es el dia Miercoles", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else if (dia1 == 3 || dia1 == 10 || dia1 == 17 || dia1 == 24) {
            JOptionPane.showMessageDialog(null, "la persona " + nom1 + " es el dia Jueves", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else if (dia1 == 4 || dia1 == 11 || dia1 == 18 || dia1 == 25) {
            JOptionPane.showMessageDialog(null, "la persona " + nom1 + " es el dia Viernes", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else if (dia1 == 5 || dia1 == 12 || dia1 == 19 || dia1 == 26) {
            JOptionPane.showMessageDialog(null, "la persona " + nom1 + " es el dia Sabado", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "la persona " + nom1 + " es el dia Domingo", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }

        //segunda persona
        if (dia2 == 7 || dia2 == 14 || dia2 == 21 || dia2 == 28) {
            JOptionPane.showMessageDialog(null, "la persona " + nom2 + " es el dia Lunes", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else if (dia2 == 1 || dia2 == 8 || dia2 == 15 || dia2 == 22 || dia2 == 29) {
            JOptionPane.showMessageDialog(null, "la persona " + nom2 + " es el dia Martes", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else if (dia1 == 2 || dia1 == 9 || dia1 == 16 || dia1 == 23 || dia1 == 30) {
            JOptionPane.showMessageDialog(null, "la persona " + nom2 + " es el dia Miercoles", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else if (dia1 == 3 || dia1 == 10 || dia1 == 17 || dia1 == 24) {
            JOptionPane.showMessageDialog(null, "la persona " + nom2 + " es el dia Jueves", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else if (dia1 == 4 || dia1 == 11 || dia1 == 18 || dia1 == 25) {
            JOptionPane.showMessageDialog(null, "la persona " + nom2 + " es el dia Viernes", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else if (dia1 == 5 || dia1 == 12 || dia1 == 19 || dia1 == 26) {
            JOptionPane.showMessageDialog(null, "la persona " + nom2 + " es el dia Sabado", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "la persona " + nom2 + " es el dia Domingo", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }

        //si nacieron el mismo dia
        if (dia1 == dia2) {
            JOptionPane.showMessageDialog(null, "las personas nacieron el mismo dia", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }

        int sueldo1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el sueldo numero N° 1", "INCOGNITA", JOptionPane.QUESTION_MESSAGE));
        pasa = "No";
        while (pasa.equalsIgnoreCase("No")) {
            if (dia1 > 0) {
                pasa = "Si";
            } else {
                JOptionPane.showMessageDialog(null, "Digite un sueldo adecuado", "ERROR", JOptionPane.ERROR_MESSAGE);
                sueldo1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el sueldo 1", "INCOGNITA", JOptionPane.QUESTION_MESSAGE));
            }
        }
        int sueldo2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el sueldo numero N° 2", "INCOGNITA", JOptionPane.QUESTION_MESSAGE));
        pasa = "No";
        while (pasa.equalsIgnoreCase("No")) {
            if (dia1 > 0) {
                pasa = "Si";
            } else {
                JOptionPane.showMessageDialog(null, "Digite un sueldo adecuado", "ERROR", JOptionPane.ERROR_MESSAGE);
                dia1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el sueldo 2", "INCOGNITA", JOptionPane.QUESTION_MESSAGE));
            }
        }

        //aplica o no auxilio de transporte
        //si sueldo es mayor a 2 sueldos vigentes en colombia no aplica
        if (sueldo1 > sueldoBase) {
            JOptionPane.showMessageDialog(null, "No aplica auxilio de transporte para la persona N° 1", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Si aplica auxilio de transporte para la persona N° 1", "EXITO", JOptionPane.INFORMATION_MESSAGE);
        }

        if (sueldo2 > sueldoBase) {
            JOptionPane.showMessageDialog(null, "No aplica auxilio de transporte para la persona N° 2", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Si aplica auxilio de transporte para la persona N° 2", "EXITO", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
