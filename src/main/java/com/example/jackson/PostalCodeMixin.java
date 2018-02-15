package com.example.jackson;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using =PostalCodeSerializer.class)
interface PostalCodeMixin {
}
