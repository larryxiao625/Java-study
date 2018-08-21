package com.songPlayer.module;

import java.util.HashMap;
import java.util.Map;

public class PlayListCollection {
	Map playListMap=new HashMap();
	public PlayListCollection() {
		
	}
	public PlayListCollection(Map playlist) {
		this.playListMap=playlist;
	}
	public Map getPlayListMap() {
		return playListMap;
	}
	public void setPlayListMap(Map playListMap) {
		this.playListMap = playListMap;
	}
	/**
	 * 添加播放列表
	 */
	public void addPlayList(PlayList playList) {
		
	}
	/**
	 * 删除播放列表
	 */
	public void deletePlayList(PlayList playList) {
		
	}
	/**
	 * 通过名字查询
	 */
	public PlayList searchPlayListByName(String playListName) {
		
	}
	/**
	 * 显示所有播放列表名称
	 */
	public void displayPlayListName() {
		
	}
}
