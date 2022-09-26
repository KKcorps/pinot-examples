package org.apache.pinot.custom.function;

import com.github.davidmoten.geo.GeoHash;
import org.apache.pinot.spi.annotations.ScalarFunction;


public class CustomScalarFunctions {

  @ScalarFunction(names = {"encode_geohash"})
  public static String latLngToGeo(Double latitude, Double longitude, Integer geoLength) {
    return GeoHash.encodeHash(latitude, longitude, geoLength);
  }

}
