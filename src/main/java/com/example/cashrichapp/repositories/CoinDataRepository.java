package com.example.cashrichapp.repositories;

import com.example.cashrichapp.model.CoinData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoinDataRepository extends JpaRepository<CoinData,Long> {
    List<CoinData> findByUserId(Long userId);
}
