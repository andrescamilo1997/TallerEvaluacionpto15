import java.sql.Time;

public class VideoJuego implements Entregable {
    //Atributs Constantes
    protected static  String tituloConstante = "";
    protected static final int horaEstimadaConstante = 10;
    protected static final boolean entregadoConstante = false;
    protected static  String generoConstante = "";
    protected static  String companiaConstante = "";

    //Atributos
    protected String titulo;
    protected int horaEstimada;
    protected boolean entregado;
    protected String genero;
    protected String compania;

    //Constructores

    public VideoJuego(){
        this.titulo = tituloConstante;
        this.horaEstimada = horaEstimadaConstante;
        this.entregado = entregadoConstante;
        this.genero = generoConstante;
        this.compania = companiaConstante;
    }

    public VideoJuego(String titulo, int horaEstimada){
        this.titulo = titulo;
        this.horaEstimada = horaEstimada;
        this.entregado = entregadoConstante;
        this.genero = generoConstante;
        this.compania = companiaConstante;
    }

    public  VideoJuego(String titulo, int horaEstimada, String genero, String compania){
        this.titulo = titulo;
        this.horaEstimada = horaEstimada;
        this.entregado = entregadoConstante;
        this.genero = genero;
        this.compania = compania;
    }


    //metodos de interfaz
    @Override
    public void entregar() {
        this.entregado = true;

    }

    @Override
    public void devolver() {
        this.entregado=false;

    }

    @Override
    public boolean isEntregado() {
        System.out.println(entregado);
        return this.entregado;
    }

    @Override
    public int compareTo(Object otroJuego) {

        if(this.horaEstimada < (int) otroJuego){
            return 0;
        }else if(this.horaEstimada > (int) otroJuego){
            return 1;
        }
        return 2;
    }

    //Metodos Get
    public String getTitulo() {
        return titulo;
    }

    public int getHoraEstimada() {
        return horaEstimada;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    //Metodos Set

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHoraEstimada(int horaEstimada) {
        this.horaEstimada = horaEstimada;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        getTitulo();
        getGenero();
        getCompania();
        getHoraEstimada();

        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", horaEstimada=" + horaEstimada +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compania + '\'' +
                '}';
    }
}
