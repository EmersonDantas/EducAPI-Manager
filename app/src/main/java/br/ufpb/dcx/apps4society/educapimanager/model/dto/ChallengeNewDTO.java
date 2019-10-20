package br.ufpb.dcx.apps4society.educapimanager.model.dto;

import java.io.Serializable;

public class ChallengeNewDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String word;
	
	private String soundUrl;
	private String videoUrl;
	private String imageUrl;

	private Long userId;
	
	public ChallengeNewDTO() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getSoundUrl() {
		return soundUrl;
	}

	public void setSoundUrl(String soundUrl) {
		this.soundUrl = soundUrl;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
}
