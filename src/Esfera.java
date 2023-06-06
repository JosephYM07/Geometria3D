public class Esfera {
    public float radio_cubo;
    //Constructor
    public Esfera(float radio_cubo) {
        this.radio_cubo = radio_cubo;
    }
    //GETTERS AND SETTERS
    private float getRadio_cubo() {
        return radio_cubo;
    }

    private void setRadio_cubo(float radio_cubo) {
        this.radio_cubo = radio_cubo;
    }

    public float volumenCubo( float radio_cubo){
        return (float) (4/3*3.14 * this.radio_cubo * this.radio_cubo * this.radio_cubo);

    }
}
