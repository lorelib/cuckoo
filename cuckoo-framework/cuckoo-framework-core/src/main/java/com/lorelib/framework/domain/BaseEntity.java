package com.lorelib.framework.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author listening
 * @description
 * @date 2018-05-10 9:31
 * @since 1.0
 */
@Data
public class BaseEntity<ID> implements Serializable {
  private ID id;

  private Integer status;

  private Date crtTime;

  private String creator;

  private Date modTime;

  private String modifier;

  private String comment;
}
