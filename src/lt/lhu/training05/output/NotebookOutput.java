package lt.lhu.training05.output;

import java.util.List;

import lt.lhu.training05.entity.Note;

public class NotebookOutput {
public void print(String title, List<Note> notes) {
		
		System.out.println(title.toUpperCase());
		System.out.println();
		
		if(notes == null || notes.size() <= 0) {
			System.out.println("Нет записей для вывода.");
			return;
		}
		
		for(Note n : notes) {
			System.out.println(n.getId() + " - " + n.getTitle() + " - " + n.getContent());
		}
		
	}

}
