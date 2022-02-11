import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        //Pide por teclado el nombre, la ed, se, pes y alt.

        System.out.println("Ingrese Nombre");
        String nom = datos.nextLine();

        System.out.println("Ingrese Sexo");
        String se= datos.nextLine();

        System.out.println("Ingrese Peso");
        double  pes = datos.nextDouble();

        System.out.println("Ingrese Altura");
        double alt = datos.nextDouble();

        System.out.println("Ingrese Edad");
        int ed = datos.nextInt();


        Persona obj3 = new Persona();
        obj3.setNombre("Person1");
        obj3.setEdad(50);
        obj3.setPeso(100);
        obj3.setSexo("H");
        obj3.setAltura(1.58);

        Persona obj2 = new Persona(nom, ed, se);
        Persona obj1 = new Persona(nom, ed,se,pes,alt);



        System.out.println(obj3);
        System.out.println(obj2);
        System.out.println(obj1);





    }
}
