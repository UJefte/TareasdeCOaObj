public class Camión implements Vehiculo {
    private String combustible;
    private double peso;

    public Camión() {
    }

    public Camión(String combustible, double peso) {
        this.combustible = combustible;
        this.peso = peso;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Camión{" +
                "combustible='" + combustible + '\'' +
                ", peso=" + peso +
                '}';
    }
    public  void trasportar(){
        System.out.println("Trasportando algo...");
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo el camión de combustible"+ this.combustible);
        return Math.random() >= 0.2;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando el camión de combustible"+ this.combustible);
        return Math.random() >= 0.05;    }

    @Override
    public void avanzar() {
        System.out.println("El camión esta avanzando");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando");
    }
}
