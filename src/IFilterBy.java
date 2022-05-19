import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface IFilterBy {
    List<Offer> filterByPrice(List<Offer> offers, double priceMin, double priceMax);
    List<Offer> filterByTitle(List<Offer> offers, String title);
    List<Offer> filterByDate(List<Offer> offers, LocalDate date);
    List<Offer> filterByYear(List<Offer> offers, int year);
    List<Offer> filterByMileage(List<Offer> offers, double mileage);
}
