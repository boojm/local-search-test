package boojongmin.localsearch.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class KeywordCountModel {
    String keyword;
    long count;
}
