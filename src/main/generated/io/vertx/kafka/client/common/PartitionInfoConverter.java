package io.vertx.kafka.client.common;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

/**
 * Converter and mapper for {@link io.vertx.kafka.client.common.PartitionInfo}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.kafka.client.common.PartitionInfo} original class using Vert.x codegen.
 */
public class PartitionInfoConverter {


  private static final Base64.Decoder BASE64_DECODER = JsonUtil.BASE64_DECODER;
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, PartitionInfo obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "inSyncReplicas":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.kafka.client.common.Node> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof JsonObject)
                list.add(new io.vertx.kafka.client.common.Node((io.vertx.core.json.JsonObject)item));
            });
            obj.setInSyncReplicas(list);
          }
          break;
        case "leader":
          if (member.getValue() instanceof JsonObject) {
            obj.setLeader(new io.vertx.kafka.client.common.Node((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
        case "partition":
          if (member.getValue() instanceof Number) {
            obj.setPartition(((Number)member.getValue()).intValue());
          }
          break;
        case "replicas":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.kafka.client.common.Node> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof JsonObject)
                list.add(new io.vertx.kafka.client.common.Node((io.vertx.core.json.JsonObject)item));
            });
            obj.setReplicas(list);
          }
          break;
        case "topic":
          if (member.getValue() instanceof String) {
            obj.setTopic((String)member.getValue());
          }
          break;
      }
    }
  }

   static void toJson(PartitionInfo obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

   static void toJson(PartitionInfo obj, java.util.Map<String, Object> json) {
    if (obj.getInSyncReplicas() != null) {
      JsonArray array = new JsonArray();
      obj.getInSyncReplicas().forEach(item -> array.add(item.toJson()));
      json.put("inSyncReplicas", array);
    }
    if (obj.getLeader() != null) {
      json.put("leader", obj.getLeader().toJson());
    }
    json.put("partition", obj.getPartition());
    if (obj.getReplicas() != null) {
      JsonArray array = new JsonArray();
      obj.getReplicas().forEach(item -> array.add(item.toJson()));
      json.put("replicas", array);
    }
    if (obj.getTopic() != null) {
      json.put("topic", obj.getTopic());
    }
  }
}
