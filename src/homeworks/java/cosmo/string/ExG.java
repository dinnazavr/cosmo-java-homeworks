package homeworks.java.cosmo.string;

/**
 * Дана строка: ”Где мои деньги?”.
 * Необходимо собрать предложение в обратном порядке: “Деньги мои где?”.
 * Где мои деньги? -> Деньги мои где?
 * <p>
 * Подсказка: используйте методы .split(), .trim(), .replace() и .replaceFirst() класса String
 */
public class ExG {
    public static void main(String[] args) {
        String input = "Где мои деньги?";
        char symbolQuestion = input.charAt(input.length() - 1);
        String[] array = input.toLowerCase().replace("?", "").split(" "); // где, мои, деньги
        String correctString = array[2].replaceFirst("д", "Д") + " " + array[0] + " " + array[1] + symbolQuestion;
        System.out.println(correctString);
    }
}