package com.songPlayer.module;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PlayList implements Serializable {
	private String PlayListName;
	static Set<Song> musicList = new HashSet<Song>();

	public PlayList() {

	}

	public PlayList(String playlistname, Set musiclist) {
		this.PlayListName = playlistname;
		this.musicList = musiclist;
	}

	public String getPlayListName() {
		return PlayListName;
	}

	public void setPlayListName(String playListName) {
		PlayListName = playListName;
	}

	public Set<Song> getMusicList() {
		return musicList;
	}

	public void setMusicList(Set<Song> musiclist) {
		this.musicList = musiclist;
	}

	Scanner sc = new Scanner(System.in);

	/**
	 * 将歌曲添加到播放列表
	 */
	public void addToPlayList(Song song) {
		if(musicList.isEmpty()==true) {
			this.musicList.add(song);
			return;
		}
		Iterator<Song> it = musicList.iterator();
		while (it.hasNext()) {
			if (it.next().equals(song) == true) {
				System.out.println("该歌曲已存在，请勿重复添加");
			}else {
				this.musicList.add(song);
			}
		}
	}

	/**
	 * 通过id查找歌曲
	 */
	public static Song searchSongById(String id) {
		Iterator<Song> it = musicList.iterator();
		Song song = null;
		while (it.hasNext()) {
			song=it.next();
			if (song.getId().equals(id)) {
				break;
			}else {
				song=null;
			}
		}
		return song;


	}

	/**
	 * 通过名称查询歌曲
	 */
	public Song searchSongByName(String n) {
		Iterator<Song> it = musicList.iterator();
		Song song = null;
		while (it.hasNext()) {
			song = it.next();
			if (song.getName().equals(n)) {
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
		System.out.println("修改成功");
	}

	/**
	 * 从播放列表删除歌曲
	 */
	public void deleteSong(String id) {
		Song song = null;
		Iterator<Song> it = musicList.iterator();
		if (musicList.isEmpty()) { // 判断播放列表是否为空
			System.out.println("此播放列表为空");
		} else {
			if(searchSongById(id)==null) {
				System.out.println("未找到该歌曲");
			}else {
				musicList.remove(song);
				System.out.println("删除成功");
			}
		}
	}

	/**
	 * 显示播放列表中的所有歌曲
	 */
	public void displayAllSong() {
		Iterator<Song> it = musicList.iterator();
		if (musicList.isEmpty()) {
			System.out.println("此播放列表为空");
		} else {
			while (it.hasNext()) {
				System.out.println("**********************");
				System.out.println(it.next().toString());
				System.out.println("**********************");
			}
		}
	}

	/**
	 * 导出歌单
	 */
	public void exportPlayList() {
		Iterator<Song> it = musicList.iterator();
		try {
			FileOutputStream fos = new FileOutputStream(this.getPlayListName(), true);
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
