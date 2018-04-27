package com.bridgeIt.designPattern.AdapterDesignPattern;

public class AdapterDemo {

	public static void main(String[] args) {
		
		AudioPlayer player=new AudioPlayer();
		player.play("vlc", "hiphop");
		player.play("mp3", "rock n roll");
		player.play("mp4", "POP");
	}
}
