package com.dvaid.lwp.tdql.parser;

import com.dvaid.lwp.tdql.model.TdQuery;

public interface TdQueryParser {
  TdQuery parse(TdQuery tdQuery, int index, String... tokens);
}
