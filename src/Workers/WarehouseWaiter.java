package Workers;

import Model.Person;
import Model.WORK_SHIFTS;

public class WarehouseWaiter extends Person {

    private String forkliftLicense;
    private String foodHandlerLicense;

    public WarehouseWaiter() { }

    public WarehouseWaiter(String name, String surname, String birthDate, String job, WORK_SHIFTS shift, String forkliftLicense, String foodHandlerLicense) {
        super(name, surname, birthDate, job, shift);
        this.forkliftLicense = forkliftLicense;
        this.foodHandlerLicense = foodHandlerLicense;
    }

    public String getForkliftLicense() {
        return forkliftLicense;
    }

    public void setForkliftLicense(String forkliftLicense) {
        this.forkliftLicense = forkliftLicense;
    }

    public String getFoodHandlerLicense() {
        return foodHandlerLicense;
    }

    public void setFoodHandlerLicense(String foodHandlerLicense) {
        this.foodHandlerLicense = foodHandlerLicense;
    }
}
