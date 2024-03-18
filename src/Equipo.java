public class Equipo {
    private String nombre, division;
    Jugador jugadores[] = new Jugador[5];

    public Equipo(String nombre, String division) {
        this.nombre = nombre;
        this.division = division;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public void altaEquipo(String nombre){

    }
}
