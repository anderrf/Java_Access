package com.dio.access.access.model;

import lombok.*;

import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Localidade {
    private Long id;
    @OneToMany
    private NivelAcesso nivelAcesso;
    private String descricao;
}
