package com.mycompany.youtubeproxy;

/**
 *
 * @author tomas
 */
public class CachedYouTubeClass implements ThirdPartyYouTubeLib{
    
    private ThirdPartyYouTubeLib service;
    private String listCache, videoCache;
    private boolean needReset;

    public CachedYouTubeClass(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    public void listVideos() {
        if (listCache == null || needReset) {
            listCache = "CachedYouTubeClass - listVideos";
        }
        System.out.println(listCache);
    }

    public void getVideoInfo(String id) {
        if (videoCache == null || needReset) {
            videoCache = "CachedYouTubeClass - getVideoInfo";
        }
        System.out.println(videoCache);
    }

    public void downloadVideo(String id) {
        if (!downloadExists(id) || needReset) {
            service.downloadVideo(id);
        }
    }

    private boolean downloadExists(String id) {
        return true;
    }
}
