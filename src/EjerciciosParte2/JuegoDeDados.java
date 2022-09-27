package EjerciciosParte2;

public class JuegoDeDados {
    public static void main(String[] args) {
        System.out.println("Lanzando dados: ");

            System.out.println("Oedenador: ");
            Dado dado1 = new Dado(6*10);
            dado1.lanzar();
            System.out.println(dado1.obtenerValor());

            System.out.println("Usuario: ");
            Dado dado2 = new Dado(6*10);
            dado2.lanzar();
            System.out.println(dado2.obtenerValor());

            if(dado1.obtenerValor() > dado2.obtenerValor()) {
                System.out.println("El ganador es el ORDENADOR");
            }
            if(dado1.obtenerValor() < dado2.obtenerValor()) {
                System.out.println("El ganador es el USUARIO");
            }
            if(dado1.obtenerValor() == dado2.obtenerValor()){
                System.out.println("No hay ganador");
            }
    }
}
