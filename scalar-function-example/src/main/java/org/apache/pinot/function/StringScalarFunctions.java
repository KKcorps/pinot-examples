package org.apache.pinot.function;

import org.apache.pinot.common.function.annotations.ScalarFunction;


public class StringScalarFunctions {

  @ScalarFunction
  public static String myName(String input){
    return input.toUpperCase().concat("-KARTIK");
  }

  @ScalarFunction(name = "str_hashcode")
  public static Integer strHashcode(String input){
    return input.hashCode();
  }

}
