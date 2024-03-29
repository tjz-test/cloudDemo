package com.tjz.cloudcommon.result;

import java.io.Serializable;

/**
 * @author 14791
 */
public interface IResultCode extends Serializable {
    /**
     * 获取结果消息
     *
     * @return 结果消息
     */
    String getMessage ();

    /**
     * 获取返回状态码
     *
     * @return 结果状态码
     */
    int getCode ();
}
