package com.company;

import com.company.banco.CuentaBancaria;
import com.company.ejercicioEncapsulamiento.Person;
import com.company.paquete2.Animal;

public class Main {

    public static void main(String[] args) {

        Person person= new Person("Santiago", 33, "102045455");
        System.out.println( "Name: " + person.getName());
        System.out.println( "Age: "+ person.getAge());
        System.out.println( "Id: " +  person.getId());

        /*CuentaBancaria cuentaBancaria = new CuentaBancaria();
        cuentaBancaria.setNombre("Rosa");
        cuentaBancaria.setClave("fs43j3434s");
        cuentaBancaria.setSaldo(1000000000);

        System.out.println(cuentaBancaria.getNombre());
        cuentaBancaria.mostrarSaldo();*/

        /*Animal animal = new Animal();
        animal.nombre = "Iguana";*/

        /*Persona persona = new Persona();
        persona.nombre = "Niver";
        persona.edad = 31;*/
    }
}
