package Section14.Polimorfism.Fix;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;

    public UsedProduct(String name, double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    public String priceTag(){
        return getName()
            + " (used) $ "
            + String.format("%.2f", getPrice())
            + " (Manufacture date: "
            + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/YYYY"))
            + ")";
    }
    
}
