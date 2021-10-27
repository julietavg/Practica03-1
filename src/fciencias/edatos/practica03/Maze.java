/**
 * Clase que representa un laberinto.
 * @author Reyes Ramos Luz María, 318211073
 * @author -----
 * @version 1.0 Octubre 2021
 * @since EDD 2022-1 LAB
 */
public class Maze {

    /** Representación del tablero del laberinto; Almacena las casillas */
    Box[][] mazeBoard;

    /**Casilla de inicio */ /* Determina el inicio del recorrido del laberinto, debe ser una casilla que no es pared */
    Box inicio;

    /**Casilla de fin de recorrido  */ /* Determina la casilla objetivo o el final del laberinto,
     * cuando se encuentra un recorrido desde el inicio hasta esta casilla entonces el laberinto tiene solución.
     */
    Box fin;
    
    /**Casila actual del recorrido */ /* Corresponde a la casilla del recorrido actual. Cuando se extiende un s, esta 
      *esta casilla es la que se actualiza, modificando el valor de la casilla actual después del cambio para s*/
    Box actual;



    /**
     * Define si el laberinto está resuelto.
     * @return true si esta resuelto, false en otro caso.
     */
    public boolean isSolution(){
        return false;
    }

    /**
     * Regresa true si la casilla actual tiene vecinos que verificar. El vecino proximo a 
     * verificar es aquel resultante del método peek() del atributo neighbors de la casilla actual.
     * @return true si actual si tiene vecinos por visitar, false en otro caso.
     */
    public boolean isExtensible(){
        return false;
    }

    /**
     * Mueve la casilla actual a una casilla vecina que no sea pared y no haya sido visitada.
     * Esta casilla se elige a partir del método poll() del atributo neighbors de la casilla actual.
     */
    public void extend(){
        //----
    }


    // ***FALTA SOLVE **
}

