package com.thy.common;

public class ReturnData {
	
	private Integer code;
	
	private String msg;
	
	private Object data;
	
	public static ReturnData success(Object data) {
		return new ReturnData(0, "操作成功", data);
	}
	
	public static ReturnData error(String msg) {
		return new ReturnData(-1, msg, null);
	}
	
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
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

	public ReturnData(Integer code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public ReturnData() {
		super();
	}
}
