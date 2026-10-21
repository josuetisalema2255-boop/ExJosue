public class Dispositivo {
    private final int id;
    private String nombre;
    private boolean activo;
    private static int contadorDispositivos = 0;

    public Dispositivo(int id, String nombre) {
        if (id <= 0) {
            throw new IllegalArgumentException("El identificador debe ser mayor que cero.");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo ni estar vacío.");
        }

        this.id = id;
        this.nombre = nombre.trim();
        this.activo = true;

        contadorDispositivos++;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre.trim();
        }
    }

    public boolean desactivar() {
        if (this.activo) {
            this.activo = false;
            return true;
        }
        return false;
    }

    public String obtenerResumen() {
        String estadoTexto = this.activo ? "Activo" : "Inactivo";
        return this.id + " | " + this.nombre + " | " + estadoTexto;
    }

    public static int getContadorDispositivos() {
        return contadorDispositivos;
    }
}