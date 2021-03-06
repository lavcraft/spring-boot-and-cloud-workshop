package ru.spring.ripper.examinator.domain;

import lombok.*;

import java.util.List;

/**
 * @author tolkv
 * @version 29/10/2017
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Examine {

  String title;

  @Singular
  List<Section> sections;

}
