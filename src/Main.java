import java.util.Calendar;
import java.util.*;
public class Main {
    static final Date dateOfBegin = new Date(1731763957839L);
    public static void main(String[] args) {
        System.out.println("Иванов Георгий КВБО-05-23");
        System.out.println("Начал выполнять задание: " + dateOfBegin);
        System.out.println("Задание проверяется: " + new Date(System.currentTimeMillis()));
        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        System.out.println("Введите год");
        cal.set(Calendar.YEAR, sc.nextInt());
        System.out.println("Введите месяц");
        cal.set(Calendar.MONTH, sc.nextInt()-1);
        System.out.println("Введите день");
        cal.set(Calendar.DAY_OF_MONTH, sc.nextInt());
        System.out.println("Введите час");
        cal.set(Calendar.HOUR_OF_DAY, sc.nextInt());
        System.out.println("Введите минуту");
        cal.set(Calendar.MINUTE, sc.nextInt());
        System.out.println("Введите секунду");
        cal.set(Calendar.SECOND, sc.nextInt());

        Calendar calNow = Calendar.getInstance();
        switch (cal.getTime().compareTo(calNow.getTime())){
            case -1:
                System.out.println("Введенная дата уже прошла");
                break;
            case 0:
                System.out.println("Вы ввели текущее время системы");
                break;
            case 1:
                System.out.println("Введенная дата еще не прошла");
                break;
        }
    }
}