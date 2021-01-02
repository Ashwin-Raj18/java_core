package com.possoul.coreJava.designPattern.adapter;

public class MkvPlayer implements AdvancedMediaPlayer{
	
	   String s = "smith";
	   @Override
	   public void playMkv(String fileName) {
	      System.out.println("Playing mkv file. Name: "+ fileName);		
	   }

	   @Override
	   public void playMp4(String fileName) {
	      //do nothing
	   }
	}