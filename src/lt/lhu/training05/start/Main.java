package lt.lhu.training05.start;

import java.util.List;

import lt.lhu.training05.entity.Note;
import lt.lhu.training05.input.ConsoleMenu;
import lt.lhu.training05.logic.NotebookLogic;
import lt.lhu.training05.output.NotebookOutput;

public class Main {

	public static void main(String[] args) {
		ConsoleMenu menu = new ConsoleMenu();
		
		
		NotebookLogic logic = new NotebookLogic();
		
		logic.add("Homework", "solve the task about the airport");
		logic.add("Video lectures", "Watch lecture 6 about arrays");
		logic.add("Ester", "Bake a cake according to my mother's recipe");
		
		List<Note> myNotes = logic.allNotes();
		
		NotebookOutput output = new NotebookOutput();
		
		output.print("all notes", myNotes);

	}

}
