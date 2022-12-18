package com.emlakcepte.client;

import com.emlakcepte.model.Banner;
import com.emlakcepte.service.BannerService;

import java.util.List;


public interface BannerServiceClient {
    List<Banner> getAll();

    Banner create(Banner banner);

}
