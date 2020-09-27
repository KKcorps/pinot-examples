package org.apache.pinot.custom.function;

import org.apache.pinot.common.function.annotations.ScalarFunction;


public class CustomScalarFunctions {

  @ScalarFunction(name = "repeat_n")
  public static String repeat(String input, Integer N, String seperator) {
    String output = "";
    for (int i = 0; i < N; i++) {
      output = output + seperator + input;
    }
    return output.substring(seperator.length());
  }
}
