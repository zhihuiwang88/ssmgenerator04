package com.nengliang.web.vo;

import java.io.Serializable;

/**
 * 返回信息
 * 
 * @author Dell 20200225
 * @param <T>
 */
public class ResultVO<T> implements Serializable {

	/**
	 * @param code,状态码
	 * @param msg,信息
	 * @param data,数据
	 * 
	 */
	private Integer code;
	private String msg;
	private T data;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResultVO [code=" + code + ", msg=" + msg + "]";
	}

}
