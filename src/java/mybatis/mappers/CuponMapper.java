/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybatis.mappers;

import java.util.Date;
import java.util.List;
import pojos.Cupon;
import pojos.Mensaje;
import pojos.Oferta;

/**
 *
 * @author bruno
 */
public interface CuponMapper {
            public List<Cupon> cuponesByIdusuario(Integer idUsuario);
            public Mensaje generaCupon(Integer idUsuario, Integer idOferta);
            

    
}
