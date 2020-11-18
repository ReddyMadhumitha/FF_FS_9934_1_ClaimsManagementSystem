/**
 * 
 */
package com.hcl.claimsmanagementsystem.repository;

import java.sql.Connection; 
import java.sql.DriverManager;
//import java.sql.PreparedStatement; 
//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.util.List;

import javax.persistence.Query;
import javax.validation.Valid;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.hcl.claimsmanagementsystem.model.ClaimRequest;
import com.hcl.claimsmanagementsystem.model.Credential;
import com.hcl.claimsmanagementsystem.model.Payment;
import com.hcl.claimsmanagementsystem.model.User;
import com.hcl.claimsmanagementsystem.model.UserDetails;
import com.hcl.claimsmanagementsystem.util.HibernateUtil;

/**
 * This class  is used for registering the user,profile of the user,
 *claimrequest of the user,payment of the user and login for the credential
 * @author reddy-madhumitha
 *
 */
@Repository
public class UserDaoImpl implements UserDao {
	static Connection conn = null;
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Claims_Management_System", "root", "root");
		} catch (Exception e) {
			System.out.println("Error occured during connection creation " + e);
		}
	}

	public boolean register(@Valid User user) {
			Session session = HibernateUtil.getSessionFactory().openSession(); 
	         session.beginTransaction(); 
	         User usr = new User();
	         usr.setUserId((user.getUserId()));
	         usr.setPassword(user.getPassword());
	         usr.setRoleId(user.getRoleId());
	         if(user.getRoleId()==2)
	         	usr.setStatus("Approved");
	         usr.setStatus("Pending");
	         int i =(Integer) session.save(usr);
	         System.out.println(i);
	      
	         session.getTransaction().commit();
	         HibernateUtil.shutdown(); 
	         if(i>0) {
	             return false;
	         }
	  
			return true;
		
	}
	public boolean profile(@Valid UserDetails user) {
		Session session = HibernateUtil.getSessionFactory().openSession(); 
        session.beginTransaction(); 
        try {
            session.save(user);
        } catch (Exception e) {
            return false;
        }
        session.getTransaction().commit();
        HibernateUtil.shutdown();
        return true;

	}
	public boolean claimRequest(@Valid ClaimRequest user) {
		Session session = HibernateUtil.getSessionFactory().openSession(); 
        session.beginTransaction();
		 try {
	            session.save(user);
	        } catch (Exception e) {
	            return false;
	        }
	        session.getTransaction().commit();
	        HibernateUtil.shutdown();
	        return true;

	}
	public boolean payment(@Valid Payment user) {
		Session session = HibernateUtil.getSessionFactory().openSession(); 
        session.beginTransaction();
        try {
            session.save(user);
        } catch (Exception e) {
            return false;
        }
        session.getTransaction().commit();
        HibernateUtil.shutdown();
        return true;
	}

	public String login(Credential credential) {
		Session session = HibernateUtil.getSessionFactory().openSession(); 
        session.beginTransaction();
        String sqlQuery = "from User as a where a.userId=?0 and a.password=?1 and roleId=1";
        String sqlQuery2 = "from User as a where a.userId=?0 and a.password=?1 and roleId=2";
        Query query = session.createQuery(sqlQuery);
        query.setParameter(0, credential.getUserId());
        query.setParameter(1, credential.getPassword());
        List list = ((org.hibernate.query.Query) query).list();
        Query query2 = session.createQuery(sqlQuery2);
        query2.setParameter(0, credential.getUserId());
        query2.setParameter(1, credential.getPassword());
        List list2 = ((org.hibernate.query.Query) query2).list();
        session.getTransaction().commit();
        HibernateUtil.shutdown();
        if((list.size()>0))
        	return "Member";
        else if((list2.size()>0))
        	return "Admin";
        else
        	return "Failed";
	}
	
}
