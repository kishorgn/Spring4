package com.ignite.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class LMDuets implements CompactDisc {
	
	private String title="Latha Mangeshkar Duets";
	private String artist="Latha Mangeshkar";

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing "+title+" by "+artist);
	}

}
