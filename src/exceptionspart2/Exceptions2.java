package exceptionspart2;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions2 {

	public static void main(String[] args) throws ScannerException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int x = Integer.parseInt(scanner.nextLine()); // Преобразуем в примитивы
		
			if (x != 0) {
//				throw new IOException();
				throw new ScannerException("Пользователь ввел что-то кроме нуля!");
			}
		}
	}
}
