package com.adopethub;
import com.adopethub.domain.*;
import com.adopethub.service.AdocaoService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdocaoServiceTest {
    @Test
    void deveExigirAprovacaoDuplaParaHistoricoRuim() {
        AdocaoService service = new AdocaoService();
        Animal animal = new Animal(1, "Bidu");
        Usuario usuario = new Usuario(1, "Maria", true); // Tem histórico

        SolicitacaoAdocao solicitacao = service.criarSolicitacao(animal, usuario);
        
        // Primeira aprovação - não deve ser suficiente
        service.avaliarSolicitacao(solicitacao, true);
        assertEquals(StatusSolicitacao.PENDENTE, solicitacao.getStatus());
        assertEquals(StatusAnimal.EM_ANALISE, animal.getStatus());

        // Segunda aprovação - agora sim
        service.avaliarSolicitacao(solicitacao, true);
        assertEquals(StatusSolicitacao.APROVADA, solicitacao.getStatus());
        assertEquals(StatusAnimal.ADOTADO, animal.getStatus());
    }
}
