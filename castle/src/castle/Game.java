package castle;

import java.util.HashMap;
import java.util.Scanner;

public class Game {
    private Room currentRoom;
    private HashMap<String, Handler> handlers = new HashMap<String, Handler>();
        
    public Game() 
    {
        createRooms();
        handlers.put("bye", new HandlerBye(this));
        handlers.put("help", new HandlerHelp(this));
        handlers.put("go", new HandlerGo(this));
    }
    
    public String helpPrompt()
    {
    	StringBuilder sb = new StringBuilder();
    	for (String str : handlers.keySet())
    	{
    		sb.append(str);
    		sb.append(" ");
    	}
    	return sb.toString();
    }

    private void createRooms()
    {
        Room outside, lobby, pub, study, bedroom;
      
        //	制造房间
        outside = new Room("城堡外");
        lobby = new Room("大堂");
        pub = new Room("小酒吧");
        study = new Room("书房");
        bedroom = new Room("卧室");
        
        //	初始化房间的出口
        outside.setExit("east", lobby);
        outside.setExit("south", study);
        outside.setExit("west", pub);
        outside.setExit("up", pub);
        lobby.setExit("west", outside);
        pub.setExit("east", outside);
        pub.setExit("down", outside);
        study.setExit("north", outside);
        study.setExit("east", bedroom);
        bedroom.setExit("west", study);
        
        
        currentRoom = outside;  //	从城堡门外开始
    }

    private void printWelcome() {
        System.out.println();
        System.out.println("欢迎来到城堡！");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("如果需要帮助，请输入 'help' 。");
        System.out.println();
        showPrompt();
    }

    // 以下为用户命令

    public void goRoom(String direction) 
    {
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("那里没有门！");
        }
        else {
            currentRoom = nextRoom;
            showPrompt();
        }
    }
	
	private void showPrompt() {
		// TODO Auto-generated method stub
        System.out.println("你在" + currentRoom);
        System.out.print("出口有: ");
        System.out.println(currentRoom.getRoomDesc());
        System.out.println();
	}
	
	private void play()
	{
		Scanner in = new Scanner(System.in);
		while (true) {
			String line = in.nextLine();
			String[] words = line.split(" ");
			Handler handler = handlers.get(words[0]);
			String value = "";
			if (words.length > 1)
			{
				value = words[1];
			}
			if (handler != null)
			{
				handler.doCmd(value);
				if (handler.isBye())
				{
					break;
				}
			}
			
//			if (words[0].equals("help")) {
//				printHelp();
//			} else if (words[0].equals("go")) {
//				goRoom(words[1]);
//			} else if (words[0].equals("bye")) {
//				break;
//			}
		}
		in.close();
	}

	public static void main(String[] args) {
		Game game = new Game();
		game.printWelcome();
		game.play();
		
        System.out.println("感谢您的光临。再见！");
        
	}

}
