import java.util.Comparator;
import java.util.concurrent.ConcurrentMap;

public class CarPriceComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getCarPrice()-o2.getCarPrice();
    }
}
