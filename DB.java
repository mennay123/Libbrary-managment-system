package pkg;

import javax.persistence.*;
import java.util.List;

public class DB {

	private static final String DB_URL = "$objectdb/db/library.odb";


    // Add Member
    public static void addMember(Member member) {
        //EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(member);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    // Add Staff
    public static void addStaff(Staff staff) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(staff);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    // Add Subscription
    public static void addSubscription(Subscription subscription) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(subscription);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static void add_r_s(Book rs) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(rs);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    // List all Members
    public static List<Member> getAllMembers() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        List<Member> members = em.createQuery("SELECT m FROM Member m", Member.class).getResultList();
        em.close();
        emf.close();
        return members;
    }

    // List all Trainers
// List all Staff members
    public static List<Staff> getAllStaff() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT t FROM Staff t", Staff.class).getResultList();
        } finally {
            em.close();
            emf.close();
        }
    }


    // List all Subscriptions
    public static List<Subscription> getAllSubscriptions() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        List<Subscription> subscriptions = em.createQuery("SELECT s FROM Subscription s", Subscription.class).getResultList();
        em.close();
        emf.close();
        return subscriptions;
    }





    public static List<Book> getAll_r_s() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        try {
            // Use "Book" in the query since that is the entity class name
            List<Book> rs = em.createQuery("SELECT b FROM Book b", Book.class).getResultList();
            return rs;
        } finally {
            em.close();
            emf.close();
        }
    }

}

