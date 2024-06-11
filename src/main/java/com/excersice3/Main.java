package com.excersice3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

import com.excersice3.entity.Contactos;

public class Main {
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        int x = 1;
        Scanner varScanner = new Scanner(System.in);
        Scanner varSer = new Scanner(System.in);
        Scanner varName = new Scanner(System.in);
        Scanner varTel = new Scanner(System.in);
        Scanner varCor = new Scanner(System.in);
        List<Contactos> contacts = new ArrayList<>();
        while (x != 0) {
            System.out.println("Bienvenido" + "\n"
                    + "Para agregar un contacto --> 1" + "\n"
                    + "Para mostrar todos los contactos --> 2" + "\n"
                    + "Para buscar un contacto especifio --> 3" + "\n"
                    + "Para eliminar un contacto --> 4" + "\n"
                    + "Para salir --> 0" + "\n");
            x = varScanner.nextInt();
            if (x == 1) {
                System.out.println("Nombre: " + "\n");
                String name = varName.nextLine();
                System.out.println("Telénofo: " + "\n");
                int tel = varTel.nextInt();
                System.out.println("Correo electrónico: " + "\n");
                String Cor = varCor.nextLine();
                Contactos con1 = new Contactos(name, tel, Cor);
                contacts.add(con1);
            } else if (x == 2) {
                for (Contactos r : contacts) {
                    System.out.println(r.getConts());
                }
            } else if (x == 3) {
                System.out.println("Ingrese el nombre de algun contacto: ");
                String Ser = varSer.nextLine();
                for (Contactos r : contacts) {
                    if (r.getNombre().equals(Ser)) {
                        System.out.println(r.getConts());
                    }
                }
            } else if (x == 4) {
                System.out.println("Ingrese el nombre de algun contacto: ");
                String Ser = varSer.nextLine();
                Contactos contactDelete = null;
                for (Contactos r: contacts){
                    if (r.getNombre().equalsIgnoreCase(Ser)) {
                        contactDelete = r;
                        break;
                    }
                }
                if (contactDelete != null) {
                    contacts.remove(contactDelete);
                }
                }
            } 
        }

    }
