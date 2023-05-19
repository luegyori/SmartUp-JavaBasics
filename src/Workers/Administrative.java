package Workers;

import Model.Person;
import Model.WORK_SHIFTS;


public class Administrative extends Person {

    private String softwareKnowledge;

    public Administrative() { }

    public Administrative(String name, String surname, String birthDate, String job, String softwareKnowledge) {
        super(name, surname, birthDate, job, WORK_SHIFTS.MORNING);
        this.softwareKnowledge = softwareKnowledge;
    }

    public String getSoftwareKnowledge() {
        return softwareKnowledge;
    }

    public void setSoftwareKnowledge(String softwareKnowledge) {
        this.softwareKnowledge = softwareKnowledge;
    }
}
