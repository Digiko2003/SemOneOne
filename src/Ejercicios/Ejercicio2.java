package Ejercicios;//By Diego Arturo Enriquez Mercado
import java.util.Stack;
import java.util.StringTokenizer;

public class Ejercicio2 {
    public static void main (String[] args){
        String lenguaje = "casa perro gato computadora libro";

        Stack<String> Palabras = new Stack<>();
        StringTokenizer st = new StringTokenizer(lenguaje," ");
        while(st.hasMoreTokens()){
            Palabras.add(st.nextToken());
        }
        while(!Palabras.empty()){
            System.out.print(Palabras.pop());
            System.out.print(" ");


        }

    }

    }

