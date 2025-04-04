import java.util.ArrayList;
public class Verificador {
    public static boolean compararCords(Rectangulo R1, Rectangulo R2) {
        ArrayList<Integer> listR1x = new ArrayList<>();
        ArrayList<Integer> listR1y = new ArrayList<>();
        ArrayList<Integer> listR2x = new ArrayList<>();
        ArrayList<Integer> listR2y = new ArrayList<>();
        listR1x.add(R1.getEsquina1().getX());
        listR1x.add(R1.getEsquina2().getX());
        listR1x.add(R1.getEsquina3().getX());
        listR1x.add(R1.getEsquina4().getX());
        listR1y.add(R1.getEsquina1().getY());
        listR1y.add(R1.getEsquina2().getY());
        listR1y.add(R1.getEsquina3().getY());
        listR1y.add(R1.getEsquina4().getY());
        listR2x.add(R2.getEsquina1().getX());
        listR2x.add(R2.getEsquina2().getX());
        listR2x.add(R2.getEsquina3().getX());
        listR2x.add(R2.getEsquina4().getX());
        listR2y.add(R2.getEsquina1().getY());
        listR2y.add(R2.getEsquina2().getY());
        listR2y.add(R2.getEsquina3().getY());
        listR2y.add(R2.getEsquina4().getY());
        int count = 0;
        for (int i = 0; i < listR1x.size(); i++) {
            if (listR1x.contains(listR2x.get(i))) {
                count += 1;
            }
        }
        for (int i = 0; i < listR1y.size(); i++) {
            if (listR1y.contains(listR2y.get(i))) {
                count += 1;
            }
        }
        if(count == 5)
            return true;
        return false;
    }
    public static boolean seSobrepone(Rectangulo R1, Rectangulo R2) {
        if (R1.getEsquina2().getX() <= R2.getEsquina1().getX() || R2.getEsquina2().getX() <= R1.getEsquina1().getX())
            return false;
        if (R1.getEsquina2().getY() <= R2.getEsquina1().getY() || R2.getEsquina2().getY() <= R1.getEsquina1().getY())
            return false;   
        return true;
    }
    public static void verificarRelacion(Rectangulo R1, Rectangulo R2) {
        if(seSobrepone(R1, R2)) {
            System.out.print("se sobreponen");
            return;
        }
        if(compararCords(R1, R2)) {
            System.out.print("estan juntos");
            return;
        }
        else {
            System.out.print("son disjuntos");
            return;
        }
    }
}    
