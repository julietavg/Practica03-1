import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);


      boolean salir = false;
      boolean salir1 = false;


           do{
                 System.out.println(

                 "[1] Resolver el laberinto\n"+
                 "[2] Cerrar\n"+
                 "Elige una opcion: ");

                 int opcion = sc.nextInt();
                //int opcion2 = sc.nextInt();

                 switch(opcion){
            //------------------ Switch
                     case 1:

                     do{
                     System.out.println(

                     "1) Escribir el nombre del archivo donde esta la representacion del laberinto.\n"+
                     "2) Mostrar el laberinto.\n"+
                     "3) Seleccionar la casilla de inicio.\n"+
                     "4) Seleccionar la casilla de fin.\n"+
                     "5) Resolver laberinto y mostrar la solución.\n"+
                     "6) SALIR \n"+
                     "Elige una opcion: ");

                     int opcion1 = sc.nextInt();

                    if(opcion1 == 1){
                        System.out.println("to this");
                    }else if(opcion1 == 2){
                      String directory ="Laberintos/";
                       Maze test = new Maze(directory+"LaberintoA.txt");
                     System.out.println(test.toString());
                    }else if(opcion1 == 3){
                    System.out.println("do this");
                 }else if(opcion1 == 4){
                   System.out.println("do this");
                   }else if(opcion1 ==5){
                    System.out.println("do this");
                  }else if(opcion1 == 6){
                      salir1 = true;
                    }
              }while(!salir1);
              break;


        // -------------- break


                     case 2:
                        salir = true;
                         break;

                     default:
                         System.out.println("Opción inválida");
                 }
             } while(!salir);

         }



    }
