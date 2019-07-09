package com.learnspring.springcloud;

// 注意，这里的User对象不要调用错了，为防止调用错，可以自定义一个User类名

import com.learnspring.pojo.NikeUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    private final RestTemplate restTemplate;

    @Value("${user.url}")
    private String url;

    public OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/order/{id}")
    public NikeUser getOrder(@PathVariable int id) {
        return restTemplate.getForObject(url + id, NikeUser.class);
    }
}
