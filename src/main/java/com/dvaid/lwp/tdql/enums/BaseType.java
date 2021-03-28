package com.dvaid.lwp.tdql.enums;

import java.util.HashMap;
import java.util.Map;

public enum BaseType {
  HOLDING,
  ORDER,
  DEFAULT;

  static Map<String, BaseType> map = new HashMap<>(3);

  static {
    for(BaseType baseType: BaseType.values()) {
      map.put(baseType.name(), baseType);
    }
  }

  static BaseType parse(String baseType) {
    return map.getOrDefault(baseType.toUpperCase(), DEFAULT);
  }
}
