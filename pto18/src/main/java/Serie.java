public class Serie implements  Entregable{
    // Default Attribs
    protected static final String tituloConstante = "";
    protected static int numeroDeTemporadasConstante = 3;
    protected static boolean entregadoConstante = false;
    protected static String generoConstante = "";
    protected static String creadorConstante = "";


    //Atributos
    protected String titulo;
    protected int numeroDeTemporadas;
    protected boolean entregado;
    protected String genero ;
    protected String creador;


    //Constructores
    public Serie() {
        this.titulo = tituloConstante;
        this.numeroDeTemporadas=numeroDeTemporadasConstante;
        this.entregado = entregadoConstante;
        this.genero=generoConstante;
        this.creador=creadorConstante;
    }

    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
        this.numeroDeTemporadas=numeroDeTemporadasConstante;
        this.entregado = entregadoConstante;
        this.genero=generoConstante;
    }
    public Serie(String titulo, int numeroDeTemporadas, String genero, String creador){
        this.titulo=titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.genero=genero;
        this.creador=creador;
    }
    //Metodos Interface


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
    public int compareTo(Object otraSerie) {
        if(this.numeroDeTemporadas < (int) otraSerie){
            return 0;
        }else if(this.numeroDeTemporadas > (int) otraSerie){
            return 1;
        }else {
            return 2;
        }
    }

    //Getters
    public String getTitulo(){
        return titulo;
    }
    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }
    public String  getGenero(){
        return genero;
    }
    public String   getCreador(){
        return creador;
    }

    //Setters


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        getTitulo();
        getCreador();
        getGenero();
        getNumeroDeTemporadas();
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroDeTemporadas=" + numeroDeTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }
}
