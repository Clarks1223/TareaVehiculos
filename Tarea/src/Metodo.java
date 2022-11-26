import java.util.Scanner;
public class Metodo {
    Scanner sc = new Scanner(System.in);

    Vehiculo auto[] = new Vehiculo[5];
    public void ingresarVehiculo(int pos){
        String mar, mod, pla, col;
        System.out.println("\nIngrese los datos del Vehiculo numero "+(pos+1));
        System.out.print("Ingrese la marca del vehiculo: ");
        mar=sc.nextLine();
        System.out.print("Ingrese el modelo del vehiculo: ");
        mod=sc.nextLine();
        System.out.print("Ingrese el numero de placa del vehiculo: ");
        pla=sc.nextLine();
        System.out.print("Ingrese el color del vehiculo: ");
        col=sc.nextLine();
        auto[pos]= new Vehiculo(mar,mod, pla, col);
        System.out.println();
    }

    public void mostrarDatos(int max){
        for(int i=0; i<max; i++) {
            System.out.println("\nDatos del auto numero: "+(i+1));
            System.out.println("Marca: " + auto[i].getMarca());
            System.out.println("Modelo: " + auto[i].getModelo());
            System.out.println("Placa: " + auto[i].getPlaca());
            System.out.println("Color: " + auto[i].getColor()+"\n");
        }
    }


}
