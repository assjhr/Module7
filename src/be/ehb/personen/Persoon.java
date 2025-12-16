package be.ehb.personen;

import java.time.LocalDate;

public class Persoon {
    private String voornaam, achternaam;
    private LocalDate geboortedatum;

    public Persoon(String voornaam, String achternaam, LocalDate geboortedatum) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "voornaam='" + voornaam + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", geboortedatum=" + geboortedatum.getYear() +
                '}';
    }
}