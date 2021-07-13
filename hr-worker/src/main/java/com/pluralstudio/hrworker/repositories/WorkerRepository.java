package com.pluralstudio.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralstudio.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
