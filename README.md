Mastering Version Control: An
Introduction to Git
Comandos de Configuração e Inicialização
• git init: Cria um novo repositório Git (a pasta oculta .git) no diretório atual.
• git config --local user.name "Nome": Define o nome do responsável pelas
operações no repositório local.
• git config --local user.email "email@exemplo.com": Define o e-mail do
responsável no repositório local.
• git config --global core.editor "code --wait": Configura o VS Code como
editor padrão para mensagens de commit, esperando o fechamento do
arquivo para confirmar a operação.
• git config --global init.defaultBranch main: Define "main" como o nome
padrão para a branch inicial em novos repositórios.
• git config --list: Exibe todas as configurações realizadas.
• git config --list --show-origins: Mostra as configurações e a origem de
onde cada uma foi definida.
Comandos de Fluxo de Trabalho Local (Estados
dos Arquivos)
O Git gerencia arquivos através de estados específicos:
1. 2. 3. 4. 5. 6. 7. Untracked: Arquivo no diretório, mas não controlado pelo Git.
Tracked (Unmodified): Arquivo controlado e igual à última versão salva.
Tracked (Modified): Arquivo controlado, mas com edições em relação
ao último commit.
Tracked (Staged): Arquivo pronto para ser incluído no próximo commit.
git status: Exibe o estado atual dos arquivos no diretório de trabalho.
git status -s: Exibe o estado de forma enxuta/curta.
git add <arquivo>: Transporta o arquivo para o estado Staged.
8. git commit: Torna as alterações no estado Staged permanentes, abrindo
o editor para a mensagem.
9. git commit -m "mensagem": Realiza o commit diretamente com a
mensagem informada.
10. git commit -a: Atalho que adiciona arquivos modificados ao commit sem
precisar usar o git add explicitamente (ignora o estado Staged manual
para arquivos já rastreados).
11. git diff: Mostra o conteúdo modificado no arquivo que ainda não foi para
o estado Staged.
12. git rm: Comando ilustrado no diagrama para mover um arquivo do
estado rastreado (Tracked) para não rastreado (Untracked).
Comandos de Histórico e Visualização
• git log: Lista os commits realizados.
• git log -p: Mostra o histórico de commits incluindo o código contido
(patch) em cada um.
• git log --pretty=oneline: Exibe o histórico de forma simplificada, com um
commit por linha.
Gerenciamento de Versões (Tags e Semântica)
Tags marca versões "entregáveis" seguindo o padrão de Major, Minor e Patch
(ex: v1.0.0).
• git tag -a <nome_tag> -m "mensagem": Cria uma tag anotada, que
destaca um commit como especial e inclui autor, data e mensagem.
• git tag --list ou git tag: Lista as tags criadas.
• git show <nome_tag>: Exibe os detalhes de uma tag específica
