package com.dvaid.lwp.tdql.parser;

import com.dvaid.lwp.tdql.enums.Option;
import com.dvaid.lwp.tdql.exception.TdqlException;
import com.dvaid.lwp.tdql.model.TdQuery;

public class OptionQueryParser implements TdQueryParser {

  private final BaseTypeQueryParser baseTypeQueryParser;

  public OptionQueryParser() {
    this.baseTypeQueryParser = new BaseTypeQueryParser();
  }

  @Override
  public TdQuery parse(TdQuery tdQuery, int index, String... tokens) {
    try {
      String token = tokens[index];
      tdQuery.setOption(Option.valueOf(token.toUpperCase()));
    } catch (Exception e) {
      throw new TdqlException("Exception encountered while base type parsing", e.getCause());
    }
    return baseTypeQueryParser.parse(tdQuery, index + 1, tokens);
  }
}
