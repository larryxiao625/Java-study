package com.songPlayer.test;

import java.util.HashSet;
import java.util.Set;

import com.songPlayer.module.PlayList;
import com.songPlayer.module.Song;

public class TestDemo {
	/**
	 * 测试歌曲类
	 */
	static Song test1=new Song("s001","两只老虎","未知");
	static Song test2=new Song("s001","两只老虎","未知");
//	public static void testSong() {
//		System.out.println(test1);
//	}
	/**
	 * 测试播放列表类
	 */
	public static void testPlayList() {
		Set testList=new HashSet();
		PlayList testPlayList=new PlayList("主播放列表",testList);
		testPlayList.addToPlayList(test1);
		testPlayList.addToPlayList(test2);
		testPlayList.displayAllSong();
		
		
	}
	/**
	 * 测试播放器类
	 */
	public void testPlayListCollection() {
		
	}
	/**
	 * 主菜单
	 */
	public void mainMenu() {
		
	}
	/**
	 * 播放器列表管理菜单
	 */
	public void palyerListMenu() {
		
	}
	/**
	 * 播放器菜单
	 */
	public void playerMneu() {
		
	}
	
	/**
	 * 主流程实现
	 */
	public void test() {
		
	}
	public static void main(String[] args) {
		testPlayList();
	}
}
