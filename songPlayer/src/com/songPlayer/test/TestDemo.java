package com.songPlayer.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.songPlayer.module.PlayList;
import com.songPlayer.module.PlayListCollection;
import com.songPlayer.module.Song;

public class TestDemo {
	/**
	 * 测试歌曲类 测试完成注释
	 */
//	static Song test1 = new Song("s001", "两只老虎", "未知");
//	static Song test2 = new Song("s001", "两只老虎", "未知");
//	static Set testList = new HashSet();
//	static PlayList testPlayList = new PlayList("主播放列表", testList);
	static Scanner sc = new Scanner(System.in);
//	public static void testSong() {
//		System.out.println(test1);
//	}
	/**
	 * 测试播放列表类 测试完成注释
	 */
//	public static void testPlayList() {
//		testPlayList.addToPlayList(test1);
//		testPlayList.addToPlayList(test2);
//		if (testPlayList.searchSongById("s001") == null) {
//			System.out.println("未找到相应歌曲");
//		} else {
//			System.out.println(testPlayList.searchSongById("s001"));
//		}
//		testPlayList.displayAllSong();
//		testPlayList.exportPlayList();
//		testPlayList.deleteSong("s001");
//		System.out.println("**********************");
//		testPlayList.displayAllSong();
//		testPlayList.exportPlayList();
//
//	}

	/**
	 * 测试播放器类 测试完成注释
	 */
//	public static void testPlayListCollection() {
//		Map<String,PlayList> test1=new HashMap();
//		PlayListCollection test=new PlayListCollection(test1);
//		test.addPlayList(testPlayList);
//		test.displayPlayListName();
//		System.out.println("******************");
//		test.deletePlayList(testPlayList);
//		if((test.searchPlayListByName("主播放列表"))==null) {
//			System.out.println("未找到播放列表");
//		}else {
//			System.out.println(test.searchPlayListByName("主播放列表").getPlayListName());
//		}
//		
//	}

	/**
	 * 主菜单
	 */
	public static void mainMenu() {
		System.out.println("**主菜单**");
		System.out.println("1--播放列表管理");
		System.out.println("2--播放器管理");
		System.out.println("0--退出");
	}

	/**
	 * 播放器列表管理菜单
	 */
	public static void palyerListMenu() {
		System.out.println("**播放列表管理**");
		System.out.println("1--将歌曲添加到主播放列表");
		System.out.println("2--将歌曲添加到普通播放列表");
		System.out.println("3--通过歌曲id查询播放列表中的歌曲");
		System.out.println("4--通过歌曲名称查询播放列表中的歌曲");
		System.out.println("5--修改播放列表中的歌曲");
		System.out.println("6--删除播放列表中的歌曲");
		System.out.println("7--显示播放列表中的所有歌曲");
		System.out.println("8--导出歌单");
		System.out.println("9--返回上一级菜单");
	}

	/**
	 * 播放器菜单
	 */
	public static void playerMneu() {
		System.out.println("**播放器管理**");
		System.out.println("1--向播放器添加播放列表");
		System.out.println("2--从播放器删除播放列表");
		System.out.println("3--通过名字查询播放列表信息");
		System.out.println("4--显示所有播放列表名称");
		System.out.println("9--返回上一级菜单");
	}

	/**
	 * 主流程实现
	 */

