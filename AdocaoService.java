package com.adopethub.service;
import com.adopethub.domain.*;

public class AdocaoService {
    public SolicitacaoAdocao criarSolicitacao(Animal animal, Usuario usuario) {
        if (animal.getStatus() != StatusAnimal.DISPONIVEL) {
            throw new RuntimeException("Animal não está disponível para adoção.");
        }
        SolicitacaoAdocao solicitacao = new SolicitacaoAdocao(animal, usuario);
        animal.setStatus(StatusAnimal.EM_ANALISE);
        return solicitacao;
    }

    public void avaliarSolicitacao(SolicitacaoAdocao solicitacao, boolean aprovar) {
        if (!aprovar) {
            solicitacao.setStatus(StatusSolicitacao.REJEITADA);
            solicitacao.getAnimal().setStatus(StatusAnimal.DISPONIVEL);
            return;
        }

        solicitacao.adicionarAprovacao();
        
        // REGRA NÃO-TRIVIAL: Se tem histórico ruim, precisa de 2 aprovações
        boolean precisaAprovacaoDupla = solicitacao.getAdotante().temHistoricoDevolucao();
        
        if (precisaAprovacaoDupla && solicitacao.getAprovacoesAdmin() < 2) {
            // Continua pendente aguardando segundo admin
            return; 
        }

        solicitacao.setStatus(StatusSolicitacao.APROVADA);
        solicitacao.getAnimal().setStatus(StatusAnimal.ADOTADO);
    }
}
