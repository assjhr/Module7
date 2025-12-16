/*
E1: Stiekem weer herhaling Classes en Inheritance
De boekhandel heeft een groot assortiment aan boeken.
De boeken zijn onderverdeeld in fictie en non-fictie.
In deze proefapplicatie beperken wij ons voor de non-fictie afdeling tot kookboeken en biografieën,
fictie hoeft niet onderverdeeld te worden.
Alle boeken hebben een titel en worden automatisch van een code voorzien (ISBN) die nooit kan worden gewijzigd.
Zorg ervoor dat twee boeken identiek aan elkaar zijn wanneer hun code en hun titel identiek is.
Hiervoor kan je gebruik maken van de equals() methode.


 */
package module7.oef1;

public class Book {
    private String title;
    private final String ISBN; //nooit wijzigbaar

    public Book(String title, String ISBN) {
        this.title = title;
        this.ISBN = ISBN;
    }
    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }




}
