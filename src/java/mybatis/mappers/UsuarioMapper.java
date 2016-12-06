/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybatis.mappers;

/**
 *
 * @author bruno
 */
public interface UsuarioMapper {
        public void login(String email, String password); 
        public void registroUsuario(String nombre, String email, String password);     
}
