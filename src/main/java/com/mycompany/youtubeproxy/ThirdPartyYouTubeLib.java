/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.youtubeproxy;

/**
 *
 * @author tomas
 */
public interface ThirdPartyYouTubeLib {
    void listVideos();
    void getVideoInfo(String id);
    void downloadVideo(String id);
}
