package notebook;

import java.util.ArrayList;

public class Notebook {
	private ArrayList<String> notes = new ArrayList<String>();
	
	public void addNote(String str)
	{
		notes.add(str);
	}
	
	public int getSize()
	{
		return notes.size();
	}
	
	public String getNote(int index)
	{
		return notes.get(index);
	}
	
	public void removeNote(int index)
	{
		notes.remove(index);
	}
	
	public String[] listNote()
	{
		String str[] = new String[notes.size()];
		notes.toArray(str);
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notebook nb = new Notebook();
		nb.addNote("first");
		nb.addNote("second");
		System.out.println(nb.getNote(0));
		nb.removeNote(0);
		System.out.println(nb.getNote(0));
	}

}
