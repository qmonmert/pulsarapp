package tech.jhipster.pulsarapp.shared.protobuf.infrastructure.secondary;

import static org.assertj.core.api.Assertions.*;

import com.google.protobuf.Timestamp;
import java.time.Instant;
import org.junit.jupiter.api.Test;
import tech.jhipster.pulsarapp.UnitTest;

@UnitTest
class ProtobufDatesWriterTest {

  @Test
  void shouldBuildNullTimestampFromNullInstant() {
    assertThat(ProtobufDatesWriter.buildTimestamp(null)).isNull();
  }

  @Test
  void shouldBuildTimestampFromInstant() {
    assertThat(ProtobufDatesWriter.buildTimestamp(Instant.ofEpochMilli(1337))).isEqualTo(
      Timestamp.newBuilder().setSeconds(1).setNanos(337000000).build()
    );
  }
}
