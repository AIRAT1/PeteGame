package de.android.ayrathairullin.petegame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import de.android.ayrathairullin.petegame.PeteGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Pete";
		config.width = 640;
		config.height = 480;
		new LwjglApplication(new PeteGame(), config);
	}
}
