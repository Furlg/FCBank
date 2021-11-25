package hoop.message;

import java.io.Serializable;

/******
 *
 * @author 沙建斌
 * @date 2021-11-11
 * @description 请求返回类
 *                  所有请求返回类都在此包装后返回
 * @param <T>
 */
public class Response<T> implements Serializable {

    private static final long serialVersionUID = -342385966333935L;

    /***请求成功返回码***/
    private static final String successCode = "000000";

    /***返回body***/
    private T body;

    /***错误码***/
    private String code;

    /***错误信息***/
    private String msg;

    /**
     * 无参构造方法
     */
    public Response() {
        this.code = successCode;
        this.msg = "请求成功";
    }

    /**
     * 只返回body不返回错误信息
     */
    public Response(T body) {
        this();
        this.body = body;
    }

    /**
     * 只返回错误信息
     */
    public Response(String code, String msg) {
        this();
        this.code = code;
        this.msg = msg;
    }

    /**
     * 返回body+errorInfo
     */
    public Response(T body, String code, String msg) {
        this();
        this.body = body;
        this.code = code;
        this.msg = msg;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
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
}
