package annotation_basics;

import annotation_basics.field_annotation.FieldAnnotated;
import annotation_basics.field_annotation.FieldAnnotation;

@FieldAnnotated
public class DataClass {

    @FieldAnnotation(definition = "X coordinate")
    private Integer dataPointX;
    @FieldAnnotation(definition = "Y coordinate")
    private Integer dataPointY;

    private DataClass(Integer x, Integer y){
        dataPointX = x;
        dataPointY = y;
    }

    public Integer getDataPointX() {
        return dataPointX;
    }

    public Integer getDataPointY() {
        return dataPointY;
    }
}
