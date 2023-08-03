package Gun28._03_Ornek;

public class Kitap {
    String name ;
    int publishYear ;
    String author ;

    public Kitap(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    public Kitap() {
    }

    public Kitap(String name, int publishYear) {

        this(name,publishYear,"");
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", author='" + author + '\'' +
                '}';
    }
}
