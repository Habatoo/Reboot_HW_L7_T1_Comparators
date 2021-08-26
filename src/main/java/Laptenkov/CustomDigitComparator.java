package Laptenkov;

import java.util.Comparator;

/**
 * Класс компаратор CustomDigitComparator, реализует интерфейс Comparator<Integer>.
 * Класс CustomDigitComparator определяет следующий порядок:
 * - Сначала четные числа, затем нечетные.
 * - На вход подаются числа, отличные от null.
 * @author habatoo
 */
public class CustomDigitComparator implements Comparator<Integer> {
    /**
     * Метод {@link CustomDigitComparator#compare} сравнивает два числа и возвращает результат
     * в зависимости от сравнения.
     * @param o1 первая цифра для сравнения.
     * @param o2 вторая цифра для сравнения.
     * @return положительное, отрицательное число или ноль
     */
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 % 2 == 0 && o2 % 2 == 0) {
            if (o1 == o2) {
                return 0;
            }
            if (o1 > o2) {
                return 1;
            } else {
                return -1;
            }
        }
        if (o1 % 2 == 0 && o2 % 2 != 0) {
            return -1;
        }
        if (o1 % 2 != 0 && o2 % 2 == 0) {
            return 1;
        }
        if (o1 % 2 != 0 && o2 % 2 != 0) {
            if (o1 == o2) {
                return 0;
            }
            if (o1 > o2) {
                return 1;
            } else {
                return -1;
            }
        }
        return 2;
    }
}
