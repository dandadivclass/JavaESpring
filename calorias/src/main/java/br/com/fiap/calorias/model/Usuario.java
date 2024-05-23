package br.com.fiap.calorias.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TBL_USUARIOS")
@Getter  // lombok criando métodos get
@Setter  // métodos set
@NoArgsConstructor  // construtor default
@AllArgsConstructor // construtor com todos os atributos
@EqualsAndHashCode  // método equals e hashcode
public class Usuario {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_USUARIOS"
    )
    @SequenceGenerator(
            name = "SEQ_USUARIOS",
            sequenceName = "SEQ_USUARIOS",
            allocationSize = 50
    )
    @Column(name = "usuario_id")
    private Long usuarioId;

    private String nome;
    private String email;
    private String senha;

}