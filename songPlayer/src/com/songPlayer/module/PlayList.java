package com.songPlayer.module;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PlayList {
	private String PlayListName;
	List<Song> musicList = new ArrayList<Song>();

	public PlayList() {

	}

	public PlayList(String playlistname, List musiclist) {
		this.PlayListName = playlistname;
		this.musicList = musiclist;
	}

	public String getPlayListName() {
		return PlayListName;
	}

	public void setPlayListName(String playListName) {
		PlayListName = playListName;
	}

	public List<Song> getMusicList() {
		return musicList;
	}

	public void setMusicList(List<Song> musiclist) {
		this.musicList = musiclist;
	}

	Scanner sc = new Scanner(System.in);
	Iterator<Song> it = musicList.iterator();

	/**
	 * 将歌曲添加到播放列表
	 */
	public void addToPlayList(Song song) {
		this.musicList.add(song);
	}

	/**
	 * 通过id查找歌曲
	 */
	public Song searchSongById(String id) {
		Song song = null;
		while (it.hasNext()) {
			song = it.next();
			if (song.getId() == id) {
				break;
			}
		}
		return song;

	}

	/**
	 * 通过名称查询歌曲
	 */
	public Song searchSongByName(String n) {
		Song song = null;
		while (it.hasNext()) {
			song = it.next();
			if (song.getName() == n) {
				break;
			}
		}
		return song;
	}

	/**
	 * 修改歌曲 通过id进行查找后修改,id保持不变
	 */
	public void updateSong(Song song) {
		musicList.remove(song);
		String id = song.getId();
		System.out.println("请输入修改后的名称");
		String songName = sc.next();
		System.out.println("请输入修改后的歌手");
		String singer = sc.next();
		Song tem = new Song(id, songName, singer);
		musicList.add(tem);
	}

	/**
	 * 从播放列表删除歌曲
	 */
	public void deleteSong(String id) {
		Song song = null;
		while (it.hasNext()) {
			song = it.next();
			if (it.next().getId() == id) {
				break;
			} else {
				System.out.println("未找到相应歌曲");
				break;
			}
		}
		musicList.remove(song);
	}

	/**
	 * 显示播放列表中的所有歌曲
	 */
	public void displayAllSong() {
		Iterator<Song> it = musicList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	/**
	 * 导出歌单
	 */
	public void exportPlayList() {
		try {
			FileOutputStream fos = new FileOutputStream(this.getPlayListName());
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			while (it.hasNext()) {
				oos.writeObject(it.next());
			}
			oos.flush();
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
