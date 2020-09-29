package org.apache.pinot.custom.function;

import com.github.davidmoten.geo.GeoHash;
import org.apache.pinot.common.function.annotations.ScalarFunction;


public class CustomScalarFunctions {

  @ScalarFunction(name = "encode_geohash")
  public static String latLngToGeo(Double latitude, Double longitude, Integer geoLength) {
    return GeoHash.encodeHash(latitude, longitude, geoLength);
  }

}
