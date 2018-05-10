package com.lorelib.framework.base;

import com.lorelib.framework.stereotype.DTO;

/**
 * @author listening
 * @description Request:
 * @create 2017 04 13 16:22.
 */
public interface Request extends DTO {
  boolean notBlank();
}
