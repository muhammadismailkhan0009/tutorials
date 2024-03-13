package com.apitrove.springboot_scheduler_demo.configs;

import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;

import com.apitrove.springboot_scheduler_demo.dto.UserName;

public class ApplicationHints implements RuntimeHintsRegistrar{

    @Override
    public void registerHints(RuntimeHints hints, ClassLoader classLoader) {

        // registers serializable record
        hints.serialization().registerType(UserName.class);
    }
    
}
