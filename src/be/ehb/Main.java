package be.ehb;

import be.ehb.exceptions.KredietLimietException;
import be.ehb.personen.Persoon;
import be.ehb.personen.WinkelMandje;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        try {
            LocalDate date = LocalDate.of(2002, 5, 12);
            Persoon p = new Persoon("Joske", "Vermeulen", date);
            System.out.println(p);
        }catch(NullPointerException e){
            System.err.println("vergeet geen dag in te geven eh");
        }finally {
            //closes resources
            //cleanup
            System.out.println("The End");
        }

        //Design by contract
        //bepaal conditie, voldoet ge er niet aan -> throw exception

        WinkelMandje myMandje = new WinkelMandje(20);
        try {
            myMandje.addToBasket("Appels", 10);
            myMandje.addToBasket("usb cable", 5);
            myMandje.addToBasket("usb to audio jack convertor", 20);
        }catch(KredietLimietException e){
            System.out.println(e.getMessage());
        }
        System.out.println(myMandje.getMandje());
        System.out.println(myMandje.getKrediet());

    }
}