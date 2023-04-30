package principal;
public class flautista {
    public principal.flauta flauta;
    public  void tocarFlauta(flauta melodia) throws Exception {
        this.flauta = new flauta((principal.flauta) melodia);
    }
}
