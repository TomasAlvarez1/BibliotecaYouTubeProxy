package com.mycompany.youtubeproxy;

/**
 *
 * @author tomas
 */
public class Application {

    public static void main(String[] args) {
        ThirdPartyYouTubeLib service = new ThirdPartyYouTubeClass();
        ThirdPartyYouTubeLib proxy =new CachedYouTubeClass(service);
        YouTubeManager manager = new YouTubeManager(proxy);
        manager.reactOnUserInput();
        
    }
}
