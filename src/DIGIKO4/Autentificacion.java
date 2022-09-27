package DIGIKO4;

import java.util.Scanner;

public class Autentificacion {
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);
        String user= "joseg";
        String pass= "laBeca123";
        boolean autentificado = false;
        int intentos= 0;
        System.out.println("Programa de autentificacion basico");
        do{
            System.out.println("Usuario: ");
            String usuario = entrada.next();
            System.out.println("Contraseña: ");
            String password= entrada.next();
            //Verifica que los daros sean iguales
            if(usuario.equals(user) && password.equals(pass)){
                autentificado = true;
            }else{
                intentos++;
                System.out.println("Usuario y/o contraseña incorrectos");
                System.out.println("Intentos" + intentos + "de 3");
                System.out.println();
            }
        }while (intentos<3 && !autentificado);
        if (intentos == 3 && !autentificado) {
            System.out.println("******************Intentos excedidos************************");
            return;
        }
        System.out.println("Bienvenido");
    }
}
