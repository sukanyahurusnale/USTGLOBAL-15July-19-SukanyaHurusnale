package com.dev.songapp;

import java.sql.Connection;

public interface SongInt {

	public void searchSong();
	public void showAllSong();
	public void playAllSong();
	public void playRandomSong();
	public void playParticularSong();
	public void addSong();
	public void editSong();
	public void deleteSong();
	public Connection  establishConnection();
}
