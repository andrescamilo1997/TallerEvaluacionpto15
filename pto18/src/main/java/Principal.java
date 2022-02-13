public class Principal {

    public static String juegoMayor(VideoJuego [] a){
        VideoJuego juegoConMasHoras = a[0];
        for(int u = 4; u > -1 ; u--) {
            if(juegoConMasHoras.compareTo(a[u].horaEstimada) == 1){
                juegoConMasHoras = juegoConMasHoras;
            }else if(juegoConMasHoras.compareTo(a[u].horaEstimada) == 0){
                juegoConMasHoras = a[u];
            }else{
            }
        }

        return juegoConMasHoras.toString();
    }

    public static String serieMayor(Serie [] a){
        Serie seriesConMasSeries = a[0];

        for(int u = 4; u > -1 ; u--) {
            if(seriesConMasSeries.compareTo(a[u].numeroDeTemporadas) == 1){
                seriesConMasSeries = seriesConMasSeries;
            }else if(seriesConMasSeries.compareTo(a[u].numeroDeTemporadas) == 0){
                seriesConMasSeries = a[u];
            }else{
            }
        }
        return seriesConMasSeries.toString();
    }

    public static void main(String[] args) {


        //Llenando de Array
        Serie[] series = new Serie[5];
        VideoJuego[] videoJuegos = new VideoJuego[5];
        Serie a = new Serie();
        Serie b = new Serie("CastleVAnia", "Creador 1");
        Serie c = new Serie("la casa de papel", "creador2");
        Serie d = new Serie("CastleVAnia", 3, "terror", "creador 3");
        Serie e = new Serie("la casa de las cartas", 15, "Politico", "creador 4");
        series[0] = a;
        series[1] = b;
        series[2] = c;
        series[3] = d;
        series[4] = e;
        VideoJuego a1 = new VideoJuego();
        VideoJuego a2 = new VideoJuego("Good of War", 224, "Mitologia", "compañia1");
        VideoJuego a3 = new VideoJuego("need for Speed", 12);
        VideoJuego a4 = new VideoJuego("Halo", 36, "Ciencia ficciòn", "Compañia 2");
        VideoJuego a5 = new VideoJuego("Doom", 11, "ficcion", "compaia 3");
        videoJuegos[0] = a1;
        videoJuegos[1] = a2;
        videoJuegos[2] = a3;
        videoJuegos[3] = a4;
        videoJuegos[4] = a5;
        //Llenando de Array


        //Entrega algunos videojuegos y series
        for (int i = 0; i < series.length; i++) {
            if (i % 2 == 0) {
                series[i].entregar();
            } else {
                videoJuegos[i].entregar();
            }
        }


        //Cuenta cuantas series y videojuegos hay entregados, al contarlos devuelvelos
        int band = 0;
        for (int i = 0; i < series.length; i++) {
            if (series[i].entregado == true) {
                band++;
                System.out.println(band+ " Series entregada, y la están devolviendo");
                System.out.println(series[i].titulo);
                series[i].devolver();

            }else{
                band++;
                System.out.println(band + " Video juegos Entregados, y lo están devolviendo");
                System.out.println(videoJuegos[i].titulo);
                videoJuegos[i].devolver();

            }
        }


        System.out.println(juegoMayor(videoJuegos));
        System.out.println(serieMayor(series));






    }
}
