package com.scii.codeKaraoke.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import java.util.List;

@Data
@AllArgsConstructor
public class KaraokeLyricsResponse extends RepresentationModel<KaraokeLyricsResponse> {

    private List<String> lyrics;
}
