package com.pecuaria.application.repository;

import com.pecuaria.application.model.UserEntity;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//contratro do banco --> espelha no Banco
@Repository
public interface UserRepository extends JpaRepository <UserEntity,Long> {
//Mapeando a Entidade e o tipo da chave Primaria dessa entidade


}
