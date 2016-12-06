/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import mybatis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import pojos.Oferta;
import pojos.Mensaje;


/**
 * REST Web Service
 *
 * @author bruno
 */
@Path("ofertas")
public class OfertasWS {
    
    @Path("byidcategoria/{idcategoria}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Oferta> getOfertasByIdcategoria(
    @PathParam("idcategoria") Integer idcategoria){
        List<Oferta> list =null;
        SqlSession conn =MyBatisUtil.getSession();
        if(conn!=null){
            try{
                list=conn.selectList("Oferta.getOfertasByIdcategoria", idcategoria);
            }catch(Exception ex){
                ex.printStackTrace();
            }finally{
                conn.close();
            }
        }           
        return list;
    }
    @Path("byciudad/{idciudad}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Oferta> getOfertasByCiudad(
    @PathParam("idciudad") Integer idciudad){
        List<Oferta> list =null;
        SqlSession conn =MyBatisUtil.getSession();
        if(conn!=null){
            try{
                list=conn.selectList("Oferta.getOfertasByCiudad", idciudad);
            }catch(Exception ex){
                ex.printStackTrace();
            }finally{
                conn.close();
            }
        }           
        return list;
    }
    @Path("allbd")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Oferta> getAllOfertas(
    ){
        List<Oferta> list =null;
        SqlSession conn =MyBatisUtil.getSession();
        if(conn!=null){
            try{
                list=conn.selectList("Oferta.getAllOfertas");
            }catch(Exception ex){
                ex.printStackTrace();
            }finally{
                conn.close();
            }
        }           
        return list;
    }
    

  
}
