public class Lavadora extends Electrodomesticos{
    protected static final int cargaConstante = 5;

    protected  int carga;
    public Lavadora(){
        super(precioBaseConstante, ColorConstante, PesoConstante, consumoEnergeticoConstante);
        this.carga = cargaConstante;
    }
    public Lavadora(double precioBase, double peso ,int carga){
        super(precioBase, peso);
        this.carga = carga;
    }


    public Lavadora(double precioBase, String color, double peso , char ConsumoEnergetico, int carga){
        super(precioBase, color, peso, ConsumoEnergetico);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if(carga > 30){
            precioBase = precioBase + 50;
        }

    }

    @Override
    public String toString() {
        comprobarColor();
        precioFinal();
        return "Lavadora{" +
                "precioBase=" + precioBase + color +
                '}';
    }
}
