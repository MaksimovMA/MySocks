package com.mma.socks.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="На складе нет запрашиваемого количества носков")
public class quantitySocksError extends RuntimeException {
    // ...
}
