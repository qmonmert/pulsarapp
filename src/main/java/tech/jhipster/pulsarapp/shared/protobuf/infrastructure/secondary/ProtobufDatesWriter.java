package tech.jhipster.pulsarapp.shared.protobuf.infrastructure.secondary;

import com.google.protobuf.Timestamp;
import java.time.Instant;

public final class ProtobufDatesWriter {

  private ProtobufDatesWriter() {}

  public static Timestamp buildTimestamp(Instant instant) {
    if (instant == null) {
      return null;
    }

    return Timestamp.newBuilder().setSeconds(instant.getEpochSecond()).setNanos(instant.getNano()).build();
  }
}
