package com.example.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class PostalCodeSerializer extends JsonSerializer<PostalCode> {
    @Override
    public void serialize(
            PostalCode value,
            JsonGenerator generator,
            SerializerProvider provider) throws IOException, JsonProcessingException {
        generator.writeString(value.asText());
    }
}
