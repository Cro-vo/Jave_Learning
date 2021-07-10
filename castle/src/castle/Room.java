package castle;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String, Room> exits = new HashMap<String, Room>();

    public Room(String description) 
    {
        this.description = description;
    }

    public void setExit(String dir, Room room)
    {
    	this.exits.put(dir, room);
    }

    @Override
    public String toString()
    {
        return description;
    }
    
    public Room getExit(String direction)
    {
    	Room ret = null;
    	ret = exits.get(direction);
    	return ret;
    }
    
    public String getRoomDesc()
    {
    	StringBuilder sb = new StringBuilder("");
    	for(String str : exits.keySet())
    	{
    		sb.append(str);
    		sb.append(" ");
    	}
    	return sb.toString();
    }
    
}
