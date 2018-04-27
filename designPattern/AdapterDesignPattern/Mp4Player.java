package com.bridgeIt.designPattern.AdapterDesignPattern;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String file,String music) {
		
	}

	@Override
	public void playMp4(String file,String music) {
		
		System.out.println("playing MP4 file music "+music);
		
	}

}
