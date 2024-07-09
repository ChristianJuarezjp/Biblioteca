public class Main {
    public static void main(String[] args) {
        // Crea un objeto 'libro1' utilizando el constructor sin parámetros
        Libro libro1 = new Libro();
        libro1.mostrarDetalles();

        // Crea un objeto 'libro2' utilizando el constructor con parámetros
        Libro libro2 = new Libro("Metamorfosis", "Fran Kafka", "978-1234567890", 19.99);
        libro2.mostrarDetalles();

        // Actualiza el precio de 'libro2' y muestra los detalles nuevamente
        libro2.actualizarPrecio(25.99);
        libro2.mostrarDetalles();
    }
}