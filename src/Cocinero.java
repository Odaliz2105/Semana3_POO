class Cocinero {
    String nombre;
    String experiencia;
    String especialidad;

    // Constructor
    public Cocinero(String nombre, String experiencia, String especialidad) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.especialidad = especialidad;
    }

    public void mostrarInfo() {
        System.out.println("El nombre del cocinero es: " + nombre + ", su experiencia es: " + experiencia + " y su especialidad es: " + especialidad);
    }
}
}
