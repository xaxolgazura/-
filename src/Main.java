public class Main {
    public static void main(String[] args) {

        int x = 4;
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println(fullName.toUpperCase());


        String fullname = "Иванов Семён Семёнович";
        String fullnameTrue = fullname.replace("ё", "е");
        System.out.println(fullnameTrue);
    }
}
