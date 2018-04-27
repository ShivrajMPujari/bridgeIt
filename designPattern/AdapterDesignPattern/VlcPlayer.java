package com.bridgeIt.designPattern.AdapterDesignPattern;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String file,String music) {
		
		System.out.println("playing VLC player music "+music);
	}

	@Override
	public void playMp4(String file,String music) {

		
		
	}

}
