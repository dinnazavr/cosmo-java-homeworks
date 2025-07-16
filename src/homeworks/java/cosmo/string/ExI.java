package homeworks.java.cosmo.string;

/**
 * Дан массив строк с номерами телефонов {“9806567890”, “89990980644”, “+79005556134”}.
 * Необходимо все номера телефонов отформатировать на вариант с +7-***-***-**-**.
 * 89990980644 -> +7-999-098-06-44
 * <p>
 * Подсказка: используйте методы .format() и .substring() класса String
 */
public class ExI {
    public static void main(String[] args) {
        String[] input = {"9806567890", "89990980644", "+79005556134"};
        for (String i : input) {
            if (i.length() == 12) {
                i = i.replace("+7", "");
            } else if (i.length() == 11) {
                i = i.replaceFirst("8", "");
            }
            i = String.format("+7-%s-%s-%s-%s", i.substring(0, 3), i.substring(3, 6), i.substring(6, 8), i.substring(8, 10));
            System.out.println(i);
        }
    }
}