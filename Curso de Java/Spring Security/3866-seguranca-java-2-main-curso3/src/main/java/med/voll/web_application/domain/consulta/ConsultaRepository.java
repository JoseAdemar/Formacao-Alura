package med.voll.web_application.domain.consulta;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

    Page<Consulta> findAllByOrderByData(Pageable paginacao);

    Page<DadosListagemConsulta> buscarConsultas(Pageable paginacao, Long id);
}
