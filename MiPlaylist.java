public class MiPlaylist {
    public static void main(String[] args) {
        cancion c1 = new cancion("Lluvia", "Eddie Santiago", 304);
        cancion c2 = new cancion("Deseándote", "Frankie Ruiz", 302);
        cancion c3 = new cancion("Te Amo", "Eddie Santiago", 280);

        c1.reproducir();
        c2.reproducir();
        c3.reproducir();

        System.out.println("\nDetalles de la Playlist:");
        System.out.println(c1.obtenerDetalles());
        System.out.println(c2.obtenerDetalles());
        System.out.println(c3.obtenerDetalles());
    }
}
