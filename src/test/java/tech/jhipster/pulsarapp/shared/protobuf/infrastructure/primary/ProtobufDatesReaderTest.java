package tech.jhipster.pulsarapp.shared.protobuf.infrastructure.primary;

import static org.assertj.core.api.Assertions.*;

import com.google.protobuf.util.Timestamps;
import java.util.Date;
import org.junit.jupiter.api.Test;
import tech.jhipster.pulsarapp.UnitTest;

@UnitTest
class ProtobufDatesReaderTest {

  @Test
  void shouldConvertNullTimestampToNull() {
    assertThat(ProtobufDatesReader.readInstant(null)).isNull();
  }

  @Test
  void shouldConvertDefaultDateToNull() {
    assertThat(ProtobufDatesReader.readInstant(Timestamps.fromDate(new Date(0)))).isNull();
  }

  @Test
  void shouldGetInstantFromTimestampFromDate() {
    Date date = new Date();

    assertThat(ProtobufDatesReader.readInstant(Timestamps.fromDate(date))).isEqualTo(date.toInstant());
  }
}
