import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Objects;

public class Flattener{

  public List<Object> flatten(List<Object> value) { 
    return value.stream().flatMap(this::getValue).filter(Objects::nonNull).collect(Collectors.toList());
  }

  private Stream<Object> getValue(Object element) {
    return (!(element instanceof List)) ? Stream.of(element) : ((List<Object>)element).stream().flatMap(this::getValue);
  }

}
