
package puntospeajes;

public class Peajes {
    private String cod;
    private String dist;

    public Peajes(String cod, String dist) {
        this.cod = cod;
        this.dist = dist;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }
    
    
}
