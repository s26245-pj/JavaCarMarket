import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OfferService implements IFilterBy, ISortBy {

    ArrayList<Offer> listOfOffers = new ArrayList<Offer>();

    public static void printOffers(List<Offer> offers){
        System.out.println("_____________________________________________________________________________________");
        System.out.println("|\t\t\tTITLE\t\t\t\t|DATE\t|CAR MODEL\t|YEAR\t|MILEAGE\t|PRICE\t\t|");
        System.out.println("-------------------------------------------------------------------------------------");
        for(Offer offer : offers){
            System.out.println("|"
                    + offer.getTitle() + "\t|"
                    + offer.getDate() + "\t|"
                    + offer.getCar().getModel() + "\t|"
                    + offer.getCar().getYear() + "\t|"
                    + offer.getCar().getMileage() + "\t|"
                    + offer.getCar().getPrice() + "\t|")
                    ;
        }
    }

    @Override
    public List<Offer> sortByTitle(List<Offer> offers, boolean ascending) {
        if(!ascending){
            offers.sort((o1, o2) -> -o1.getTitle().compareTo(o2.getTitle()));
        } else {
            offers.sort((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
        }
        return offers;
    }

    @Override
    public List<Offer> sortByPrice(List<Offer> offers, boolean ascending) {
        if(!ascending){
        offers.sort((o1, o2) -> -Double.compare(o1.getCar().getPrice(), o2.getCar().getPrice()));
        } else {
            offers.sort((o1, o2) -> Double.compare(o1.getCar().getPrice(), o2.getCar().getPrice()));
        }
        return offers;
    }

    @Override
    public List<Offer> sortByDate(List<Offer> offers, boolean ascending) {
        if(!ascending){
            offers.sort((o1, o2) -> -o1.getDate().compareTo(o2.getDate()));
        }
        offers.sort((o1, o2) -> o1.getDate().compareTo(o2.getDate()));
        return offers;
    }

    @Override
    public List<Offer> sortByYear(List<Offer> offers, boolean ascending) {
        if(!ascending){
            offers.sort((o1, o2) -> -Integer.compare(o1.getCar().getYear(), o2.getCar().getYear()));
        } else {
            offers.sort((o1, o2) -> Integer.compare(o1.getCar().getYear(), o2.getCar().getYear()));
        }
        return offers;
    }


    @Override
    public List<Offer> filterByPrice(List<Offer> offers, double priceMin, double priceMax) {
        List<Offer> filteredList = new ArrayList<Offer>();
        for(Offer offer : offers){
            if(priceMin <= offer.getCar().getPrice() && offer.getCar().getPrice() <= priceMax) {
                filteredList.add(offer);
            }
        }
        return filteredList;
    }

    @Override
    public List<Offer> filterByTitle(List<Offer> offers, String title) {
        List<Offer> filteredList = new ArrayList<Offer>();
        for(Offer offer : offers){
            if(offer.getTitle().contains(title)) {
                filteredList.add(offer);
            }
        }
        return filteredList;
    }

    @Override
    public List<Offer> filterByDate(List<Offer> offers, LocalDate date) {
        List<Offer> filteredList = new ArrayList<Offer>();
        for(Offer offer : offers){
            if(offer.getDate().equals(date)) {
                filteredList.add(offer);
            }
        }
        return filteredList;
    }

    @Override
    public List<Offer> filterByYear(List<Offer> offers, int year) {
        List<Offer> filteredList = new ArrayList<Offer>();
        for(Offer offer : offers){
            if(offer.getCar().getYear()==year) {
                filteredList.add(offer);
            }
        }
        return filteredList;
    }

    @Override
    public List<Offer> filterByMileage(List<Offer> offers, double mileage) {
        List<Offer> filteredList = new ArrayList<Offer>();
        for(Offer offer : offers){
            if(offer.getCar().getMileage()==mileage){
                filteredList.add(offer);
            }
        }
        return filteredList;
    }
}
