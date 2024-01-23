package tinkoftask4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int n = 8;
        int[] books = {9, 11, 10, 1, 3, 5, 4, 4};
        List<String> result = getMinimalBookList(books);
        System.out.println(result);
    }

    // Wrong...
    
    private static List<String> getMinimalBookList(int[] books) {
        // Сортируем массив книг
        java.util.Arrays.sort(books);

        // Инициализируем список для результата и переменную previous для хранения номера предыдущей книги
        List<String> result = new ArrayList<>();
        int previous = books[0];

        // Проходим по отсортированному массиву книг
        for (int i = 1; i < books.length; i++) {
            int current = books[i];

            // Если это первая книга или номера предыдущей и текущей книг не соседние, добавляем явно номер текущей книги в результат
            if (i == 1 || current - previous > 1) {
                result.add(String.valueOf(current));
                previous = current;
            } else if (i < books.length - 1 && current + 1 == books[i + 1]) {
                // Если номера предыдущей и текущей книг соседние, и следующая книга (если она есть) также соседняя с текущей, то не делаем ничего

            } else {
                // Если номера предыдущей и текущей книг соседние, но следующая книга (если она есть) не соседняя с текущей, добавляем в результат диапазон ... между предыдущей и текущей книгой
                result.set(result.size() - 1, previous + "..." + current);
                previous = current;
            }
        }

        return result;
    }
	
}