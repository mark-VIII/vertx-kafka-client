package io.vertx.kafka.admin;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

/**
 * Converter and mapper for {@link io.vertx.kafka.admin.ConsumerGroupListing}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.kafka.admin.ConsumerGroupListing} original class using Vert.x codegen.
 */
public class ConsumerGroupListingConverter {


  private static final Base64.Decoder BASE64_DECODER = JsonUtil.BASE64_DECODER;
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, ConsumerGroupListing obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "groupId":
          if (member.getValue() instanceof String) {
            obj.setGroupId((String)member.getValue());
          }
          break;
        case "simpleConsumerGroup":
          if (member.getValue() instanceof Boolean) {
            obj.setSimpleConsumerGroup((Boolean)member.getValue());
          }
          break;
      }
    }
  }

   static void toJson(ConsumerGroupListing obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

   static void toJson(ConsumerGroupListing obj, java.util.Map<String, Object> json) {
    if (obj.getGroupId() != null) {
      json.put("groupId", obj.getGroupId());
    }
    json.put("simpleConsumerGroup", obj.isSimpleConsumerGroup());
  }
}
