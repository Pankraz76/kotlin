package lab;

import com.google.common.collect.ImmutableList;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Singular;


@Builder(setterPrefix = "with")
@Data
@Getter
public class ClassWithBuilder {
    @Singular
    private ImmutableList<Integer> stars;
}
