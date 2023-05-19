package Workers;

import Model.Person;
import Model.WORK_SHIFTS;


public class Worker extends Person {

    public Worker() {
    }

    public Worker(String name, String surname, String birthDate, String job, WORK_SHIFTS shift) {
        super(name, surname, birthDate, job, shift);
    }
}
