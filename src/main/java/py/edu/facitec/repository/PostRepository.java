package py.edu.facitec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import py.edu.facitec.model.Post;
import py.edu.facitec.model.Suscrito;

														//entidad,  tipon de dato del pk
public interface PostRepository  extends JpaRepository<Post,Long>{

}
