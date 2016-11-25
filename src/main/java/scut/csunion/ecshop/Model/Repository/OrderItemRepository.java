package scut.csunion.ecshop.Model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import scut.csunion.ecshop.Model.Entity.OrderItemEntity;

/**
 * Created by zijun on 16-11-24.
 */
public interface OrderItemRepository extends JpaRepository<OrderItemEntity, Integer> {
}
