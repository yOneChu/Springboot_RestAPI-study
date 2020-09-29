package org.kyhslam.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor // 매개변수 없는 default 생성자 만듬
public class ExceptionResponse {
    private Date timestamp;
    private String message;
    private String details;
}