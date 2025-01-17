package com.idrist.repository;


import com.idrist.entity.Category;
import com.idrist.entity.User;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class CategoryRepository extends RepositoryManager<Category, Long> {
    public CategoryRepository() {super(Category.class);}
        public List<String> getAllParentCategories(){

            TypedQuery<String> query = getEntityManager().createQuery(
                    "SELECT DISTINCT(c.parentCategory) FROM Category c ", String.class);
            return query.getResultList();
        }

        public List<String> getCategoriesByParentName(String parentName) {
            TypedQuery<String> query = getEntityManager().createQuery(
                    "SELECT DISTINCT(c.name) FROM Category c WHERE c.parentCategory =:parentName ", String.class);
            query.setParameter("parentName", parentName);

            return query.getResultList();
        }



}
