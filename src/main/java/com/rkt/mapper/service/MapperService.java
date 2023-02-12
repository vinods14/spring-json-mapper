package com.rkt.mapper.service;

import com.rkt.mapper.model.Root;
import com.rkt.mapper.util.MapperUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class MapperService {
    private final MapperUtil util;

    public String getObjectAsString(Root root) {
        try {
            return util.getObjectAsString(root);
        } catch (Exception ex) {
            log.error("MapperService : {}", ex.getMessage());
        }
        return null;
    }
}
