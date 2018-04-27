package com.bridgeIt.designPattern.AdapterDesignPattern;

public class AdapterClass implements MediaPlayer {

	AdvancedMediaPlayer player;

	@Override
	public void play(String type, String music) {
		
		if(type.equalsIgnoreCase("Vlc")){
			
			AdvancedMediaPlayer player=new VlcPlayer();
			player.playVLC(type,music);;
			
		}else if (type.equalsIgnoreCase("mp4")) {
			
			AdvancedMediaPlayer player=new Mp4Player();
			player.playMp4(type, music);
			
		}
	}
	
	
	
}
