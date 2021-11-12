package com.message;
/****
 *
 * @description 统一异常编码枚举
 */
public enum  ErrorCodeAndMessage {
    ERROR_UNKNOWN("U001","未知错误!"),
    NETWORK_ERROR("9999","网络连接异常"),
    QUERY_NULL("Q001","查询无记录");
    /**
     * 异常编码
     * **/
    private  String code;

    /**
     *
     * 异常信息
     */

    private String msg;

    ErrorCodeAndMessage(String code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ErrorCodeAndMessage{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }


}
