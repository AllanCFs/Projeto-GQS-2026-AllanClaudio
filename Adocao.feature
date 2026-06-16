# language: pt
Funcionalidade: Processo de Adoção e Regras de Restrição

  Cenário: Adoção simples bem sucedida
    Dado que o animal "Totó" está DISPONIVEL
    E o usuário "Carlos" não tem histórico de devolução
    Quando "Carlos" solicita a adoção de "Totó"
    E a diretoria aprova a solicitação 1 vez
    Então o status da solicitação deve ser APROVADA
    E o status do animal deve ser ADOTADO

  Cenário: Usuário com histórico exige duas aprovações
    Dado que o animal "Bolinha" está DISPONIVEL
    E o usuário "Ana" tem histórico de devolução
    Quando "Ana" solicita a adoção de "Bolinha"
    E a diretoria aprova a solicitação 1 vez
    Então o status da solicitação deve continuar PENDENTE

  Cenário: Rejeitar solicitação
    Dado que o animal "Mel" está DISPONIVEL
    E o usuário "Pedro" não tem histórico de devolução
    Quando "Pedro" solicita a adoção de "Mel"
    E a diretoria rejeita a solicitação
    Então o status da solicitação deve ser REJEITADA
    E o status do animal deve ser DISPONIVEL

  Cenário: Falha ao solicitar animal já adotado
    Dado que o animal "Rex" está ADOTADO
    E o usuário "Marcos" não tem histórico de devolução
    Quando "Marcos" tenta solicitar a adoção de "Rex"
    Então o sistema deve retornar um erro

  Cenário: Concluir aprovação dupla
    Dado que o animal "Bolinha" está DISPONIVEL
    E o usuário "Ana" tem histórico de devolução
    Quando "Ana" solicita a adoção de "Bolinha"
    E a diretoria aprova a solicitação 2 vezes
    Então o status da solicitação deve ser APROVADA
