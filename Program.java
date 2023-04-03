public class Program {
    public static void main(String[] args) {
        ArrayClass<Integer> intList = new ArrayClass<>();
        intList.add(11); 
        intList.add(47);
        intList.add(21);
        intList.add(42);
        intList.add(75);
        intList.add(13);
        intList.add(58);
        intList.add(19);
        intList.add(23);
        intList.add(12);
        intList.add(89);
        intList.add(29);
        intList.printArray(); // печать масива
        intList.remForIdx(5); // удаление значения элемента по индексу
        intList.remForIdx(5);
        intList.printArray();
        intList.removeData(12); // удаление элемента по значению
        intList.removeData(88);
        intList.printArray();
        System.out.println(intList.minData()); // Поиск элемента с минимальным значением
        System.out.println(intList.maxData()); // Поиск элемента с максимальным значением
        System.out.println(intList.sumData()); // Сумма значений элементов массива
        System.out.println(intList.multData()); // Произведение элементов массива
        System.out.println(intList.findIDX(87)); // Поиск элемента по индексу (если его нет то возвращает -1)
        System.out.println(intList.findData(874)); // Проверка наличия элемента в массиве. Возвращает true, если элемент в массиве есть, false – нет.
        
        try {
            intList.BubbleSort();
            System.out.print("Результат:"); //  сортировка методом Пузырька
            intList.printArray();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ArrayClass<String> stringList = new ArrayClass<>(); // массив строк
        stringList.add("Дед"); // добавление элемента 
        stringList.add("Бабка");
        stringList.add("Внучка");
        stringList.add("Жучка");
        stringList.add("Кошка");
        stringList.add("Мышка");
        stringList.add("Репка");
        stringList.add("КурочкаРяба");
        stringList.add("Баба Яга");
        stringList.add("Кощей");
        stringList.add("Кот Баюн");
        stringList.add("Леший");
        stringList.printArray(); // печать
        stringList.remForIdx(1);
        stringList.printArray();


    }
}
