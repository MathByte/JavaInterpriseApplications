import entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public class CanadaCensusJPA {
    public static void main(String[] args) {

        // Connection Initializing
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("CanadaCensus");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        entityManager.getTransaction().begin();

        /* Question 2 */
        System.out.println("QUESTION 2");
        GeographicAreaEntity geographicareaEntity = entityManager.find(GeographicAreaEntity.class, 10);
        System.out.println(geographicareaEntity.toString());

        System.out.println();


        /* Question 3 */
        {
            System.out.println("QUESTION 3");

            CriteriaQuery<GeographicAreaEntity> criteriaQuery = criteriaBuilder.createQuery(GeographicAreaEntity.class);
            Root<GeographicAreaEntity> geographicareaEntityRoot = criteriaQuery.from(GeographicAreaEntity.class);
            Predicate predicate = criteriaBuilder.equal(geographicareaEntityRoot.get("level"), 2);

            criteriaQuery.where(predicate);
            CriteriaQuery<GeographicAreaEntity> whereLevel = criteriaQuery.select(geographicareaEntityRoot);
            TypedQuery<GeographicAreaEntity> whereLevelQuery = entityManager.createQuery(whereLevel);
            whereLevelQuery.getResultList().forEach(geo -> System.out.println(geo.toString()));
        }

        System.out.println();


        /* Question 4 */
        System.out.println("QUESTION 4");
        TypedQuery<TotalIncomeEntity> query2 = entityManager.createNamedQuery("findAllIncome", TotalIncomeEntity.class).setMaxResults(10);
        query2.getResultList().forEach(emp -> System.out.println(emp.toString()));

        System.out.println();


        /* Question 5 */
        System.out.println("QUESTION 5");

        System.out.println();
        {
            System.out.println("\tOne couple census family without other persons in the household");
            CriteriaQuery<HouseholdEntity> criteriaQuery = criteriaBuilder.createQuery(HouseholdEntity.class);
            Root<HouseholdEntity> householdEntityRoot = criteriaQuery.from(HouseholdEntity.class);
            Predicate predicate = criteriaBuilder.equal(householdEntityRoot.get("householdType"), 4);
            criteriaQuery.where(predicate);
            CriteriaQuery<HouseholdEntity> where = criteriaQuery.select(householdEntityRoot);
            TypedQuery<HouseholdEntity> whereQuery = entityManager.createQuery(where);
            System.out.printf("\tAnswer: %d%n", whereQuery.getResultList().size());
        }

        System.out.println();
        {
            System.out.println("\t2 or more members in the household");
            CriteriaQuery<HouseholdEntity> criteriaQuery = criteriaBuilder.createQuery(HouseholdEntity.class);
            Root<HouseholdEntity> householdEntityRoot = criteriaQuery.from(HouseholdEntity.class);
            Predicate predicate = criteriaBuilder.equal(householdEntityRoot.get("householdSize"), 3);
            criteriaQuery.where(predicate);
            CriteriaQuery<HouseholdEntity> where = criteriaQuery.select(householdEntityRoot);
            TypedQuery<HouseholdEntity> whereQuery = entityManager.createQuery(where);
            System.out.printf("\tAnswer: %d%n", whereQuery.getResultList().size());
        }

        System.out.println();
        {
            System.out.println("\tAt least 1 earner in the household");
            CriteriaQuery<HouseholdEntity> criteriaQuery = criteriaBuilder.createQuery(HouseholdEntity.class);
            Root<HouseholdEntity> householdEntityRoot = criteriaQuery.from(HouseholdEntity.class);
            Predicate predicate = criteriaBuilder.equal(householdEntityRoot.get("householdEarners"), 3);
            criteriaQuery.where(predicate);
            CriteriaQuery<HouseholdEntity> where = criteriaQuery.select(householdEntityRoot);
            TypedQuery<HouseholdEntity> whereQuery = entityManager.createQuery(where);
            System.out.printf("\tAnswer: %d%n", whereQuery.getResultList().size());
        }

        System.out.println();
        {
            System.out.println("\tTotal income between $80,000 and $89,900");
            CriteriaQuery<HouseholdEntity> criteriaQuery = criteriaBuilder.createQuery(HouseholdEntity.class);
            Root<HouseholdEntity> householdEntityRoot = criteriaQuery.from(HouseholdEntity.class);
            Predicate predicate = criteriaBuilder.equal(householdEntityRoot.get("totalIncome"), 15);
            criteriaQuery.where(predicate);
            CriteriaQuery<HouseholdEntity> where = criteriaQuery.select(householdEntityRoot);
            TypedQuery<HouseholdEntity> whereQuery = entityManager.createQuery(where);
            System.out.printf("\tAnswer: %d%n", whereQuery.getResultList().size());
        }

        System.out.println();

        /* Question 6 */
        System.out.println("QUESTION 6");
        {
            System.out.println("\tTASK A");
            CriteriaQuery<GeographicAreaEntity> criteriaQuery = criteriaBuilder.createQuery(GeographicAreaEntity.class);
            Root<GeographicAreaEntity> geographicareaEntityRoot = criteriaQuery.from(GeographicAreaEntity.class);
            criteriaQuery.multiselect(
                    geographicareaEntityRoot.get("code"),
                    geographicareaEntityRoot.get("level"),
                    geographicareaEntityRoot.get("name"));

            CriteriaQuery<GeographicAreaEntity> multiSelect = criteriaQuery.select(geographicareaEntityRoot);
            TypedQuery<GeographicAreaEntity> multiSelectQuery = entityManager.createQuery(multiSelect).setMaxResults(10);
            System.out.println("\tAnswer: ");
            multiSelectQuery.getResultList().forEach(
                    geo -> System.out.printf("\t\tCode: %d, Level: %d, Name: %s%n",
                            geo.getCode(),
                            geo.getLevel(),
                            geo.getName())
            );

        }

        System.out.println();
        {
            System.out.println("\tTASK B");
            CriteriaQuery<AgeEntity> criteriaQuery = criteriaBuilder.createQuery(AgeEntity.class);
            Root<AgeEntity> ageEntityRoot = criteriaQuery.from(AgeEntity.class);
            criteriaQuery.orderBy(criteriaBuilder.desc(ageEntityRoot.get("combined")));
            CriteriaQuery<AgeEntity> orderBy = criteriaQuery.select(ageEntityRoot);
            TypedQuery<AgeEntity> orderByQuery = entityManager.createQuery(orderBy).setMaxResults(20);

            System.out.println("\tAnswer: ");
            orderByQuery.getResultList().forEach(
                    age -> System.out.println("\t\tCombined: " + age.getCombined())
            );
        }

        System.out.println();
        {
            System.out.println("\tTASK C");
            CriteriaQuery<GeographicAreaEntity> criteriaQuery = criteriaBuilder.createQuery(GeographicAreaEntity.class);
            Root<GeographicAreaEntity> geographicareaEntityRoot = criteriaQuery.from(GeographicAreaEntity.class);
            Predicate predicate = criteriaBuilder.equal(geographicareaEntityRoot.get("name"), "Peterborough");
            criteriaQuery.where(predicate);
            CriteriaQuery<GeographicAreaEntity> where = criteriaQuery.select(geographicareaEntityRoot);
            TypedQuery<GeographicAreaEntity> whereQuery = entityManager.createQuery(where);

            System.out.println("\tAnswer: ");
            whereQuery.getResultList().forEach(
                    geo -> System.out.println("\t\t" + geo.toString())
            );
        }

        System.out.println();
        {
            System.out.println("\tTASK D");
            CriteriaQuery<TotalIncomeEntity> criteriaQuery = criteriaBuilder.createQuery(TotalIncomeEntity.class);
            Root<TotalIncomeEntity> totalincomeEntityRoot = criteriaQuery.from(TotalIncomeEntity.class);
            Predicate predicate = criteriaBuilder.between(totalincomeEntityRoot.get("id"), 10, 20);
            criteriaQuery.where(predicate);
            CriteriaQuery<TotalIncomeEntity> between = criteriaQuery.select(totalincomeEntityRoot);
            TypedQuery<TotalIncomeEntity> betweenQuery = entityManager.createQuery(between);

            System.out.println("\tAnswer: ");
            betweenQuery.getResultList().forEach(
                    income -> System.out.println("\t\t" + income.toString())
            );
        }

        System.out.println();
        {
            System.out.println("\tTASK E");
            CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);
            Root<GeographicAreaEntity> geographicareaEntityRoot = criteriaQuery.from(GeographicAreaEntity.class);
            criteriaQuery.multiselect(geographicareaEntityRoot.get("level"), criteriaBuilder.count(geographicareaEntityRoot)).groupBy(geographicareaEntityRoot.get("level"));

            System.out.println("\tAnswer: ");
            List<Object[]> list = entityManager.createQuery(criteriaQuery).getResultList();
            for (Object[] obj : list) {
                System.out.println("\t\t" + obj[0] + "  " + obj[1]);
            }
        }
        // Spacer
        System.out.println();
        /* End of TASK 6 */

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
