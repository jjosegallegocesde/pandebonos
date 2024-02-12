package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String cedula;
        LocalDate fecha=LocalDate.now();
        String nombresCliente;

        String nombreEmpleado;
        String contrasenaEmpleado;
        String nombreEmpleadoBD="admin";
        String contrasenaEmpleadoBD="admin123";

        Integer opcion;
        Scanner lea = new Scanner(System.in);

        System.out.println("****Pandebonos Nairo****");
        System.out.println("************************");
        System.out.println("Apreciado empleado, inicie sesión por favor: ");
        boolean loginExitoso = false;

        while (loginExitoso==false) {

            System.out.print("Digite su usuario: ");
            nombreEmpleado = lea.nextLine();
            System.out.print("Digite su contraseña: ");
            contrasenaEmpleado = lea.nextLine();
            //login
            if (nombreEmpleado.equals(nombreEmpleadoBD) && contrasenaEmpleado.equals(contrasenaEmpleadoBD)) {
                System.out.println("Cargando sistema.....");
                loginExitoso= true;
            } else {
                System.out.println("Usuario incorrecto");

            }
        }

        System.out.println("\n.....pandesoftware....");
        System.out.println("1. Registrar compra");
        System.out.println("2. Calcular total");
        System.out.println("3. Modificar compra");
        System.out.println("4. salir");
        do{
            System.out.print("Selecciones una opcion: ");
            opcion=lea.nextInt();

            Integer cantidadTradicional=0;
            Integer cantidadGuayaba=0;
            Integer cantidadArequipe=0;
            Integer cantidadQuesos=0;
            Integer cantidadBebidas=0;

            Integer productoSeleccionado;
            switch(opcion){
                case 1:
                    System.out.println("1. Pandebono Tradicional ($8000)");
                    System.out.println("2. Pandebono Guayaba ($9500)");
                    System.out.println("3. Pandebono Arequipe ($12000)");
                    System.out.println("4. Pandebono 7 quesos ($20000)");
                    System.out.println("5. Bebida (9500)");
                    System.out.println("6. Terminar pedido");
                    System.out.println(".................................");

                    do{
                        System.out.print("Digite producto deseado: ");
                        productoSeleccionado=lea.nextInt();
                        switch (productoSeleccionado){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            default:
                                break;

                        }
                    }while(productoSeleccionado!=6);

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }


        }while(opcion !=4);





    }
}