public class SelectorDeRegalos {

    public static String seleccionarRegalo(int puntuacion, int edad) {
        if (edad < 12) {
            if (puntuacion > 100) {
                return "Juguete de construcción";
            } else {
                return "Libro de cuentos";
            }
        } else if (edad <= 18) {
            if (puntuacion > 100) {
                return "Videojuego";
            } else {
                return "Libro de aventuras";
            }
        } else {
            if (puntuacion > 100) {
                return "Tarjeta regalo";
            } else {
                return "Libro de misterio";
            }
        }
    }
}