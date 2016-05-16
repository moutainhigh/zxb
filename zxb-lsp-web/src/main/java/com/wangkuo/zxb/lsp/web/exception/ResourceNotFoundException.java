package com.wangkuo.zxb.lsp.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2014/3/20
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 5368553002860438635L;
}
