@Entity
public class Compartilhamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "lista_id", nullable = false)
    private Lista lista;
    
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private NivelAcesso nivelAcesso;
    
    public enum NivelAcesso {
        VISUALIZADOR, COLABORADOR, ADMINISTRADOR
    }
    
    // Getters e Setters
}
