package com.dvaid.lwp.tdql.model;

import com.dvaid.lwp.tdql.enums.BaseType;
import com.dvaid.lwp.tdql.enums.Option;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TdQuery {
  Option option;
  BaseType baseType;

  @Override
  public String toString() {
    return "TdQuery{" + "option=" + option + ", baseType=" + baseType + '}';
  }
}
