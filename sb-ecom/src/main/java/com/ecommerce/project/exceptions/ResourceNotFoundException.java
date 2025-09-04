package com.ecommerce.project.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    String resourceName;
    String Field;
    String FieldName;
    Long FieldId;

    public ResourceNotFoundException() {
    }

    public ResourceNotFoundException(String resourceName, String field, String fieldName) {
        super(String.format("%s not found with %s : %s", resourceName, field, fieldName));
        this.resourceName = resourceName;
        this.Field = field;
        this.FieldName = fieldName;
    }

    public ResourceNotFoundException(String resourceName, String field, Long fieldId) {
        super(String.format("%s not found with %s : %s", resourceName, field, fieldId));
        this.resourceName = resourceName;
        Field = field;
        FieldId = fieldId;
    }
}
