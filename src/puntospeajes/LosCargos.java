package puntospeajes;

public enum LosCargos {
 Primero("OPERARIO"),
 Segundo("ADMINISTRADOR"),
 Tercero("JEFE"), Cuarto("SUPERVISOR"),
 Quinto("GERENTE"), Sexto("INGENIERO"),
 Setimo("CONTROLADOR");
 
    private final String display;
 
    private LosCargos(String s) {
        display = s;
    }
 
    @Override
    public String toString() {
        return display;
    }
    
    
}
