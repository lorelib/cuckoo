package com.lorelib.framework.exception;

/**
 * <p>
 * 基础异常
 * </p>
 * 
 * @author David.He
 * @date 2016年12月12日 下午3:51:48
 * @since 1.0
 */
public class CuckooException extends RuntimeException {
	/**
	 * 类全称
	 */
	private String clazz;

	/**
	 * 错误码
	 */
	private String code;

	public CuckooException(String message) {
		super(message);
	}

	public CuckooException(String clazz, String message) {
		super(message);
		this.clazz = clazz;
	}

	public CuckooException(String clazz, String code, String message) {
		super(message);
		this.clazz = clazz;
		this.code = code;
	}

	public String getClazz() {
		return clazz;
	}

	public String getCode() {
		return code;
	}

	@Override
	public String toString() {
		return this.getClass() + "{" + "module = '" + clazz + '\'' + ", message = '" + getMessage() + '\'' + '}';
	}
}
