package d10_01_2023;

public class Knjiga {
    private String isbn;
    private String naziv;
    private int godina;
    private Autor autor;

    public Knjiga(String isbn, String naziv, int godina, Autor autor) {
        this.isbn = isbn;
        this.naziv = naziv;
        this.godina = godina;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public void stampaj(){
        System.out.println(this.isbn);
        System.out.println(this.naziv + " - "+this.godina);
        System.out.println(this.autor.getIme()+" " + this.autor.getPrezime());
    }
}
