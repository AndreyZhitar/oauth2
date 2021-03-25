package com.example.demo.service;

import com.example.demo.model.to.TeamTo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

/**
 * DownloadService
 *
 * @author Andrii Zhytar
 */

@Service
@AllArgsConstructor
public class DownloadService {

    private final TeamService teamService;

    public void loadImages() {
        List<TeamTo> listTeamUrls = teamService.listTeamUrls();
        listTeamUrls.stream()
                .forEach(teamTo -> {
                    try {
                        String logo = teamTo.getLogo();
                        URL url = new URL(logo);
                        BufferedImage bufferedImage = ImageIO.read(url);
                        File file = new File("D:\\Java\\Logos" + logo);
                        ImageIO.write(bufferedImage, "jpg", file);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                });
    }
}
