package Model;

public class Person {

    private String name;
    private String surname;
    private String birthDate;
    private String job;
    private WORK_SHIFTS shift;

    public Person() { }

    public Person(String name, String surname, String birthDate, String job, WORK_SHIFTS shift) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.job = job;
        this.shift = shift;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public WORK_SHIFTS getShift() {
        return shift;
    }

    public void setShift(WORK_SHIFTS shift) {
        this.shift = shift;
    }

}
