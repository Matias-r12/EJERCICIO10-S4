public class NodoRed {
    private int id;
    private String nombre;
    private String direccionIP;
    private String tipo;
    private boolean activo;
    private static int totalNodos = 0;

    public NodoRed(String nombre, String direccionIP, String tipo) {
        totalNodos++;
        this.id = totalNodos;
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.tipo = tipo;
        this.activo = false;
    }

    public static int getTotalNodos() {
        return totalNodos;
    }

    public void mostrarInformacion() {
        System.out.println("Nodo ID: " + id + " | Nombre: " + nombre + " | IP: " + direccionIP + " | Tipo: " + tipo + " | Activo: " + activo);
    }
}
