-- DELETE FROM tb_pessoa WHERE cod_pessoa = 5;

-- INSERT INTO tb_pessoa(nome, fone, email)
-- VALUES
-- ('Pedro', '678966789', 'pedro@gmail.com'),
-- ('Marcos', '123546453', 'marcos@gmail.com');

-- UPDATE tb_pessoa SET nome = 'Ana maria'
-- WHERE cod_pessoa = 1;

-- -- plojeção
-- SELECT * FROM tb_pessoa
-- ORDER BY cod_pessoa DESC;

-- -- cláusura where
-- SELECT nome, email FROM tb_pessoa WHERE cod_pessoa = 1 OR cod_pessoa = 5;

-- CREATE TABLE tb_pessoa(
--     cod_pessoa SERIAL PRIMARY KEY,
--     nome VARCHAR(30) NOT NULL,
--     fone VARCHAR(11) NOT NULL,
--     email VARCHAR(200) NULL
-- );