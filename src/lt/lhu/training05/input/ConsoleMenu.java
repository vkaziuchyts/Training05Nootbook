package lt.lhu.training05.input;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import lt.lhu.training05.entity.Note;
import lt.lhu.training05.logic.NotebookLogic;
import lt.lhu.training05.output.NotebookOutput;

public class ConsoleMenu {
	public void startMenu() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner stringScanner = new Scanner(System.in);
		NotebookLogic logic = new NotebookLogic();
		NotebookOutput output = new NotebookOutput();
		int x = 0;
		String s = "";

		while (!"5".equals(s)) {
			System.out.println("Для добавления новой записи в блокнот введите  - 1");
			System.out.println("Для поиска записи в блокноте по содержанию введите  - 2");
			System.out.println("Для поиска  записи в блокноте по дате создания введите - 3");
			System.out.println("Для просмотра всех записей введите - 4");
			System.out.println("Для выхода из приложения введите 5");
			s = scan.next();

			try {
				x = Integer.parseInt(s);
			} catch (NumberFormatException e) {
				System.out.println("Неверный ввод");
			}
			
			/*String sDate1 = "27/11/1973";
			Date date1 = null;
			try {
				date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
			} catch (ParseException e) {
				e.printStackTrace();
			}*/
			
			switch (x) {
			case 1:
				System.out.println("Введите название записи");
				String title = stringScanner.nextLine();
				System.out.println("Введите содержание записи");
				String content = stringScanner.nextLine();
				System.out.println("Введите дату создания записи в формате dd/MM/yyyy");
				String sDate1 = stringScanner.nextLine();
				Date date1 = null;
				try {
					date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				logic.add(title, content, date1);
				//logic.add("Video lectures", "Watch lecture 6 about arrays", date1);
				//logic.add("Ester", "Bake a cake according to my mother's recipe", date1);
				break;
			case 2:
				System.out.println("Введите содержание записи");
				String findWord = stringScanner.nextLine();
				List<Note> myNotes = logic.find(findWord);
				output.print("find note", myNotes);
				break;
			case 3:
				System.out.println("Введите дату создания записи в формате dd/MM/yyyy");
				String sDate2 = stringScanner.nextLine();
				Date date2 = null;
				try {
					date2 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				List<Note> myNotes2 = logic.find(date2);
				output.print("notes with date", myNotes2);
				break;
			case 4:
				List<Note> myNotes3 = logic.allNotes();

				output.print("all notes", myNotes3);
				break;
			}
		}
		System.out.println("До свидания!");
	}

}
