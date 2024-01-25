public class EjemploMutar {
    public static void main(String[] args) {
        Birthday first = new Birthday("First");

        System.out.println(first);
        youthen(first);
        System.out.println(first);

        Birthday second = first;
        youthen(second);

        System.out.println(first);
    }

    // Lo rejuvenecemos, haciendo la fecha de cumpleaños más tardía
    public static void youthen(Birthday birthday) {
        birthday.setBirthYear(birthday.getBirthYear() + 1);
    }
    
}
