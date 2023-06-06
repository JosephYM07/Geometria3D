public class main {
    public static void main(String[] args) {
        Esfera esfera=new Esfera(7);
        Cilindro cilindro = new Cilindro(3.0, 5.0);
        System.out.println("Volumen del cilindro: " + cilindro.calcularVolumen());
        System.out.println("Área de la superficie del cilindro: " + cilindro.calcularAreaSuperficie());
        System.out.println("Volumen del cubo: " +esfera.volumenCubo(7));

    }
}
