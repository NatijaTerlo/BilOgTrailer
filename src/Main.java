public class Main {
    public static void main(String[] args) {
        Bil minBil = new Bil(" Ford", 1200);
        Trailer minTRailer = new Trailer("Thule", 500);
        minBil.tilkobletTrailer(minTRailer);
        minBil.tilkobletTrailer(new Trailer("andenTrailer", 3000));

        System.out.println(minBil);
    }
}