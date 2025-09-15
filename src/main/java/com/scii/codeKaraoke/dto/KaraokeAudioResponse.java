package com.scii.codeKaraoke.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

@Data
@AllArgsConstructor
public class KaraokeAudioResponse extends RepresentationModel<KaraokeAudioResponse> {

    private String audioUrl;
}
