public class Televisor extends Electrodomesticos{
    protected static int pulgadasConstante = 20;
    protected static boolean TDTConstante = false;


    protected int pulgadas;
    protected boolean TDT;

    public Televisor(){
        super(precioBaseConstante,ColorConstante, PesoConstante,consumoEnergeticoConstante);
        this.pulgadas = pulgadasConstante;
        this.TDT = TDTConstante;
    }

    public Televisor(double precioBase, double peso){
        super(precioBase,peso);
        this.TDT=TDTConstante;
        this.pulgadas=pulgadasConstante;
    }
    public Televisor(double precioBase, String color, double peso , char ConsumoEnergetico, int pulgadas, boolean TDT){
        super(precioBase,color,peso,ConsumoEnergetico);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void precioFinal(){
        super.precioFinal();
        if(this.pulgadas > 40){
            this.precioBase = ((this.precioBase * 30)/100)+this.precioBase;
        }
        if(TDT = true){
            this.precioBase = this.precioBase + 50;

        }
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "precioBase=" + precioBase +
                '}';
    }
}
