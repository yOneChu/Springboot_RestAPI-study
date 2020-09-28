package org.kyhslam.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// HTTP Status Code
// 2XX -> OK
// 4XX -> Client가 잘못했을 경우
// 5xx -> Server 쪽 문제
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
