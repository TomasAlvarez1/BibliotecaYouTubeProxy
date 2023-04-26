package com.mycompany.youtubeproxy;

/**
 *
 * @author tomas
 */
public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib{

    @Override
    public void listVideos() {
        System.out.println("Envia solicitud al API a Youtube");
    }

    @Override
    public void getVideoInfo(String id) {
        System.out.println("La informacion del video es " + id);
    }

    @Override
    public void downloadVideo(String id) {
        System.out.println("Se esta descargando un vidio de YouTube" + id);
    }
    
}
