public class Verificador {
    public static void verificarRelacion(Rectangulo R1, Rectangulo R2) {
        int R1MinX = R1.getMinX();
        int R1MaxX = R1.getMaxX();
        int R1MinY = R1.getMinY();
        int R1MaxY = R1.getMaxY();

        int R2MinX = R2.getMinX();
        int R2MaxX = R2.getMaxX();
        int R2MinY = R2.getMinY();
        int R2MaxY = R2.getMaxY();

        if(R1MinX < R2MaxX && R1MaxX > R2MinX && R1MinY < R2MaxY && R1MaxY > R2MinY) {
            System.out.print("se sobreponen");
        }
        if(R1MinX == R2MaxX || R2MinX == R1MaxX || R1MinY ==  R2MaxY || R2MinY == R1MaxY) {
            System.out.print("estan juntos");
        }
        else {
            System.out.print("son disjuntos");
        }
    }
}    