package cn.xudam.common.exception;

/**
 *
 */
public enum BizCodeEnume {

    UNKNOW_EXCEPTION(10000, "参数未知异常"),
    VALID_EXCEPTION(10001, "数据格式异常");

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private int code;
    private String msg;

    BizCodeEnume(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
