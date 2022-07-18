package com.tjz.cloudcommon.exception;

import io.iec.edp.caf.commons.exception.CAFRuntimeException;
import io.iec.edp.caf.commons.exception.ExceptionLevel;

/**
 * @author 14791
 * @describe 公共异常处理
 */
public class BaseException extends CAFRuntimeException {

    public BaseException(String serviceUnitCode, String resourceFile, String exceptionCode, String[] messageParams, Exception innerException) {
        super(serviceUnitCode, resourceFile, exceptionCode, messageParams, innerException);
    }

    public BaseException(String serviceUnitCode, String resourceFile, String exceptionCode, String[] messageParams, Exception innerException, ExceptionLevel level) {
        super(serviceUnitCode, resourceFile, exceptionCode, messageParams, innerException, level);
    }

    public BaseException(String serviceUnitCode, String resourceFile, String exceptionCode, String[] messageParams, Exception innerException, ExceptionLevel level, boolean bizException) {
        super(serviceUnitCode, resourceFile, exceptionCode, messageParams, innerException, level, bizException);
    }

    public BaseException(String serviceUnitCode, String exceptionCode, String message, Exception innerException) {
        super(serviceUnitCode, exceptionCode, message, innerException);
    }

    public BaseException(String serviceUnitCode, String exceptionCode, String message, Exception innerException, ExceptionLevel level) {
        super(serviceUnitCode, exceptionCode, message, innerException, level);
    }

    public BaseException(String serviceUnitCode, String exceptionCode, String message, Exception innerException, ExceptionLevel level, boolean bizException) {
        super(serviceUnitCode, exceptionCode, message, innerException, level, bizException);
    }
}
