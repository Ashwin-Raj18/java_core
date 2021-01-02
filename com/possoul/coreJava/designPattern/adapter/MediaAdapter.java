package com.possoul.coreJava.designPattern.adapter;

public class MediaAdapter implements AudioPlayer {

	   AdvancedMediaPlayer advancedMediaPlayer;

	   public MediaAdapter(String audioType){
	   
	      if(audioType.equalsIgnoreCase("mkv") ){
	         advancedMediaPlayer = new MkvPlayer();			
	         
	      }else if (audioType.equalsIgnoreCase("mp4")){
	         advancedMediaPlayer = new Mp4Player();
	      }	
	   }

	   @Override
	   public void play(String audioType, String fileName) {
	   
	      if(audioType.equalsIgnoreCase("mkv")){
	         advancedMediaPlayer.playMkv(fileName);
	      }
	      else if(audioType.equalsIgnoreCase("mp4")){
	         advancedMediaPlayer.playMp4(fileName);
	      }
	   }
	}
