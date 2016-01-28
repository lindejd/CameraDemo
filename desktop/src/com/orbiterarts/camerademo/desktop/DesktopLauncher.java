package com.orbiterarts.camerademo.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.orbiterarts.camerademo.CameraDemo;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width=960;
		config.height=590;
		new LwjglApplication(new CameraDemo(), config);
	}
}
