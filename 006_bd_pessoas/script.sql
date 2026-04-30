SELECT * FROM tb_pessoa;
-- INSERT INTO tb_pessoa
-- (nome, fone, email, ativo)
-- VALUES
-- ('Ana', '77445522', 'ana@email.com', 2);

-- SELECT * FROM tb_pessoa;

-- INSERT INTO tb_pessoa
-- (nome, fone, email)
-- VALUES
-- ('Cristina', '77774444', 'cristina@email.com');


-- como incluir uma coluna chamada ativo com valor padrão = 1
-- ela é do tipo inteiro e só admite valor 0 ou 1
-- ALTER TABLE tb_pessoa
-- ADD COLUMN ativo INTEGER DEFAULT 1
-- CHECK (ativo IN (0, 1));

-- SELECT * FROM tb_pessoa;

-- DELETE FROM tb_pessoa
-- WHERE nome = 'Maria';


--projeção
-- SELECT nome, email FROM tb_pessoa
-- WHERE cod_pessoa IN (2, 3);

-- SELECT nome, email FROM tb_pessoa
-- WHERE cod_pessoa = 2 OR cod_pessoa = 3;

-- UPDATE tb_pessoa SET
-- nome = 'José da Silva'
-- WHERE cod_pessoa = 1;


-- SELECT * FROM tb_pessoa;


-- INSERT INTO tb_pessoa
-- (nome, fone, email)
-- VALUES
-- ('João', '77447744', 'joao@email.com'),
-- ('Maria', '77887777', 'maria@email.com');


-- SELECT * FROM tb_pessoa;


-- INSERT INTO tb_pessoa
-- (nome, fone, email) 
-- VALUES
-- ('José', '12345678', 'jose@email.com');


-- CREATE TABLE tb_pessoa(
-- 	cod_pessoa SERIAL PRIMARY KEY,
-- 	nome VARCHAR(255),
-- 	fone VARCHAR(255),
-- 	email VARCHAR(255)
-- );