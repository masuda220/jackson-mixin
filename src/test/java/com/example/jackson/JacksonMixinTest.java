package com.example.jackson;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

public class JacksonMixinTest {
    @Test
    public void mixin() throws IOException {
        PostalCode postalCode = new PostalCode("107", "0061");
        Address address = new Address("Hyderabad",  "Telangana", postalCode);

        mapper.addMixIn(PostalCode.class, PostalCodeMixin.class);
        final String json = mapper.writeValueAsString(address);
        System.out.println("json");
        System.out.println(json);
    }

    private static final ObjectMapper mapper ;
    static
    {
        mapper = new ObjectMapper();
        mapper.setVisibility(mapper.getSerializationConfig()
                .getDefaultVisibilityChecker()
                .withFieldVisibility(JsonAutoDetect.Visibility.ANY)
                .withGetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withSetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withCreatorVisibility(JsonAutoDetect.Visibility.NONE));
    }
}
