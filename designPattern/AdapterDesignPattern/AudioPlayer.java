package com.bridgeIt.designPattern.AdapterDesignPattern;

public class AudioPlayer implements MediaPlayer {

	
	@Override
	public void play(String type, String music) {
	
		if(type.equalsIgnoreCase("mp3")){
			
			System.out.println(type+" file now playing "+music);
		}else if(type.equalsIgnoreCase("vlc")||type.equalsIgnoreCase("mp4")){
			
			AdapterClass adapter=new AdapterClass();
			adapter.play(type, music);
		}
		
		
	}

	
}
