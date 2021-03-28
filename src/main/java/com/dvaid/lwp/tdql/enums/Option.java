package com.dvaid.lwp.tdql.enums;

import java.util.HashMap;
import java.util.Map;

public enum Option {
  GET,
  DEFAULT;

  static Map<String, Option> map = new HashMap<>(3);

  static {
    for(Option option: Option.values()) {
      map.put(option.name(), option);
    }
  }

  static Option parse(String baseType) {
    return map.getOrDefault(baseType.toUpperCase(), DEFAULT);
  }

}
