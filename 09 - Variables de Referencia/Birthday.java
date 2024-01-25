public class Birthday {
    private String name;
    private int birthYear;

    public Birthday(String name) {
        this.name = name;
        this.birthYear = 2018;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String toString() {
        return this.name + " (" + this.birthYear + ")";
    }
}
