public class Principal {
    public static void main(String[] args) {
        Lavadora g = new Lavadora(15000, "Indigo", 15, 'D' ,50);
        //Televisor t = new Televisor();
        //System.out.println(g.precioBase);

        String [] electrodomesticos = new String[10];
        Lavadora a1 = new Lavadora();
        Lavadora b1 = new Lavadora(50,20,30);
        Lavadora c1 = new Lavadora(24,"negro",10,'A',10);
        Lavadora d1 = new Lavadora(30,100,50);
        Lavadora e1 = new Lavadora(50,"fucsia",10,'E',2);
        Televisor t1 = new Televisor();
        Televisor t2 = new Televisor(24, 10);
        Televisor t3 = new Televisor(25,"azul",3,'D',20,true);
        Televisor t4 = new Televisor(29, 2);
        Televisor t5 = new Televisor(12,"negro",50,'B',120,false);
        electrodomesticos[0] = String.valueOf(a1);
        electrodomesticos[1] = String.valueOf(b1);
        electrodomesticos[2] = String.valueOf(c1);
        electrodomesticos[3] = String.valueOf(d1);
        electrodomesticos[4] = String.valueOf(e1);
        electrodomesticos[5] = String.valueOf(t1);
        electrodomesticos[6] = String.valueOf(t2);
        electrodomesticos[7] = String.valueOf(t3);
        electrodomesticos[8] = String.valueOf(t4);
        electrodomesticos[9] = String.valueOf(t5);

        for( int i = 0; i<electrodomesticos.length; i++){
            System.out.println(electrodomesticos[i]);
        }
        
    }
}
