import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public interface ISortBy {
    List<Offer> sortByTitle(List<Offer> offers, boolean ascending);
    List<Offer> sortByPrice(List<Offer> offers, boolean ascending);
    List<Offer> sortByDate(List<Offer> offers, boolean ascending);
    List<Offer> sortByYear(List<Offer> offers, boolean ascending);
}
