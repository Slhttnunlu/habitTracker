package org.habit.habittranckerv2.repository;

import org.habit.habittranckerv2.model.Habit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitRepository extends JpaRepository<Habit, Integer> {}
