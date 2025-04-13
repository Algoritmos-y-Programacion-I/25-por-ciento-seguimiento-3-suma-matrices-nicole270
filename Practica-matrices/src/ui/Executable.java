package ui;

import java.util.Scanner;
import model.Controller;


public class Executable {

    //private Scanner reader;
    private Controller cont;
    private Scanner escaner;


    /**
     * Constructor de la clase Executable para inicializar el lector de entrada y el
     * controlador.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Executable y se inicializan el lector de
     *       entrada y el controlador.
     */
    public Executable() {
        //reader = new Scanner(System.in);
        cont = new Controller();
        escaner = new Scanner(System.in);
        
    }

    /**
     * Ejecuta el programa principal de gestión de colegios.
     *
     * @pre El método debe ser llamado dentro de un contexto válido.
     * @post El programa se ejecuta y permite al usuario interactuar con las
     *       opciones disponibles.
     * @return void Este método no retorna ningún valor.
     */

    public void run() {
   System.out.println("Ingrese el numero de filas de la matriz 1:");
int numfilas = escaner.nextInt();
System.out.println("Ingrese el numero de columnas de la matriz 1:");
int numcolumnas = escaner.nextInt();
escaner.nextLine();

cont.inicializarMatriz1(numfilas, numcolumnas);

    
        System.out.println("Ingrese los valores de la matriz 1");
        for(int i=0; i<numfilas; i++){
            for(int j=0; j<numcolumnas;j++){
                System.out.println("Ingrese datos en fila: " + i +" y columna: " +j +":");
                int valor= escaner.nextInt();
                escaner.nextLine();
                cont.getMatriz1().insertarvalor(i,j,valor);
            }
        }

        for(int i=0; i<numfilas; i++){
            for(int j=0; j<numcolumnas;j++){
                
                System.out.print(cont.getMatriz1().getMatriz()[i][j] + " ");
                
            }
            System.out.println();
        }

     System.out.println("Defina el numero de filas de la matriz 2:");
numfilas = escaner.nextInt();
System.out.println("Defina el numero de columnas de la matriz 2:");
numcolumnas = escaner.nextInt();
escaner.nextLine();

cont.inicializarMatriz2(numfilas, numcolumnas);
    

    

        System.out.println("Ingrese los valores de la matriz 2");
        for(int i=0; i<numfilas; i++){
            for(int j=0; j<numcolumnas;j++){
                System.out.println("Ingrese datos en fila: " + i +" y columna: " +j +":");
                int valor= escaner.nextInt();
                escaner.nextLine();
                cont.getMatriz2().insertarvalor(i,j,valor);
            }
        }

        for(int i=0; i<numfilas; i++){
            for(int j=0; j<numcolumnas;j++){
                System.out.print(cont.getMatriz2().getMatriz()[i][j] + " ");
                
            }
            System.out.println();
        }

    // Mostrar resultado

        int[][] resultadoSuma = cont.getMatriz2().sumarMatrices(
        cont.getMatriz1().getMatriz(), 
        cont.getMatriz2().getMatriz()
    );

    // Mostrar el resultado de la suma
    System.out.println("Resultado de la suma de las matrices:");
    for (int i = 0; i < resultadoSuma.length; i++) {
        for (int j = 0; j < resultadoSuma[i].length; j++) {
            System.out.print(resultadoSuma[i][j] + " ");
           
        }
        System.out.println();
    }
  

}

          

        
    


    /**
     * Método principal (main) para iniciar la ejecución del programa.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Executable y se ejecuta el programa principal.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este
     *             caso).
     */
    public static void main(String[] args) {

        Executable mainApp = new Executable();
        mainApp.run();

    }}

