package annotation_basics;

import annotation_basics.field_annotation.FieldAnnotationReader;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

public class FieldAnnotationReaderTest {

    private boolean testFieldStr(Optional<List<String>> fields, String defStr){
        if (fields.isEmpty()) return false;
        return fields.get().stream().filter(str -> str.contains(defStr)).count() == 1;
    }
    @Test
    public void testReader(){
        Optional<List<String>> fields = FieldAnnotationReader.getFieldAnnotations(DataClass.class);
        assert(testFieldStr(fields, "X coordinate"));
        assert(testFieldStr(fields, "Y coordinate"));
    }
}
