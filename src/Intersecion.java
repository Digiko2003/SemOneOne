//Diego Arturo Enriquez Mercado
//Metodo 3: Intersecion sobre dicho arreglo
class main{
    public static void main(String[] args) {
        int[]arreglo={42,52,82,72,60,69,68,19,58,69,55,34,42,84,79,22,34,18,33,21,32,80,15,96,33,27,46,0,48,90,99,14,92,81,52,78,82,39,66,31,28,32,92,46,54,56,16,24,44,49,30,33,18,43,55,31,40,79,47,84,73,77,34,77,18,75,57,37,69,52,69,34,20,22,50,14,81,69,38,37,76,52,25,71,55,57,29,22,90,20,55,39,18,20,72,98,53,76,39,51,81,};
        Ordenamiento metodo = new Ordenamiento(arreglo);
        System.out.println("Arreglo original:");
        metodo.imprimir();
        metodo.ordenar();
        System.out.println("Arreglo ordenado: ");
        metodo.imprimir();
    }
}
class Ordenamiento{
    private int[] x;
    private int n;

    public Ordenamiento(int[] x) {
        this.x = x;
        n=this.x.length;
    }
    public void ordenar(){
        //--------
        int aux;
        int k;
        for(int i=0;i<n-2;i++){
            aux=x[i];
            k=i;
            for(int j=i;j<n-1;j++){
                if(x[j]<aux){
                    aux=x[j];
                    k=j;
                }
            }
            x[k]=x[i];
            x[i]=aux;
        }
        //--------
    }
    public void imprimir(){
        for(int j=0; j <= n -1; j++){
            if(j%45==0) System.out.println();
            System.out.print(" "+x[j]);
        }
        System.out.println();
    }
}