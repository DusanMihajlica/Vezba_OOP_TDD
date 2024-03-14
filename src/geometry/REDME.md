# Klasa Tacka
Nulti zahtev tacka je podklasa Klase Shape.
Prvi zahtev dve kordinate (atributi) tipa ineger.
Drugi zahtev tacka mora imati boolean atribut da se zna da li je selektovana.
Treci zahtev tacka mora imati prazan Konstruktor.
Cetvrti zahtef mora da ima Konstruktor kojim mozemo da inicijalizujemo kordinate tacaka.
Peti zahtev mora da ima Konstruktor kojim se inicijalizuju svi atributi tacke.
Sesti zahtev tacka mora da ima medotu kojim se izracunava rastojanje tacke od neke druge tacke.
Sedmi zahtev treba da sadrzi metodu kojom se odredjuje da li neka tacka sadrzi drugu tacku (ta druga dacka je udaljena od nje za manje ili jednako od 2).
Osmi zahtev tacka mora da ima metodu TOString koja vraca kordinate u zagradi odvojene zarezom primer: (3,5).
Deveti zahtev klasa tacka mora da ima metodu equals koji prima objekat i vraca boolean vrednost da li su objekti jednaki.
Deseti zahtev treba da ima getere i setere za kordinate.
Jedanaesti zahtiv tacka treba da overajduje metodu draw i da u toj metodi setuje boju na crnu i da u metodi drow lajna napravi sledece atribute x-2, y, x+2 i da u toj metodi nacrta liniju sa sledecim atributama x, y-2, x, y+2 i onda ako je tacka selektovana treba da promeni boju u plavu i da se oko nje nacrta rectangle koristeci metodu draw rectangle: x-2, y-2, 4, 4.
Dvanaesti zahtev klasa sadrzi metodu za pomeranje tako sto ce da se tacka pomeri na nov edate kordiinate (MoveTo) treba da overajduje vec zadatu metodu MoveTo iz klase Shape.
Trinaesti zahtev treba da overajduje metodu MoveBy iz klase Shape.
Cetrnaesti zahtev treba da overrajduje metodu CompareTo.