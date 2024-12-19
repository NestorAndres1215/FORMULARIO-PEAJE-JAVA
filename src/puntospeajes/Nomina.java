
package puntospeajes;

public class Nomina {
    private String codp;
    private String dist;
    private String codemp;
    private String nomemp;
    private String cargo;

    public Nomina(String codp, String dist, String codemp, String nomemp, String cargo) {
        this.codp = codp;
        this.dist = dist;
        this.codemp = codemp;
        this.nomemp = nomemp;
        this.cargo = cargo;
    }

    public String getCodp() {
        return codp;
    }

    public void setCodp(String codp) {
        this.codp = codp;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getCodemp() {
        return codemp;
    }

    public void setCodemp(String codemp) {
        this.codemp = codemp;
    }

    public String getNomemp() {
        return nomemp;
    }

    public void setNomemp(String nomemp) {
        this.nomemp = nomemp;
    }
    public String getcargo() {
        return cargo;
    }

    public void setcargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
