public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(Coordenada c1, Coordenada c2) {
        setEsquina1(c1);
        setEsquina2(c2);
    }
    public void setEsquina1(Coordenada c) {
        this.esquina1 = c;
    }
    public void setEsquina2(Coordenada c) {
        this.esquina2 = c;
    }
    public Coordenada getEsquina1() {
        return esquina1;
    }
    public Coordenada getEsquina2() {
        return esquina2;        
    }
    public int getMinX() {
        return Math.min(esquina1.getX(), esquina2.getX());
    }
    public int getMaxX() {
        return Math.max(esquina1.getX(), esquina2.getX());
    }
    public int getMinY() {
        return Math.min(esquina1.getY(), esquina2.getY());
    }
    public int getMaxY() {
        return Math.max(esquina1.getY(), esquina2.getY());
    }
    public String toString() {
        return "Esquinas: " + esquina1 + " y " + esquina2;
    }
}