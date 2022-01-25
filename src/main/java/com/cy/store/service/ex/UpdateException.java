package com.cy.store.service.ex;

/**
 * @ClassName UpdateException
 * @Description 更新数据时产生的异常
 * @Author Yxl
 * @Date 2022/1/22 17:54
 * @Version 1.0
 **/
public class UpdateException extends ServiceException{
    public UpdateException() {
        super();
    }

    public UpdateException(String message) {
        super(message);
    }

    public UpdateException(String message, Throwable cause) {
        super(message, cause);
    }

    public UpdateException(Throwable cause) {
        super(cause);
    }

    protected UpdateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}