package rent_company;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    List<Car> cars = new ArrayList<>();
    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public String generateReport() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Car car : cars) {
            stringBuilder
                    .append(car.getName()).append(" : ")
                    .append(String.format("%.0f", car.getChargeQuantity()))
                    .append("리터").append(System.getProperty("line.separator"));
        }
        return stringBuilder.toString();
    }
}
