package Laptenkov;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс тестирует класс компаратор {@link CustomDigitComparator}.
 * @author habatoo
 */
class CustomDigitComparatorTest {

    CustomDigitComparator customDigitComparator;
    List<Integer> positiveList;
    List<Integer> negativeList;
    List<Integer> mixList;

    /**
     * Подготовка данных для тестирования.
     * Инициализация объектов {@link ArrayList} с числами {@link Integer}
     * и объекта {@link java.util.Comparator}
     */
    @BeforeEach
    void setUp() {
        customDigitComparator = new CustomDigitComparator();
        positiveList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            positiveList.add(i);
        }
        negativeList = new ArrayList<>();
        for (int i = -1; i > -7; i--) {
            negativeList.add(i);
        }
        mixList = new ArrayList<>();
        for (int i = -2; i < 4; i++) {
            mixList.add(i);
        }
    }

    /**
     * Очистака всех объектов после каждого теста.
     */
    @AfterEach
    void tearDown() {
        customDigitComparator = null;
        positiveList = null;
        negativeList = null;
        mixList = null;
    }

    /**
     * Метод {@link CustomDigitComparatorTest#comparePositive_Test()} тестирует метод
     * {@link CustomDigitComparator#compare(Integer, Integer)}.
     * Сценарий - подается массив целых положительных чисел, ожидается сортировка - четные по порядку,
     * потом не четные по порядку.
     */
    @Test
    void comparePositive_Test() {
        Assert.assertEquals(Arrays.asList(0, 1, 2, 3, 4, 5), Arrays.asList(positiveList.toArray()));
        positiveList.sort(new CustomDigitComparator());
        Assert.assertEquals(Arrays.asList(0, 2, 4, 1, 3, 5), Arrays.asList(positiveList.toArray()));
    }

    /**
     * Метод {@link CustomDigitComparatorTest#compareNegative_Test()} тестирует метод
     * {@link CustomDigitComparator#compare(Integer, Integer)}.
     * Сценарий - подается массив целых отрицательных чисел,
     * ожидается сортировка - четные по порядку,
     * потом не четные по порядку.
     */
    @Test
    void compareNegative_Test() {
        Assert.assertEquals(Arrays.asList(-1, -2, -3, -4, -5, -6), Arrays.asList(negativeList.toArray()));
        negativeList.sort(new CustomDigitComparator());
        Assert.assertEquals(Arrays.asList(-6, -4, -2, -5, -3, -1), Arrays.asList(negativeList.toArray()));
    }

    /**
     * Метод {@link CustomDigitComparatorTest#compareMix_Test()} тестирует метод
     * {@link CustomDigitComparator#compare(Integer, Integer)}.
     * Сценарий - подается массив целых положительных и отрицательных чисел,
     * ожидается сортировка - четные по порядку,
     * потом не четные по порядку.
     */
    @Test
    void compareMix_Test() {
        Assert.assertEquals(Arrays.asList(-2, -1, 0, 1, 2, 3), Arrays.asList(mixList.toArray()));
        mixList.sort(new CustomDigitComparator());
        Assert.assertEquals(Arrays.asList(-2, 0, 2, -1, 1, 3), Arrays.asList(mixList.toArray()));
    }

}