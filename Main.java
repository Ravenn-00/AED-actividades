public class Main {
    public static void main(String[] args) {
        Coordenada c1 = new Coordenada(1, 1);
        Coordenada c2 = new Coordenada(4, 4);
        Rectangulo r1 = new Rectangulo(c1, c2);

        Coordenada c3 = new Coordenada(3, 3);
        Coordenada c4 = new Coordenada(6, 6);
        Rectangulo r2 = new Rectangulo(c3, c4);
        
        Coordenada c5 = new Coordenada(1, 1);
        Coordenada c6 = new Coordenada(4, 4);
        Rectangulo r3 = new Rectangulo(c5, c6);

        Coordenada c7 = new Coordenada(4, 6);
        Coordenada c8 = new Coordenada(6, 7);
        Rectangulo r4 = new Rectangulo(c7, c8);
        
        Coordenada c9 = new Coordenada(1, 1);
        Coordenada c10 = new Coordenada(4, 4);
        Rectangulo r5 = new Rectangulo(c9, c10);

        Coordenada c11 = new Coordenada(4, 7);
        Coordenada c12 = new Coordenada(6, 0);
        Rectangulo r6 = new Rectangulo(c11, c12);

        Verificador.verificarRelacion(r1, r2);
        System.out.print("\n-------------------------------\n");
        Verificador.verificarRelacion(r3, r4);
        System.out.print("\n-------------------------------\n");
        Verificador.verificarRelacion(r5, r6);


    }
}