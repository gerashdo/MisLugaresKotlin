package curso.kotlin.materialdesignscroll;

import curso.kotlin.mislugares.GeoPunto;import curso.kotlin.mislugares.Lugar;import curso.kotlin.mislugares.LugaresLista;import curso.kotlin.mislugares.TipoLugar;public class Principal {
    public static void main (String[] main) {
        LugaresLista lugares = new LugaresLista();
        Lugar lugar1 = new Lugar("Escuela Politécnica Superior de Gandía",
                "C/ Paranimf, 1 46730 Gandia (SPAIN)", new GeoPunto(-0.166093,
                38.995656),TipoLugar.EDUCACION,"" , 962849300,"http://www.epsg.upv.es","Good", System.currentTimeMillis(), 3f);
        lugares.aniade(lugar1);
        for (int i=0; i<lugares.tamanio(); i++) {
            System.out.println(lugares.elemento(i).toString());
        }
    }
}
