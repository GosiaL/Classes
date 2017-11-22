package gender;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Małgorzata", "Nowak", Gender.WOMEN);
        Person person1 = new Person("Luk", "Kaczor", Gender.MEN);

        Gender gender = Gender.MEN;
        System.out.println(person.getName());
        System.out.println(person1.getGender().isHasMakeup());
    }
}
