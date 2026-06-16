# Roteiros de Teste Manual

| ID | Cenário | Passos | Resultado Esperado | Status |
|---|---|---|---|---|
| RT01 | Adoção de pet disponível | 1. Logar 2. Escolher pet "Disponível" 3. Solicitar | Solicitação criada e status vai para "Em Análise" | OK |
| RT02 | Adoção com histórico de devolução | 1. Logar (com flag true) 2. Solicitar pet | Sistema exige `aprovacaoDupla` = true | OK |
| RT03 | Adoção de pet já adotado | 1. Escolher pet "Adotado" 2. Solicitar | Erro: "Animal não está disponível" | OK |
| RT04 | Aprovar adoção simples | 1. Admin acessa solicitação 2. Clica "Aprovar" | Status do pet vai para "Adotado" | OK |
| RT05 | Rejeitar adoção | 1. Admin acessa solicitação 2. Clica "Rejeitar" | Status do pet volta para "Disponível" | OK |
