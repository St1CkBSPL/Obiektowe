public class Main {
    public static void main(String[] args) {

        /*
        System.out.println("Zadanie 1: ");
        Produkt produkt = new Produkt("Maslo", 4,50);
        produkt.wyswietlInformacje();
        produkt.dodajDoMagazynu(50);
        produkt.wyswietlInformacje();
        produkt.usunZMagazynu(90);
        produkt.wyswietlInformacje();

        System.out.println("Zadanie 2: ");
        KoszykZakupowy koszyk = new KoszykZakupowy();
        Produkt produkt1 = new Produkt("Awokado", 9.30,50);
        Produkt produkt2 = new Produkt("Mleko", 6.50,25);
        Produkt produkt3 = new Produkt("Makaron", 2.80,45);
        koszyk.dodajProdukt(produkt1, 1);
        koszyk.dodajProdukt(produkt2, 3);
        koszyk.dodajProdukt(produkt3, 3);
        koszyk.wyswietlZawartoscKoszyka();
        System.out.println("Wartosc koszyka: "+koszyk.obliczCalkowitaWartosc());
        produkt1.wyswietlInformacje();
        produkt2.wyswietlInformacje();
        produkt3.wyswietlInformacje();

        System.out.println("Zadanie 3:");
        Zamowienie zamowienie = new Zamowienie(koszyk, "Przyjęty");
        zamowienie.wyswietlZamowienie();
        zamowienie.ustawStatusZamowienia("Opłacony");
        zamowienie.wyswietlZamowienie();

        System.out.println("Zadanie 4:");
        KoszykZakupowy koszyk2 = new KoszykZakupowy();
        koszyk2.dodajProdukt(produkt2, 5);
        koszyk2.dodajProdukt(produkt1, 3);
        Zamowienie zamowienie1 = new Zamowienie(koszyk2, "Przyjęty");
        Adres adres1 = new Adres("Słoneczna", "14", "Przybynów", 17300);
        Klient k1 = new Klient("Piotr", "Kaczorowski", adres1);
        k1.dodajZamowienie(zamowienie);
        k1.dodajZamowienie(zamowienie1);
        k1.wyswietlHistorieZamowien();
        System.out.println("Łączny koszt zamowien: " + k1.obliczLacznyKosztZamowien());

        System.out.println("Zadanie 5:");
        Magazyn magazyn1 = new Magazyn();
        Sklep sklep1 = new Sklep("Lidl", "30.09.2003", magazyn1);
        sklep1.dodajProdukt(produkt1);
        sklep1.dodajProdukt(produkt3);
        System.out.println("Sklep:");
        sklep1.wyswietlOferty();
        sklep1.zakupy("Makaron", 3, koszyk2);
        System.out.println("Koszyk:");
        koszyk2.wyswietlZawartoscKoszyka();
        MojaKlasa object = new MojaKlasa();
        System.out.println(object.getKlasa());

        Owoc banan = new Banan();
        Warzywo ziemniak = new Ziemniak();
        Ubranie nike = new ciuch();
        UrzadzenieElektroniczne zelmer = new mikrofala();

        System.out.println("Smak banana: " + banan.smak());
        banan.umyj();
        banan.zjedz();
        System.out.println("Smak ziemniaka: " + ziemniak.smak());
        ziemniak.umyj();
        ziemniak.zjedz();

        nike.wypierz();
        nike.wysusz();
        nike.zniszcz();
        nike.wysusz();
        nike.zaloz();

        zelmer.napraw();
        zelmer.uzyj();
        zelmer.wlacz();
        zelmer.wylacz();
        zelmer.zepsuj();


         */
        MusicAlbum album = new MusicAlbum("Future Nostalgia", "Dua Lipa");
        album.addRating(9.5);
        album.addRating(9.0);
        System.out.println(album);
        album.removeRating();
        System.out.println(album);

        RockAlbum rockAlbum = new RockAlbum("Nevermind", "Nirvana", "Grunge");
        rockAlbum.addRating(9.2);
        rockAlbum.addRating(9.7);
        System.out.println(rockAlbum);
        rockAlbum.removeRating();
        System.out.println(rockAlbum);
        RockAlbum rockAlbum2 = new RockAlbum("Nevermind", "Nirvana", "Grunge");
        System.out.println("Czy rockAlbum jest rowny rockAlbum2? " + rockAlbum.equals(rockAlbum2));
        System.out.println("HashCode rockAlbum: " + rockAlbum.hashCode());
        System.out.println("HashCode rockAlbum2: " + rockAlbum2.hashCode());
        BookDTO book1 = new BookDTO("Medi", "Kacper Mederski", 29.99, 2024);
        BookDTO book2 = new BookDTO("Medi2", "Kacper Mederski", 9.99, 2024);
        BookDTO book3 = new BookDTO("Medi3", "Kacper Mederski", 19.99, 2022);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

    }
}