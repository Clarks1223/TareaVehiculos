import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        Metodo met=new Metodo();
        int opcion=1, num=0;
        while (opcion!=0){
            opcion=menu();
            switch (opcion){
                case 1:
                    if(num<5) {
                        met.ingresarVehiculo(num);
                        num++;
                    }
                    else{
                        System.out.println("Ha ingresado todos los vehiculos");
                    }
                    break;
                case 2:
                    if (!(num == 0)){
                        met.mostrarDatos(num);
                    }
                    else {
                        System.out.println("Aun no a ingresado ningun vehiculo");
                    }
                    break;
            }
        }
        System.out.println("Adios, regrese pronto");
    }
    static int menu(){
        int op;
        System.out.println("******MENU PRINCIPAL******");
        System.out.println("1. Ingresar un nuevo vehiculo (max 5)");
        System.out.println("2. Mostrar datos de los vehiculos");
        System.out.println("0. Salir");
        System.out.print("Opcion: ");
        op=sc.nextInt();
        while (op!=1 && op!=2&& op!=0){
            System.out.println("Dato incorrecto, ingreseo otra opcion");
            System.out.print("Opcion: ");
            op=sc.nextInt();
        }
        return op;
    }

}