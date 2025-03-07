package tech.jhipster.pulsarapp.shared.protobuf.infrastructure.primary;

import com.google.protobuf.Timestamp;
import java.time.Instant;

public final class ProtobufDatesReader {

  private ProtobufDatesReader() {}

  public static Instant readInstant(Timestamp timestamp) {
    if (timestamp == null || timestamp.getSeconds() == 0) {
      return null;
    }

    return Instant.ofEpochSecond(timestamp.getSeconds(), timestamp.getNanos());
  }
}
