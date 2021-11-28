package com.itmuch.contentcenter.feignclient.fallback;

import com.itmuch.contentcenter.domain.dto.user.UserDTO;
import com.itmuch.contentcenter.feignclient.UserCenterFeignClient;
import org.springframework.stereotype.Component;

/**
 *  feign整合sentinel
 *  feign中fallback拦截，但不能获取到异常。
 *  fallbackFactory可以获取到异常。
 *  fallback和fallbackFactory二选一。
 */
@Component
public class UserCenterFeignClientFallback implements UserCenterFeignClient {
    @Override
    public UserDTO findById(Integer id) {
        UserDTO userDTO = new UserDTO();
        userDTO.setWxNickname("流控/降级返回的用户");
        return userDTO;
    }
}
