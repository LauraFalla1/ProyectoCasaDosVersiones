public class Main {
    public static void main(String[] args) {
        Casa casaDeLaura = new Casa("Agrado","Rojas Garrido", "Rojo");
        Casa casaDePatricia = new Casa("Centro", "Verde", 2);
        Casa casaDeJuan = new Casa(1, 2, 2, 1);

        System.out.println("Objeto casaDeLaura");
        System.out.println("Ciudad: " + casaDeLaura.getCiudad());
        System.out.println("Barrio: " + casaDeLaura.getBarrio()) ;
        System.out.println("Color: " + casaDeLaura.getColor()) ;
        System.out.println("\nObjeto casaDePatricia");
        System.out.println("Barrio: " + casaDePatricia.getBarrio()) ;
        System.out.println("Color: " + casaDePatricia.getColor());
        System.out.println("Pisos: " + casaDePatricia.getPisos());
        System.out.println("\nObjeto casaDeJuan") ;
        System.out.println("Pisos: " + casaDeJuan.getPisos());
        System.out.println("Habitaciones: " + casaDeJuan.getHabitaciones());
        System.out.println("Baños: " + casaDeJuan.getBanos());
        System.out.println("Cocinas: " + casaDeJuan.getCocinas());
    }
}