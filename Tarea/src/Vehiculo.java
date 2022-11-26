public class Vehiculo {
    String marca;
    String modelo;
    String placa;
    String color;

    public Vehiculo(){
        marca=" ";
        modelo=" ";
        placa=" ";
        color=" ";
    }
    public Vehiculo(String mar, String mod, String pla, String col ){
        marca=mar;
        modelo=mod;
        placa=pla;
        color=col;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
