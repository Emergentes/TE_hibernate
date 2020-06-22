/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class ConsultaAnuncios {
    Session session = null;
    
    public ConsultaAnuncios(){
        this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List getAnuncios(){
        List<Anuncios> anuncios = null;
        try{
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("From Anuncios as anuncios");
            anuncios = (List<Anuncios>) q.list();
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
        return anuncios;
    }
    
}
