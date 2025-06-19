package io.vertx.kafka.admin;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

/**
 * Converter and mapper for {@link io.vertx.kafka.admin.ListConsumerGroupOffsetsOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.kafka.admin.ListConsumerGroupOffsetsOptions} original class using Vert.x codegen.
 */
public class ListConsumerGroupOffsetsOptionsConverter {


  private static final Base64.Decoder BASE64_DECODER = JsonUtil.BASE64_DECODER;
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, ListConsumerGroupOffsetsOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
      }
    }
  }

   static void toJson(ListConsumerGroupOffsetsOptions obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

   static void toJson(ListConsumerGroupOffsetsOptions obj, java.util.Map<String, Object> json) {
  }
}
