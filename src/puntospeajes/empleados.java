
package puntospeajes;

public class empleados {
    private String codpeaje;
    private String codemple;
    private String nomemple;
    private String cargoemple;

    public empleados(String codpeaje, String codemple, String nomemple, String cargoemple) {
        this.codpeaje = codpeaje;
        this.codemple = codemple;
        this.nomemple = nomemple;
        this.cargoemple = cargoemple;
    }

    public String getCodpeaje() {
        return codpeaje;
    }

    public void setCodpeaje(String codpeaje) {
        this.codpeaje = codpeaje;
    }

    public String getCodemple() {
        return codemple;
    }

    public void setCodemple(String codemple) {
        this.codemple = codemple;
    }

    public String getNomemple() {
        return nomemple;
    }

    public void setNomemple(String nomemple) {
        this.nomemple = nomemple;
    }

    public String getCargoemple() {
        return cargoemple;
    }

    public void setCargoemple(String cargoemple) {
        this.cargoemple = cargoemple;
    }
            
    
    
}
