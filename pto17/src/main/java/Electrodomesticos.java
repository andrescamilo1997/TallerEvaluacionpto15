public class Electrodomesticos {
    protected static final double precioBaseConstante = 100;
    protected static String ColorConstante = "blanco";
    protected static double PesoConstante = 5;
    protected static char consumoEnergeticoConstante = 'F';

    protected double precioBase;
    protected String color;
    protected double peso;
    protected char ConsumoEnergetico;


    public Electrodomesticos(){
        this.precioBase = precioBaseConstante;
        this.color = ColorConstante;
        this.peso = PesoConstante;
        this.ConsumoEnergetico = consumoEnergeticoConstante;
    }
    public Electrodomesticos(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.color = ColorConstante;
        this.ConsumoEnergetico = consumoEnergeticoConstante;
        this.peso = peso;
    }

    public Electrodomesticos(double precioBase, String color, double peso, char ConsumoEnergetico) {
        this.precioBase = precioBase;
        this.color = color;
        this.peso = peso;
        this.ConsumoEnergetico = ConsumoEnergetico;
    }

    public double getPrecioBase() {
        return precioBase;
    }
    public String getColor(){
        return color;
    }
    public double getPeso(){
        return peso;
    }
    public char getConsumoEnergetico(){
        return ConsumoEnergetico;
    }


    public void comprobarColor(){
        String [] colores = new String[5];
        colores[0] = "blanco";
        colores[1] = "negro";
        colores[2] = "rojo";
        colores[3] = "azul ";
        colores[4] = "gris";



        for (int i = 0 ; i < colores.length; i++){
            if(colores[i].equals(this.color.toLowerCase())){
                i = colores.length + 1;
            }else {
                this.color = ColorConstante;
            }
        }

    }


    public void precioFinal(){
        double precioEnergetico;
        double preciokg;

        if(this.ConsumoEnergetico == 65){
            precioEnergetico =100;
        }else if(this.ConsumoEnergetico == 66){
            precioEnergetico =80;
        }else if(this.ConsumoEnergetico == 67){
            precioEnergetico =60;
        }else if(this.ConsumoEnergetico == 68){
            precioEnergetico =50;
        }else if(this.ConsumoEnergetico == 69){
            precioEnergetico =30;
        }else {
            precioEnergetico = precioBaseConstante;
        }


        if(this.peso >= 0 && this.peso <= 19 ){
            preciokg = 10;
        }else if(this.peso >= 20 && this.peso <= 49){
            preciokg =50;
        }else if(this.peso >= 50 && this.peso <= 79){
            preciokg =80;
        }else{
            preciokg =100;
        }

        this.precioBase = preciokg + precioEnergetico + precioBase;
    }
}
