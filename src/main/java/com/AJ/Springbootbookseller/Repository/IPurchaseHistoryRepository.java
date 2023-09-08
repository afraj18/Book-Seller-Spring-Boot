package com.AJ.Springbootbookseller.Repository;

import com.AJ.Springbootbookseller.Model.PurchaseHistory;
import com.AJ.Springbootbookseller.Repository.Projection.IPurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPurchaseHistoryRepository extends JpaRepository<PurchaseHistory,Long> {

    @Query("select " +
            "b.title as title,ph.price as price,ph.purchaseTime as purchaseTime " +
            "from PurchaseHistory ph " +
            "left join Book b on b.id = ph.bookid " +
            "where ph.userid= :userId")
    List<IPurchaseItem> findAllPurchaseOfUser(@Param("userId") Long userId);
}
