package com.songPlayer.module;

import java.io.Serializable;

public class Song implements Serializable{
	private String id,name,singer;
	public Song() {
		
	}
	public Song(String id,String name,String singer) {
		this.id=id;
		this.name=name;
		this.singer=singer;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((singer == null) ? 0 : singer.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}if(this.getId()==((Song) obj).getId()&&this.getName()==((Song) obj).getName()&&this.getSinger()==((Song) obj).getSinger()) {
			return true;
		}
		return false;
	
	}
	
	public String toString() {
		String str="歌曲id："+this.getId()+"\n歌曲名："+this.getName()+"\n歌手："+this.getSinger();
		return str;
	}
}
