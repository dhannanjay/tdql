package com.dvaid.lwp.tdql.parser;

import com.dvaid.lwp.tdql.enums.BaseType;
import com.dvaid.lwp.tdql.exception.TdqlException;
import com.dvaid.lwp.tdql.model.TdQuery;

public class BaseTypeQueryParser implements TdQueryParser {

  @Override
  public TdQuery parse(TdQuery tdQuery, int index, String... tokens) {
    try {
      String token = tokens[index];
      tdQuery.setBaseType(BaseType.valueOf(token.toUpperCase()));
      return tdQuery;
    } catch (Exception e) {
      throw new TdqlException("Exception encountered while base type parsing", e.getCause());
    }
  }
}
