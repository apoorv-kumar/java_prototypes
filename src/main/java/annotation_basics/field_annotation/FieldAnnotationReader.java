package annotation_basics.field_annotation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FieldAnnotationReader {
    public static Optional<List<String>> getFieldAnnotations(Class C){
        if (C.isAnnotationPresent(FieldAnnotated.class)){
            return Optional.of(
                    Arrays.stream(C.getDeclaredFields())
                            .filter(field -> field.isAnnotationPresent(FieldAnnotation.class))
                            .map(field -> field.getAnnotation(FieldAnnotation.class))
                            .map(FieldAnnotation::definition)
                            .collect(Collectors.toList())
            );
        } else {
            return Optional.empty();
        }
    }

}
