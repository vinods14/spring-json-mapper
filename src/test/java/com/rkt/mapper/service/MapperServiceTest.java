package com.rkt.mapper.service;

import com.rkt.mapper.model.MetaField;
import com.rkt.mapper.model.MetaFields;
import com.rkt.mapper.model.Root;
import com.rkt.mapper.util.MapperUtil;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class MapperServiceTest {

    private MapperService mapperService;

    @BeforeEach
    void setUp() {
        MapperUtil util = new MapperUtil();
        mapperService = new MapperService(util);
    }

    @Test
    void getObjectAsString() {
        MetaField nameField = MetaField.builder().name("name").value("John").build();
        MetaField ageField = MetaField.builder().name("age").value("20").build();
        MetaFields metaFields = MetaFields.builder().metaField(Arrays.asList(nameField, ageField)).build();
        Root root = Root
                .builder()
                .test("32")
                .metaFields(metaFields)
                .build();
        String objectAsString = mapperService.getObjectAsString(root);
        assertNotNull(objectAsString);
    }
}