package org.habit.habittranckerv2.repository;

import org.habit.habittranckerv2.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {
}
