/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybatis.mappers;

import java.util.List;
import pojos.Oferta;

/**
 *
 * @author bruno
 */
public interface OfertaMapper_1 {
        public List<Oferta> getAllOfertas();
        public List<Oferta>getOfertasByIdcategoria(Integer id);
        public List<Oferta>getOfertasByCiudad(Integer id);

    
}
