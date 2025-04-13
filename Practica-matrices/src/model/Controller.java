package model;

import model.SalaCine;


public class Controller {

    private SalaCine cinemark; // Declarando sala de cine
    private MatrizNumerica matriz1;
    private MatrizNumerica matriz2;

    /**
     * Constructor de la clase Controller para inicializar 
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Controller 
     */
    

    

    public Controller() {
        
        

    }

 public void inicializarMatriz1(int numfilas, int numcolumnas){
    matriz1 = new MatrizNumerica(numfilas, numcolumnas);
}
public void inicializarMatriz2(int numfilas, int numcolumnas){
    matriz2 = new MatrizNumerica(numfilas, numcolumnas);
}

    public void inicialiceSala() {
        cinemark = new SalaCine(7,7);
    }

    public String mostrarSala() {
        return cinemark.toString();
    }

    public void comprarSilla(int fila, int asientoEnFila) {
        cinemark.reservarAsiento(fila, asientoEnFila);
    }

    public int cantidadFilas() {
        return cinemark.retornarCantFilas();
    }

    public int cantidadColumnas() {
        return cinemark.retornarCantColumnas();
    }

    public MatrizNumerica getMatriz1() {
        return matriz1;
    }
    public MatrizNumerica getMatriz2() {
        return matriz2;
    }
    




}
