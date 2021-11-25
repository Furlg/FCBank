package hoop.message;

import java.io.Serializable;

/**
 * @author A-8626 沙建斌
 * @date 2021-11-11
 * @description 全局异常捕获类 所有运行时异常都在此捕获
 */
public class GlobalException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = -442233999400L;

    /***异常信息***/
    private final ErrorCodeAndMessage errorCodeAndMessage;

    /**
     * 构造异常捕获
     */
    public GlobalException(ErrorCodeAndMessage errorCodeAndMessage) {
        this.errorCodeAndMessage = errorCodeAndMessage;
    }

    /**
     * 获取异常信息
     */
    public ErrorCodeAndMessage getErrorCodeAndMessage() {
        return errorCodeAndMessage;
    }

}
