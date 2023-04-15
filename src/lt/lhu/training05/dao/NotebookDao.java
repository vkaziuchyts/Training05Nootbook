package lt.lhu.training05.dao;

import java.util.List;

import lt.lhu.training05.entity.Note;
import lt.lhu.training05.entity.Notebook;
import lt.lhu.training05.sourse.NotebookProvider;

public class NotebookDao {

	/*
	 * public void create() { NoteBookProvider.getInstance(); }
	 */

	private final NotebookProvider provider = NotebookProvider.getInstance();
	private final Notebook nb = provider.getNotebook();

	public void save(Note n) {
		nb.setNotes(n);
	}

	public List<Note> allNotes() {
		return nb.getNotes();
	}
}
