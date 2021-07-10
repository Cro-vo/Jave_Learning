package castle;

public class Handler {
	protected Game game;
	
	public void doCmd(String word) {}
	
	public boolean isBye()
	{
		return false;
	}
	
	public Handler(Game game) {
		this.game = game;
	}
}
