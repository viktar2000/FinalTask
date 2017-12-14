package Entity;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Notepad {
    private ArrayList<Note> notepad = new ArrayList<>();


    public ArrayList<Note> findNoteByDate(String date)
    {
       return this.notepad.stream().filter(note -> date.equals(note.getDate())).collect(Collectors.toCollection(ArrayList::new));

    }

    public ArrayList<Note> findNoteByContent(String content){
        return this.notepad.stream().filter(find -> content.equals(find.getContent())).collect(Collectors.toCollection(ArrayList::new));
    }





}
