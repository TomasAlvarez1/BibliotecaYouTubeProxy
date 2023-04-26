/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtubeproxy;

/**
 *
 * @author tomas
 */
public class YouTubeManager {
    private ThirdPartyYouTubeLib service;

    public YouTubeManager(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    public void renderVideoPage(String id) {
        service.getVideoInfo(id);
        System.out.println("YouTubeManager - renderVideoPage");
    }

    public void renderListPanel() {
        service.listVideos();
        System.out.println("YouTubeManager - renderListPanel");
    }

    public void reactOnUserInput() {
        renderVideoPage("video_id");
        renderListPanel();
    }
}
