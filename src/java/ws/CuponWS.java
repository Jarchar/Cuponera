/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import mybatis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import pojos.Cupon;
import pojos.Mensaje;
import pojos.Oferta;
import pojos.Usuario;

/**
 * REST Web Service
 *
 * @author bruno
 */
@Path("cupones")
public class CuponWS {
    @Path("byidusuario/{idusuario}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cupon> cuponesByIdusuario(
    @PathParam("idusuario") Integer idsuario){
        List<Cupon> list =null;
        SqlSession conn =MyBatisUtil.getSession();
        if(conn!=null){
            try{
                list=conn.selectList("Cupon.cuponesByIdusuario", idsuario);
            }catch(Exception ex){
                ex.printStackTrace();
            }finally{
                conn.close();
            }
        }           
        return list;
    }
    
    @POST
    @Path("generacupon")
    @Produces(MediaType.APPLICATION_JSON)
    public Mensaje generaCupon(
            @FormParam("idusuario") Integer idusuario,
            @FormParam("idoferta") Integer idoferta
         ){
        Mensaje resultado;
        long time = System.currentTimeMillis();
        Date fechacreacion = new Date(time);
        Cupon c=new Cupon(idusuario, fechacreacion, idoferta);
        SqlSession conn = MyBatisUtil.getSession();
        try{
            conn.insert("Cupon.generaCupon",c);
            conn.commit();
            resultado=new Mensaje("Cupon creado exitosamente", false);
        }catch(Exception ex){
            resultado=new Mensaje(ex.getMessage(),true);
        }finally{
            conn.close();
        }
        return resultado;
        
    }


    

}
