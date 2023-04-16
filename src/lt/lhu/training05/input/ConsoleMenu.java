package lt.lhu.training05.input;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
		NotebookLogic logic = new NotebookLogic();
		NotebookOutput output = new NotebookOutput();
		int x = 0;
		String s = "";

		while (!"5".equals(s)) {
			System.out.println("1. Для добавления новой записи в блокнот введите  - 1");
			System.out.println("2. Для поиска записи в блокноте по содержанию введите  - 2");
			System.out.println("3. Для поиска  записи в блокноте по дате создания введите - 3");
			System.out.println("4. Для просмотра всех записей введите - 4");
			System.out.println("5. Для выхода из приложения введите 5");
			s = scan.next();

			try {
				x = Integer.parseInt(s);
			} catch (NumberFormatException e) {
				System.out.println("Неверный ввод");
			}
			
			String sDate1 = "27/11/1973";
			Date date1 = null;
			try {
				date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
			} catch (ParseException e) {
				e.printStackTrace();
			}

			switch (x) {
			case 1:
				
				logic.add("Homework", "solve the task about the airport", date1);
				logic.add("Video lectures", "Watch lecture 6 about arrays", date1);
				logic.add("Ester", "Bake a cake according to my mother's recipe", date1);
				break;
			case 2:
				List<Note> myNotes = logic.allNotes();

				logic.find("What Lecture");
				output.print("all notes", myNotes);
				break;
			case 3:
				List<Note> myNotes2 = logic.allNotes();

				logic.find(date1);
				output.print("all notes", myNotes2);
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
