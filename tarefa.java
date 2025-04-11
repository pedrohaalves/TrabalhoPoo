@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String titulo;
    
    private String descricao;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Prioridade prioridade;
    
    @ManyToOne
    @JoinColumn(name = "lista_id", nullable = false)
    private Lista lista;
    
    @OneToMany(mappedBy = "tarefa", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comentario> comentarios = new ArrayList<>();
    
    public enum Status {
        PENDENTE, EM_PROGRESSO, CONCLUIDO, CANCELADO
    }
    
    public enum Prioridade {
        BAIXA, MEDIA, ALTA
    }
    
    // Getters e Setters
}
