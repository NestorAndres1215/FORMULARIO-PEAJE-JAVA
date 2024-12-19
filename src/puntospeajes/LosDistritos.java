
package puntospeajes;

public enum LosDistritos {
    
   Primero("Ate"),Segundo("Rimac"), Tercero("Jesus_Maria"), Cuarto("Breña"), Quinto("Miraflores");
    private final String display;
 
    private LosDistritos(String s) {
        display = s;
    }
 
    @Override
    public String toString() {
        return display;
    }
}
