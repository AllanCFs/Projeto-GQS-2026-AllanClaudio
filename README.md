# Adopet HUB 🐾

**Resumo:** O Adopet HUB é um sistema de adoção e apadrinhamento de pets focado em otimizar a gestão de ONGs. Ele substitui planilhas desorganizadas por uma plataforma centralizada que conecta doadores, adotantes e animais, garantindo um fluxo de adoção seguro e rastreável.

**Problema que resolve e Público-alvo:** ONGs de proteção animal perdem muito tempo com gestão manual e planilhas, dificultando o rastreio de adoções e histórico de adotantes. O público-alvo são os administradores dessas ONGs, adotantes e padrinhos.

**Funcionalidades:**
1. Cadastrar animal (foto, idade, necessidades).
2. Cadastrar usuário (adotante/padrinho).
3. Criar solicitação de adoção.
4. Atualizar status da adoção (Aprovar/Rejeitar).
5. Listar/Filtrar animais disponíveis.
6. Gerar relatório de adoções do mês.

**Regra de Negócio Principal:** Um animal só pode ser solicitado se estiver "Disponível". Adotantes com histórico de devolução de pets exigem aprovação dupla da diretoria da ONG.

**Tecnologias:** Java 17, Maven, JUnit 5, Cucumber.
**Como executar:** 1. Clone o repositório.
2. Importe o projeto Maven na sua IDE.
3. Execute a classe `com.adopethub.ui.Main`.
**Como rodar testes:** Execute `mvn test` ou rode as classes de teste direto na IDE.
