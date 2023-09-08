package com.AJ.Springbootbookseller.Service;

import com.AJ.Springbootbookseller.Model.PurchaseHistory;
import com.AJ.Springbootbookseller.Repository.IPurchaseHistoryRepository;
import com.AJ.Springbootbookseller.Repository.Projection.IPurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseHistoryServiceImpl implements IPurchaseHistoryService{
    private final IPurchaseHistoryRepository purchaseHistoryRepository;

    public PurchaseHistoryServiceImpl(IPurchaseHistoryRepository purchaseHistoryRepository) {
        this.purchaseHistoryRepository = purchaseHistoryRepository;
    }

    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory){
        purchaseHistory.setPurchaseTime(LocalDateTime.now());

        return purchaseHistoryRepository.save(purchaseHistory);
    }

    public List<IPurchaseItem> findPurchaseItemOfUser(long userid){
        return purchaseHistoryRepository.findAllPurchaseOfUser(userid);
    }
}
