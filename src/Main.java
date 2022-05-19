import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2020,10,24);
        LocalDate date2 = LocalDate.of(2021,5,5);
        LocalDate date3 = LocalDate.of(2022,12,12);

        List<Offer> offers = new ArrayList<Offer>();
        Car ford = new Car("Ford Focus", 2020, 199600, 7000.555 );
        Offer offer1 = new Offer(ford, "Niemiec płakał jak sprzedawał", date3);
        Car toyota = new Car("Citroen c4", 2005, 120000, 20000);
        Offer offer2 = new Offer(toyota, "Japońska niezawodność, OKAZJA!", date2);
        Car opel = new Car("Opel Astra", 2003, 220000, 5000.999);
        Offer offer3 = new Offer(opel, "SERWISOWANY,  1 właściciel !!!", date1);
        OfferService service = new OfferService();

        offers.add(offer1);
        offers.add(offer2);
        offers.add(offer3);
        OfferService.printOffers(offers);

        //service.sortByTitle(offers, false);
        //service.sortByPrice(offers, true);
        //service.sortByYear(offers, true);
        //service.sortByDate(offers. true);

        OfferService.printOffers(offers);

        OfferService.printOffers(service.filterByPrice(offers, 8000, 50000));
        OfferService.printOffers(service.filterByTitle(offers,"SERWIS"));
        OfferService.printOffers(service.filterByDate(offers,date3));
        OfferService.printOffers(service.filterByMileage(offers, 199600));
        OfferService.printOffers(service.filterByYear(offers,2003));

    }
}
