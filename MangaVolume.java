public class MangaVolume {
    private String tituloSerie;
    private int numeroTomo;
    private int cantidadPaginas;

    public MangaVolume(String tituloSerie, int numeroTomo, int cantidadPaginas) {
        this.tituloSerie = tituloSerie;
        this.numeroTomo = numeroTomo;
        this.cantidadPaginas = cantidadPaginas;
    }

    // Método privado de apoyo (Helper method)
    private boolean esTomoExtenso() {
        return this.cantidadPaginas > 300;
    }

    // Método público que delega lógica al método privado
    public boolean esEdicionEspecial() {
        return esTomoExtenso();
    }

    // Sobrescritura del método canónico toString()
    @Override
    public String toString() {
        return String.format("Manga: %s | Tomo #%d | Páginas: %d | Ed. Especial: %s",
                tituloSerie, numeroTomo, cantidadPaginas, (esEdicionEspecial() ? "SÍ" : "NO"));
    }

    public static void main(String[] args) {
        MangaVolume manga1 = new MangaVolume("Chainsaw Man", 1, 192);
        MangaVolume manga2 = new MangaVolume("Berserk Deluxe", 1, 690);

        // Impresión directa utilizando toString()
        System.out.println(manga1);
        System.out.println(manga2);
    }
}