package com.scii.codeKaraoke.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class KaraokeRequest {

    private String code;
    private String genre;
    private String language;
    private String voiceType;
}
