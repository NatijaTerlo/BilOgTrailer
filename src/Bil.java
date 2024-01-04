public class Bil {
    private String mærke;
    private int vægt;
    private Trailer tilkobletTrailer;


    public Bil(String mærke, int vægt) {
        this.mærke = mærke;
        this.vægt = vægt;

    }


    public void setTilkobletTrailer(Trailer trailer) {
        if (totalVægt() + trailer.getVægt() <= 3500) {
            tilkobletTrailer = trailer;
            System.out.println("Trailer tilkoblet. Totalvægt nu: " + totalVægt() + "kg");
        } else {
            System.out.println("Trailer kunne ikke tilkobles.Totalvægten overskrider 3500 kg.");
        }

    }

    public int totalVægt() {
        if (tilkobletTrailer != null) {
            return vægt + tilkobletTrailer.getVægt();
        } else {
            return vægt;
        }
    }

    public String toString() {
        if (tilkobletTrailer != null) {
            return mærke + "med tilkoblet trailer (" + tilkobletTrailer.getMærke() + "), totalvægt: " + totalVægt() + " kg";
        } else {
            return mærke + " uden tilkoblet trailer, vægt: " + totalVægt() + " kg";
        }
    }
}





