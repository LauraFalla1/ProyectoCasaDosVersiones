public class Main {
    public static void main(String[] args) {
        Casa casaPrincipal = new Casa();

        System.out.println("Cuidad: " + casaPrincipal.getCiudad());
        System.out.println("Barrio: " + casaPrincipal.getBarrio());
        System.out.println("Color: " + casaPrincipal.getColor());
        System.out.println("Pisos: " + casaPrincipal.getPisos());
        System.out.println("Habitaciones: " + casaPrincipal.getHabitaciones());
        System.out.println("Baños: " + casaPrincipal.getBanos());
        System.out.println("Cocinas: " + casaPrincipal.getCocinas());
    }
}