package com.possoul.coreJava.designPattern.adapter;

public class Main {
	   public static void main(String[] args) {
		   
		   //mp3 player also can play mp4 and mkv using adapter
	      Mp3Player audioPlayer = new Mp3Player();

	      audioPlayer.play("mp3", "beyond the horizon.mp3");
	      audioPlayer.play("mp4", "alone.mp4");
	      audioPlayer.play("mkv", "far far away.mkv");
	      audioPlayer.play("avi", "mind me.avi");
	   }
	}
