public class Main{
    public static void main() {
        System.out.println("=== PRUEBA NODOS DE RED ===");

        NodoRed nodo1 = new NodoRed("RouterCentral", "192.168.1.1", "Router");
        NodoRed nodo2 = new NodoRed("SwitchOficina", "192.168.1.2", "Switch");
        NodoRed nodo3 = new NodoRed("ApPlanta1", "192.168.1.50", "Access Point");
        NodoRed nodo4 = new NodoRed("FirewallPerimetro", "192.168.1.254", "Firewall");
        NodoRed nodo5 = new NodoRed("ServidorDNS", "192.168.1.10", "Server");

        nodo1.mostrarInformacion();
        nodo2.mostrarInformacion();
        nodo3.mostrarInformacion();
        nodo4.mostrarInformacion();
        nodo5.mostrarInformacion();

        System.out.println("\nTotal de nodos creados: " + NodoRed.getTotalNodos());
    }
}
