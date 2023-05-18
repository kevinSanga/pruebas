public class ColaDeNumeros {
    private int max;
    private int ini;
    private int fin;
    private int[] numeros;

    public ColaDeNumeros() {
        this.max = 10;
        this.ini = 0;
        this.fin = 0;
        this.numeros = new int[this.max + 1];
    }

    public boolean esVacia(){
        if (ini == 0 && fin == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean esLlena(){
        if (fin == max){
            return true;
        }
        else {
            return false;
        }
    }

    public void Adicionar() {
        int numeroNumeros =0;
        if (esLlena()){
            System.out.println("cola llena");

        }
        else
        {
            fin = fin+1;
                    numeros[fin] = numeroNumeros;
        }
    }

    public int eliminar() {
       int elemento = 0 ;
        if (esVacia()){
            System.out.println("cola esta vacia");

        }
        else
        {
            ini = ini +1;
            elemento = numeros[ini];
            if (ini == fin){
                ini = 0;
                fin = 0;

            }
        }
        return elemento;
    }


    public int nroElementos()
    {
        return this.fin - ini;
    }

    public void vaciar(ColaDeNumeros cola)
    {
       // while (!cola.esVacia()){
         //   Adicionar(cola.eliminar());


    }
    public void Mostrar()
    {
        if(esVacia()){
            System.out.println("cola vacia, no hay ITEM");

        } else {
            int elemEliminado;
            System.out.println("mostrando los datos de cola");
            ColaDeNumeros aux = new ColaDeNumeros();
            while (!esVacia()){
                elemEliminado = eliminar();
                System.out.println("valor:" + elemEliminado);
                aux.Adicionar();
            }
            vaciar(aux);
        }


    }

}
