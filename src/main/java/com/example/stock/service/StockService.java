package com.example.stock.service;

import com.example.stock.domain.Stock;
import com.example.stock.repository.StockRepository;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public void decrease(Long id, Long quantity) {
        // Stock 조회
        // 재고 감소시킨뒤
        // 갱신된 값을 저장

        Stock stock = stockRepository.findById(id).orElseThrow();
        stock.decrease(quantity);

        // 즉시 flush() 호출 → DB에 SQL을 날림
        stockRepository.saveAndFlush(stock);
    }
}
