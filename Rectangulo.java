public class Rectangulo {
    private Coordenada esquinaT1;
    private Coordenada esquinaT2;
    private Coordenada esquinaB1;
    private Coordenada esquinaB2;

    public Rectangulo(Coordenada c1, Coordenada c2) {
        //x1 y1     x1 y2 
        //x2 y1     x2 y2
        setEsquina1(c1); //x1 y1
        setEsquina2(c2); // x2 y2
        this.esquinaT2 = new Coordenada(c1.getX(), c2.getY());
        this.esquinaB1 = new Coordenada(c2.getX(), c1.getX());
    }
    public void setEsquina1(Coordenada c) {
        this.esquinaT1 = c;
    }
    public void setEsquina2(Coordenada c) {
        this.esquinaB2 = c;
    }
    public Coordenada getEsquina1() {
        return esquinaT1;
    }
    public Coordenada getEsquina2() {
        return esquinaB2;        
    }
    public Coordenada getEsquina3() {
        return esquinaT2;
    }
    public Coordenada getEsquina4() {
        return esquinaB1;        
    }
    public String toString() {
        return "Esquinas: " + esquinaT1 + " y " + esquinaB2;
    }
}