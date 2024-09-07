public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 300;
        double b = 12;
        System.out.println("Сумма чисел " + a + " и " + b + " = " + calculator.sum(a, b));
        System.out.println("Деление чисел " + a + " и " + b + " = " + calculator.divide(a, b));
        System.out.println("Умножение чисел " + a + " и " + b + " = " + calculator.multiply(a, b));
        System.out.println("Вычитание чисел " + a + " и " + b + " = " + calculator.subtract(a, b));

        System.out.println("__________________");

        Integer[] array01 = {1, 2, 3};
        Integer[] array02 = {1, 2, 3};
        Integer[] array03 = {4, 5, 6};
        Double[] array04 = {1.0, 2.0, 3.0};
        Object[] array05 = {4.0, 5.0, 6.0};

        String[] array11 = {"a", "b", "c"};
        String[] array12 = {"a", "b", "c"};
        String[] array13 = {"d", "e", "f"};
        Object[] array14 = {"d", "e", "f"};

        ArrayComparator arrayComparator = new ArrayComparator();

        System.out.println(arrayComparator.compareArrays(array01, array02)); // одинаковые значения Integer
        System.out.println(arrayComparator.compareArrays(array01, array03)); // разные значения Integer
        System.out.println(arrayComparator.compareArrays(array03, array04)); // разные типы Integer/Double
        System.out.println(arrayComparator.compareArrays(array04, array05)); // разные типы Double/Object
        System.out.println(arrayComparator.compareArrays(array11, array12)); // одинаковые значения String
        System.out.println(arrayComparator.compareArrays(array11, array13)); // разные значения String
        System.out.println(arrayComparator.compareArrays(array01, array13)); // разные типы Integer/String
        System.out.println(arrayComparator.compareArrays(array13, array14)); // разные типы String/ Object

        System.out.println("____________________");

        Pair<String, Integer> pair = new Pair<>("one, two", 12);
        System.out.println(pair);
        System.out.println("Первый элемент в паре: " + pair.getFirstObj());
        System.out.println("Второй элемент в паре: " + pair.getSecondObj());

    }
}