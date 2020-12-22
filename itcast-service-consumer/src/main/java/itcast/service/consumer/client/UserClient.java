package itcast.service.consumer.client;

import itcast.service.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "itcast-provider",fallback = UserClientFallback.class)
public interface UserClient {

    @GetMapping("/user/findById/{id}")
    public User findById(@PathVariable("id") Integer id);
}
