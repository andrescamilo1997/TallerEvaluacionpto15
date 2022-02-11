import java.util.Random;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private String DNI;
    private String sexo = "H";
    private double peso = 0;
    private double altura = 0;
    private boolean mayorDeEdad = false;


    public Persona(){

    }
    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    public Persona(String nombre, int edad, String sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    public void pesoIdeal(){
        int pesoIde = (int) (peso/(Math.pow(altura, 2)));
        if(pesoIde < 20){
            peso = -1;
            System.out.println("Està en su peso ideal");
        }else if(pesoIde >= 20 && pesoIde <= 25){
            peso = 0;
            System.out.println("Està por debajo de su peso ideal");
        }else{
            peso = 1;
            System.out.println("Tiene sobrepeso");

        }
    }
    public void esMayorDeEdad(){
        if (edad > 18){ mayorDeEdad = true; }
    }
    private void comprobarSexo(){
        if(sexo.equals("M")){sexo = "M";}else{sexo = "H";}
    }
    private void dni(){
        int a = (int) (Math.random()*100000000);
        if(a > 70000000){
            DNI = a+"F";
        }else if(a < 70000000 && a > 30000000){
            DNI = a+"V";
        }else{
            DNI = a + "R";
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        pesoIdeal();
        esMayorDeEdad();
        comprobarSexo();
        dni();
        return "Persona{" +
                "Nombre='" + nombre + '\'' +
                ", Sexo='" + sexo + '\'' +
                ", DNI='" + DNI + '\'' +
                ", Peso=" + peso +
                ", Altura=" + altura +
                ", Mayor De Edad=" + mayorDeEdad +
                '}';
    }
}
