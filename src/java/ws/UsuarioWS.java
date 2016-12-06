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
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import mybatis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import pojos.Mensaje;
import pojos.Usuario;

/**
 *
 * @author bruno
 */
@Path("usuario")
public class UsuarioWS {
    @POST
    @Path("registro")
    @Produces(MediaType.APPLICATION_JSON)
    public Mensaje registroUsuario(
            @FormParam("telefono") String telefono,
            @FormParam("email") String email,
            @FormParam("password") String password

         ){
        Mensaje resultado;
        Usuario c=new Usuario(telefono,email, password);
        SqlSession conn = MyBatisUtil.getSession();
        try{
            conn.insert("Usuario.registroUsuario",c);
            conn.commit();
            resultado=new Mensaje("Usuario registrado exitosamente", false);
        }catch(Exception ex){
            resultado=new Mensaje(ex.getMessage(),true);
        }finally{
            conn.close();
        }
        return resultado;
        
    }
 
    @POST
    @Path("login")
    @Produces(MediaType.APPLICATION_JSON)
    public Object login(
            @FormParam("email") String email,
            @FormParam("password") String password

         ){
        Mensaje resultado;
        Usuario c=new Usuario(null,email, password);
        SqlSession conn = MyBatisUtil.getSession();
        try{
            conn.selectOne("Usuario.login",email);
            conn.commit();
            resultado=new Mensaje("Usuario registrado exitosamente", false);
        }catch(Exception ex){
            resultado=new Mensaje(ex.getMessage(),true);
        }finally{
            conn.close();
        }
        return resultado;
        
    }
}
