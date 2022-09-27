import java.util.Scanner;
public class Edades{
    static int valores[];
    public static void main(String args[]){
        valores=new int[5];
        valores[0]=2;
        valores[1]=4;
        valores[2]=6;
        valores[3]=8;
        valores[4]=10;
        imprimirArreglo();
    }
    public static void imprimirArreglo(){
        for(int i=0; i<=4; i++){
            System.out.println(valores[i]);
        }
    }
}
