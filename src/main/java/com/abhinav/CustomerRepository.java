package com.abhinav;

import org.springframework.data.jpa.repository.JpaRepository;
// Since we have this repository we can inject whatever class we need and it will have superpowers
// Because it'll become the Interface to perform CRUD operations Create, Read, Update and Delete
public interface CustomerRepository extends JpaRepository<Customer,Integer> {//<database, databaseID>

}
