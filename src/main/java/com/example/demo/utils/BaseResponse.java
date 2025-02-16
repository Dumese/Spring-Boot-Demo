package com.example.demo.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = -3333933005497247006L;

    private Integer code;

    private String msg;

    private Object data;

    public BaseResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseResponse success() {
        return new BaseResponse(200, "操作成功！");
    }

    public BaseResponse success(String msg) {
        return new BaseResponse(200, msg);
    }

    public BaseResponse success(Object data) {
        return new BaseResponse(200, "操作成功！", data);
    }

    public BaseResponse fail(String msg) {
        return new BaseResponse(500, "操作失败:" + msg);
    }
}
