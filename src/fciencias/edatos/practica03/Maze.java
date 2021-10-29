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

    /**Representan las coordenadas de incio y fin de las casillas en mazeBoard */ //se le solicitaran al usuario
    private int[] coordInicio, coordFin;



    /**
     * Constructor del tablero del laberinto
     * @param file el archivo que contiene los datos del tablero.
     */
    public Maze (String file){
        ArrayReader ar = new ArrayReader();
        mazeBoard = ar.readMatrix(file); //Crear tablero a partir de lectura de archivo
        //actual =  mazeBoard[coordInicio[0]][coordInicio[1]]; //inicio = actual al principio del laberinto.
        actual =  mazeBoard[0][5]; //inicio = actual al principio del laberinto.

    }
    
    
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
    public  String toString(){
        Box casilla = null;
        String drawing = "", coordY = "";
        for(int n =0 ; n<mazeBoard.length; n++){
            coordY = (n<9) ? coordY+ " "+  + n + "  "  : coordY +" " + n +" ";
           
            for(int k = 0; k<mazeBoard.length; k++){

                casilla = mazeBoard[n][k];
                drawing+= casilla.getDrawBox();
            }
            drawing+="  "+n + "\n";

        }
        return coordY+"\n"+drawing;
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

