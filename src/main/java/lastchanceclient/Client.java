package lastchanceclient;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFW;

import net.fabricmc.api.ModInitializer;

public class Client implements ModInitializer{

	public static final Client INSTANCE = new Client();
	public Logger logger = LogManager.getLogger(Client.class);
	
	@Override
	public void onInitialize() {
		logger.info("Hello World");
	}
	
	public void onKeyPress(int key, int action) {
		GLFW.GLFW_REPEAT
	}
	
}	
	public void onTick() {
		
	}
}
