package com.douzone.container.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class HighSchoolRapper2Final implements CompactDisc {
	private String artist = "김하온";
	private String song = "붕붕";
	
	@Override
	public void play() {
		System.out.println("Playing "+ song + " by " + artist);
	}

}
