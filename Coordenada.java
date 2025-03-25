public class Coordenada {
    private int x;
    private int y;
    public Coordenada() {

    }
    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Coordenada(Coordenada c) {
        this.x = c.getX();
        this.y = c.getY();

    }
    public int getX() {
        return this.x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double distancia(Coordenada c) {
        return Math.sqrt(Math.pow(this.getX() - c.getX(), 2) + Math.pow(this.getY() - c.getY(), 2));

    }
    public static double distancia(Coordenada c1, Coordenada c2) {
        return c1.distancia(c2);
    }
    public String toString() {
        return "(" + this.getX() + ", " + this.getY() + ")";
        
    }
}