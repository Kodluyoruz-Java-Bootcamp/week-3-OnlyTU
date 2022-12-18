package com.emlakcepte.service;

import java.util.Arrays;
import java.util.List;

import com.emlakcepte.client.BannerServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.emlakcepte.model.Banner;
import com.emlakcepte.repository.BannerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Service
public class BannerService implements BannerServiceClient {

	@Autowired
	RestTemplate restTemplate;

	final String ROOT_URI="https://localhost:8080";

	@GetMapping(value = "/banners")
	public List<Banner> getAll(){
		ResponseEntity<Banner[]> response = restTemplate.getForEntity(ROOT_URI, Banner[].class);
		return Arrays.asList(response.getBody());
	}

	@Override
	@PostMapping(value = "/banners")
	public Banner create(Banner banner) {
		ResponseEntity<Banner> response = restTemplate.postForEntity(ROOT_URI, banner, Banner.class);
		return response.getBody();
	}
}
