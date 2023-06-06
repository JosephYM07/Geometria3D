public class Cilindro {
    private double radio;
    private double altura;

    //Constructor
    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public double calcularVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    public double calcularAreaSuperficie() {
        double areaBase = Math.PI * Math.pow(radio, 2);
        double areaLateral = 2 * Math.PI * radio * altura;
        return 2 * areaBase + areaLateral;
    }

    // Getters y setters

    private double getRadio() {
        return radio;
    }

    private void setRadio(double radio) {
        this.radio = radio;
    }

    private double getAltura() {
        return altura;
    }

    private void setAltura(double altura) {
        this.altura = altura;
    }
}
