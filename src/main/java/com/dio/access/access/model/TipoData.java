package com.dio.access.access.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class TipoData {
    private Long id;
    private String descricao;
}