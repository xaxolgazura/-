public class Main {
    public static void main(String[] args) {


        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " +fullName.toUpperCase());


        String fullname = "Иванов Семён Семёнович";
        String fullnameTrue = fullname.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullnameTrue);
    }
}