	public static void main(String[] args) {
		Set<Song> mainSong = new HashSet();
		PlayList mainList = new PlayList("主播放列表", mainSong);
		Map<String, PlayList> playListMap = new HashMap<>();
		PlayListCollection playListCollection = new PlayListCollection(playListMap);
		playListCollection.addPlayList(mainList);
		mainMenu();
		int n = sc.nextInt();
		boolean mainFlag = true;
		while (mainFlag) {
			switch (n) {
			case 1:
				boolean flag1 = true;
				while (true) {
					palyerListMenu();
					int m = sc.nextInt();
					switch (m) {
					case 1:
						System.out.println("请输入要添加的歌曲数量");
						int num = sc.nextInt();
						for (int i = 0; i < num; i++) {
							System.out.println("请输入第" + (i + 1) + "歌曲id");
							String songID = sc.next();
							System.out.println("请输入第" + (i + 1) + "歌曲名称");
							String songName = sc.next();
							System.out.println("请输入第" + (i + 1) + "歌手");
							String songSinger = sc.next();
							Song song = new Song(songID, songName, songSinger);
							mainList.addToPlayList(song);
						}
						break;
					case 2:
						System.out.println("请输入播放列表名称");
						String playListName = sc.next();
						if ((playListCollection.searchPlayListByName(playListName)) == null) {
							System.out.println("未找到该播放列表，请重新输入");
							break;
						} else {
							System.out.println("请输入要添加的歌曲数量");
							int num2 = sc.nextInt();
							for (int i = 0; i < num2; i++) {
								System.out.println("请输入第" + (i + 1) + "歌曲id");
								String songID = sc.next();
								if (mainList.searchSongById(songID) != null) {
									(playListCollection.searchPlayListByName(playListName))
											.addToPlayList(mainList.searchSongById(songID));
									break;
								} else {
									System.out.println("请输入第" + (i + 1) + "歌曲名称");
									String songName = sc.next();
									System.out.println("请输入第" + (i + 1) + "歌手");
									String songSinger = sc.next();
									Song song = new Song(songID, songName, songSinger);
									(playListCollection.searchPlayListByName(playListName)).addToPlayList(song);
								}
							}
						}
						break;
					case 3:
						System.out.println("请输入要查询歌曲所在的播放列表");
						String str3 = sc.next();
						PlayList playList3;
						if ((playListCollection.searchPlayListByName(str3)) == null) {
							System.out.println("未找到该播放列表，请重新输入");
							break;
						} else {
							playList3 = (playListCollection.searchPlayListByName(str3));
						}
						System.out.println("请输入要查询的id");
						String ID = null;
						ID = sc.next();
						if (playList3.searchSongById(ID) == null) {
							System.out.println("未找到该歌曲");
						} else {
							System.out.println("已找到该歌曲，歌曲信息如下:");
							System.out.println(playList3.searchSongById(ID));
						}
						break;
					case 4:
						System.out.println("请输入要查询的播放列表");
						String str4 = sc.next();
						PlayList playList4;
						if ((playListCollection.searchPlayListByName(str4)) == null) {
							System.out.println("未找到该播放列表，请重新输入");
							break;
						} else {
							playList4 = (playListCollection.searchPlayListByName(str4));
						}
						System.out.println("请输入要查询的歌曲名");
						String Name4 = null;
						Name4 = sc.next();
						if (playList4.searchSongById(Name4) == null) {
							System.out.println("未找到该歌曲");
						} else {
							System.out.println("已找到该歌曲，歌曲信息如下:");
							System.out.println(playList4.searchSongByName(Name4));
						}
						break;
					case 5:
						System.out.println("请输入要修改歌曲所在的列表名称");
						String playList5 = sc.next();
						if ((playListCollection.searchPlayListByName(playList5)) == null) {
							System.out.println("未找到该播放列表，请重新输入");
							break;
						}
						System.out.println("请输入要修改歌曲的id");
						String ID5 = sc.next();
						System.out.println("请输入修改后的歌曲名");
						String changeName = sc.next();
						System.out.println("请输入修改后的歌手");
						String changeSinger = sc.next();
						Song changeSong = new Song(ID5, changeName, changeSinger);
						if ((playListCollection.searchPlayListByName(playList5)) == mainList) {

							if (mainList.searchSongById(ID5) == null) {
								System.out.println("未找到该歌曲，请重新输入");
							} else {
								Set<Entry<String, PlayList>> set = playListCollection.getPlayListMap().entrySet();

								for (Entry<String, PlayList> entry : set) { // 修改主播放目录的歌曲后，全播放列表进行替换
									entry.getValue().deleteSong(ID5);
									entry.getValue().addToPlayList(changeSong);
									break;
								}
								System.out.println("修改成功");

							}
						} else {
							(playListCollection.searchPlayListByName(playList5)).deleteSong(ID5);
							(playListCollection.searchPlayListByName(playList5)).addToPlayList(changeSong);
							System.out.println("修改成功");
							break;
						}
					case 6:
						System.out.println("请输入要删除歌曲所在的列表名称");
						String playList6 = sc.next();
						if ((playListCollection.searchPlayListByName(playList6)) == null) {
							System.out.println("未找到该播放列表，请重新输入");
							break;
						}
						System.out.println("请输入要修改歌曲的id");
						String ID6 = sc.next();
						if ((playListCollection.searchPlayListByName(playList6)) == mainList) {

							if (mainList.searchSongById(ID6) == null) {
								System.out.println("未找到该歌曲，请重新输入");
							} else {
								Set<Entry<String, PlayList>> set = playListCollection.getPlayListMap().entrySet();
								for (Entry<String, PlayList> entry : set) { // 删除主播放列表的歌曲，进行全播放列表遍历删除
									entry.getValue().deleteSong(ID6);
									System.out.println("删除成功");
									break;
								}
							}
						} else {
							(playListCollection.searchPlayListByName(playList6)).deleteSong(ID6);
							System.out.println("删除成功");
							break;
						}
					case 7:
						System.out.println("请输入要查看播放列表名称");
						String Name7 = sc.next();
						if ((playListCollection.searchPlayListByName(Name7)) == null) {
							System.out.println("未找到该播放列表");
							break;
						} else {
							(playListCollection.searchPlayListByName(Name7)).displayAllSong();
						}
					case 8:
						System.out.println("请输入要导出的播放列表的名称");
						String playListName8=sc.next();
						if ((playListCollection.searchPlayListByName(playListName8)) == null) {
							System.out.println("未找到该播放列表");
							break;
						} else {
							(playListCollection.searchPlayListByName(playListName8)).exportPlayList();
							break;
						}
					case 9:
						flag1=false;
						break;
					}
				}
			case 2:
				boolean flag2;
				do{
					flag2=true;
					playerMneu();
					int i;
					i = sc.nextInt();
					switch (i) {
					case 1:
						System.out.println("输入要添加播放列表的名称");
						String playListName = sc.next();
						Set playListSet = new HashSet();
						playListCollection.addPlayList(new PlayList(playListName, playListSet));
						break;
					case 2:
						System.out.println("请输入要删除的播放列表的名称");
						String playListName2 = sc.next();
						if ((playListCollection.searchPlayListByName(playListName2)) == null) {
							System.out.println("未找到该输入列表");
						} else {
							playListCollection.deletePlayList(playListCollection.searchPlayListByName(playListName2));
							System.out.println("删除成功");
						}
						break;
					case 3:
						System.out.println("请输入要查找列表的名称");
						String playListName3 = sc.next();
						if ((playListCollection.searchPlayListByName(playListName3)) == null) {
							System.out.println("未找到播放列表");
						} else {
							System.out.println("已经找到"
									+ (playListCollection.searchPlayListByName(playListName3).getPlayListName()));
						}
						break;
					case 4:
						playListCollection.displayPlayListName();
						break;
					case 9:
						flag2 = false;
						break;
					}
				}while(flag2);
				
				break;
			}
		}
	}
}
