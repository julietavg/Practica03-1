/**
 * Clase que modela una casilla para un laberinto.
 * @author Reyes Ramos Luz María, 318211073
 * @author .....
 * @version 1.0 Octubre 2021
 * @since EDD 2022-1 LAB
 */
public class Box {

    /**True si representa una pared, en otro caso representa una casilla
     * para buscar.
     */
    private boolean wall;

    /**True si la casilla fue visitada, en otro caso false */
    private boolean visited;

    /**Queue que almacena números del 0 al 3, insertados aleatoriamente */
    Queue<Box> neighbors;


    /*
     *  Datos de la implementación
     *  visited: Sólo se pueden visitar las casillas que no hayan sido visitadas antes y que no sean 
     *  paredes.
     * 
     *  neighbors: Cada número representará el orden en que se recorrerá al siguiente vecino si es
     *  posible (que no sea pared y que no haya sido visitado antes)
     *  1.- Arriba -->0 
     *  2.- Derecha -->1
     *  3.- Abajo --> 2
     *  4.- Izquierda -->3
     */

    /**
     * Permite saber si una casilla es pared o no.
     * @return true si la casilla es pared, false en otro caso.
     */
     public boolean isWall(){return wall;}
    
    /**
     * Permite saber si una casilla está visitada o no.
     * @return true si la casilla ya fue visitada, false en otro caso.
     */
     public boolean isVisited(){return visited;}

    /**
     * Visita una casilla
     */
     public void visit(){
         //---
     }



    
}
