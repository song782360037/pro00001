package itcast.service.consumer.client;

import itcast.service.consumer.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements UserClient {
    @Override
    public User findById(Integer id) {
        User user = new User();
        user.setUserName("出错了...");
        return user;
    }
}
