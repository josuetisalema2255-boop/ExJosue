public class Main {
    public static void main(String[] args) {
        Dispositivo d1 = new Dispositivo(1, "Sensor A");

        System.out.println("Resumen d1: " + d1.obtenerResumen());

        System.out.println("Desactivar dispositivo: " + d1.desactivar()); // true
        System.out.println("Desactivar nuevamente: " + d1.desactivar());  // false
        System.out.println("Resumen tras desactivar: " + d1.obtenerResumen());

        d1.setNombre("   ");
        System.out.println("Nombre tras intentar poner espacios: " + d1.getNombre());

        Dispositivo d2 = new Dispositivo(2, "Estacion 1");
        System.out.println("Total de dispositivos creados: " + Dispositivo.getContadorDispositivos());
    }
}