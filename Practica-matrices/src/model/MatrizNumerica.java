package model;
public class MatrizNumerica{

    private int[][] matriz;
    private int cantfilas;
    private int cantcolumnas;


    public MatrizNumerica(int filas, int columnas){
        cantfilas= filas;
        cantcolumnas=columnas;
        this.matriz= new int[filas][columnas];
    }

    public void insertarvalor(int i, int j,int valor){
        matriz[i][j]= valor;
    }
    public int[][] getMatriz(){
        return matriz;
    }
  public int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
    int[][] resultado = new int[cantfilas][cantcolumnas];
    for (int i = 0; i < cantfilas; i++) {
        for (int j = 0; j < cantcolumnas; j++) {
            resultado[i][j] = matriz1[i][j] + matriz2[i][j];
        }
    }
    return resultado;
}}
